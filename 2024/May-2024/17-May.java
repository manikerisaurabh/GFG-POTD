public class 17-May {
    public int findPair(int n, int x, int[] arr) {
        // code here
         Arrays.sort(arr);
       int i=0;
       int j=1;
       while(i<n && j<n){
           int diff=(arr[j]-arr[i]);
           if(diff==x && i!=j)
           return 1;
           if(diff<x)
           j++;
           else 
           i++;
       }
       return -1;
    }
}
