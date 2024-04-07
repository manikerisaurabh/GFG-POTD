public class 07-Apr {

    public int maxDotProduct(int n, int m, int a[], int b[]) 
	{ 
		// Your code goes here
        int[][] dp = new int[n+1][m+1];
        for(int i = 0; i < m; i++){
            dp[n][i] = Integer.MIN_VALUE;
        }
        for(int i = n-1; i>=0; i--){
            for(int j = m - 1; j >= 0; j--){
                int take = a[i]*b[j] + dp[i+1][j+1];
                int notake = dp[i+1][j];
                dp[i][j] =  Math.max(take, notake);
            }
        }
        return dp[0][0];
	} 
}