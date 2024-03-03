public class 03-Mar {

    String printLargest(int n, String[] arr) {
        Arrays.sort(arr,(a,b) -> (b+a).compareTo(a+b));
        String ans = "";
        for(String i : arr){
            ans += i;
        }
        return ans;
    }
}