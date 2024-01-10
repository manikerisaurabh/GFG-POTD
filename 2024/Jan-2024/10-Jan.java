public class 10-Jan {
    int longSubarrWthSumDivByK(int arr[], int n, int k)
    {
        // Complete the function
       HashMap<Integer, Integer> mp = new HashMap<>();
        mp.put(0, -1);
        
        int out = 0, sum = 0;
        
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            int rem = sum % k;
            
            if (rem < 0) {
                rem += k;
            }
            
            if (mp.containsKey(rem)) {
                out = Math.max(out, i - mp.get(rem));
            } else {
                mp.put(rem, i);
            }
        }
         
        return out;
}
