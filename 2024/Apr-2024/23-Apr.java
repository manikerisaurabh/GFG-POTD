public class 23-Apr {

    static long N = 1000000007;
    static int firstElement(int n) {
        // code here
        if(n ==1 || n==2 )
            return 1;
        long a00 = 2,a01 = 1, a10 = 1, a11 = 1;
        long b00 = 1, b01 = 1, b10 = 1, b11 = 0;
        for(int i = 3;i <= n; i++){
            long a = (a00*b00+a01*b10)%N;
            long b = (a10*b00+a11*b10)%N;
            long c = (a10*b01+a11*b11)%N;
            a00 = a;
            a11 = c;
            a01 = b;
            a10 = b;
        }
        return (int)a10;
    }
}