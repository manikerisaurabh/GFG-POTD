public class 27-Mar {
    static int[][] dirs = {{-1,0},{1, 0}, {0,-1}, {0,1}};
    public static int findShortestPath(int[][] mat) {
        // code here
        int rows = mat.length;
        int cols = mat[0].length;
        markLandmines(mat, rows, cols);
        int minLen = Integer.MAX_VALUE;
        boolean[][] visited = new boolean[rows][cols];
        int[][] dp = new int[rows+1][cols+1];
        for(int i=0; i<=rows; i++){
            for(int j=0; j<=cols; j++){
                dp[i][j] = -1;
            }
        }
        for(int i=0; i<rows; i++){
            if(mat[i][0] == 1){
                minLen = Math.min(minLen, solve(mat, visited, dp, rows, cols, i, 0));
            }
        }
        
        return minLen == Integer.MAX_VALUE ? -1 : minLen;
    }
    
    private static void markLandmines(int[][] mat, int rows, int cols){
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(mat[i][j] == 0){
                    for(int[] dir : dirs){
                        int row = i + dir[0];
                        int col = j + dir[1];
                        if(!(row < 0 || row >= rows || col < 0 || col >= cols) && mat[row][col] != 0){
                            mat[row][col] = 2;
                        }
                    }
                }
            }
        }
        
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(mat[i][j] == 2){
                    mat[i][j] = 0;
                }
            }
        }
    }
    
    private static int solve(int[][] mat, boolean[][] visited, int[][] dp, int rows, int cols, int r, int c){
        if(c == cols-1){
            return 1;
        }
        if(dp[r][c] != -1){
            return dp[r][c];
        }
        visited[r][c] = true;
        int minLen = Integer.MAX_VALUE;
        for(int[] dir : dirs){
            int row = r + dir[0];
            int col = c + dir[1];
            if(!(row < 0 || row >= rows || col < 0 || col >= cols) && mat[row][col] == 1 && !visited[row][col]){
                minLen = Math.min(minLen, solve(mat, visited, dp, rows, cols, row, col));
            }
        }
        
        visited[r][c] = false;
        return dp[r][c] = (minLen == Integer.MAX_VALUE ? Integer.MAX_VALUE : minLen+1);
        
    }
}
