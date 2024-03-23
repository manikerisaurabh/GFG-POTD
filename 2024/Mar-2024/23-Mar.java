public class 23-Mar {

    int[] Series(int n) {
        // code here
        int[] ar = new int[n+1];
        ar[0] = 0;
        ar[1] = 1;
        int i=2;
        int mod = (int)(1e9 + 7);
        while(i<n+1)
        {
            ar[i] = (ar[i-1] + ar[i-2]) % mod;
            i++;
        }
        return ar;
    }
}