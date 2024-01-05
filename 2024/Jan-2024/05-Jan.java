public class 05-Jan {

    private static final int MOD = 1000000007;
    public int TotalWays(int N)
    {
         long curr, prev, next;
        curr = prev = 1;

        for (int i = 1; i <= N; ++i) {
            next = (curr + prev) % MOD;
            prev = curr;
            curr = next;
        }

        return (int) ((curr * curr) % MOD);
    }
}