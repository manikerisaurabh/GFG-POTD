public class 26-June {
    static int m;
    static int n;
    public static boolean check(int rows,int col,int[][]matrix){
        if(rows<m && rows>=0 && col<n && col>=0 && matrix[rows][col]==1) return true;
        return false;
        
    }
    public int findCoverage(int[][] matrix) {
        // code here
        m=matrix.length;
        n=matrix[0].length;
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    if(check(i+1,j,matrix))count++;
                    if(check(i-1,j,matrix))count++;
                    if(check(i,j+1,matrix))count++;
                    if(check(i,j-1,matrix))count++;
                    
                    
                }
            }
        }
        return count;
    }
}
