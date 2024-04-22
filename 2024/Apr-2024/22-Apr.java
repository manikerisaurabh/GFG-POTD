public class 22-Apr {

    int minRow(int n, int m, int a[][]) {
        // code here
         int count = m;
        int res = 0;
        for(int i=0; i<n; i++){
            int c = 0;
            for(int b : a[i]){
                c += b;
            }
            if(c < count){
                count = c;
                res = i;
            }
        }
        return res+1;
    }
}