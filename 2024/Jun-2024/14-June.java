public class 14-June {

    static String armstrongNumber(int n) {
        // code here
            int num = 0;
        int count = 0;
        int ans = n;
        
        while(n > 0) {
            num = n % 10;
            count = count + num * num * num;
            n = n / 10;
        }
        
        if(count == ans) {

            return "true";
        }
        return "false";
    }
}