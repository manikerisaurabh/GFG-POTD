public class 16-Apr {
    public static int minimizeDifference(int n, int k, int[] arr) {
        // code here
        int[] post_max=new int[n];
        int[] post_min=new int[n];
        post_max[n-1]=arr[n-1];
        post_min[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            post_max[i]=Math.max(post_max[i+1],arr[i]);
            post_min[i]=Math.min(post_min[i+1],arr[i]);
        }
        int ans=post_max[k]-post_min[k];
        int maxi=arr[0];
        int mini=arr[0];
        for(int i=1;i<n-k;i++){
            int diff=Math.max(maxi,post_max[i+k])-Math.min(mini,post_min[i+k]);
            ans=Math.min(ans,diff);
            maxi=Math.max(maxi,arr[i]);
            mini=Math.min(mini,arr[i]);
        }
        ans=Math.min(ans,maxi-mini);
        return ans;
    }
}
