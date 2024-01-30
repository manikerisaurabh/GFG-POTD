public class 30-Jan {

    int LCSof3(String a, String b, String c, int n, int m, int k) { 
        // code here
        int[][][] dp=new int[n+1][m+1][k+1];
 
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++) {
                for(int p=1;p<=k;p++) {
                    if(a.charAt(i-1)==b.charAt(j-1) && b.charAt(j-1)==c.charAt(p-1)) {
                        dp[i][j][p]=1+dp[i-1][j-1][p-1];
                    }else {
                        dp[i][j][p]=Math.max(dp[i-1][j][p],Math.max(dp[i][j-1][p],dp[i][j][p-1]));
                    }
                }
            }
        }
        return dp[n][m][k];
    }
}