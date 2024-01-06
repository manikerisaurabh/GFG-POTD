public class 06-Jan {

    public static long primePowers(long n) {
        long cnt = 0;
        for (long i = 2; i <= Math.sqrt(n); i++) {
            while (n % i == 0) {
                cnt++;
                n = n / i;
            }
        }

        if (n > 1)
            cnt++;

        return cnt;
    }
    
    public static long sumOfPowers(long a, long b) {
        // code here
        long cnt = 0;
        for (long i = a; i <= b; i++)
            cnt += primePowers(i);

        return cnt;
    }
}