public class 24-June {
    static long sumMatrix(long n, long q) {
        // code here
         if(q>2*n||q<2)
        return 0;
        else if(n>=q){
            return q-1;
        }
        else{
            long diff = q-n;
            return n-(diff-1);
        }
    }
}
