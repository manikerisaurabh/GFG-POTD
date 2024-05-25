public class 25-May {

    long max_Books(int arr[], int n, int k) {
        // Your code here
        long curr = 0, ans = 0;
        for(int i=0;i<n;i++){
            if(arr[i] <= k){
                curr += arr[i];
            }
            else{
                curr = 0;
            }
            ans = Math.max(ans,curr);
        }
        return ans;
    }
}