public class 31-May {
    static int swapNibbles(int n) {
        // code here
         int first=n%16;  
        int second=n/16; 
        return first*16+second; 
    }
}
