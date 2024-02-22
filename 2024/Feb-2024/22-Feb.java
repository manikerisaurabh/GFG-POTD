public class 22-Feb {

    int mod = (int) (1e9 + 7);
    int[][] dp;
    int m,n;
    int helper(int i,int j,char[] s,char[] t){
        
        if(j==n) {
            return 1;
        }
        if(i==m) {
            return 0;
        }
        if(dp[i][j]!=-1) {
            return dp[i][j];
        } 
        if(s[i]==t[j]){
            return dp[i][j] = (helper(i+1,j+1,s,t)+helper(i+1,j,s,t))%mod;
        }
        return dp[i][j] = helper(i+1,j,s,t);
    }
    
    int  subsequenceCount(String s, String t)
    {
	// Your code here
	    m = s.length();
	    n = t.length();
	    dp = new int[m][n];
	    for(int i=0;i<m;i++)Arrays.fill(dp[i],-1);
	    return helper(0,0,s.toCharArray(),t.toCharArray());
    }
}