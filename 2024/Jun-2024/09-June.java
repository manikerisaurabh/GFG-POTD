public class 09-June {
    public static void zigZag(int n, int[] arr) {
        // code here
          boolean flag = true;

        for(int i = 0 ; i < n-1 ;i++){
            if(flag){   
            
                if(arr[i] > arr[i+1])
                    swap(arr,i,i+1);
            }else{  
            
                if(arr[i] < arr[i+1])
                    swap(arr, i ,i+1);
            }
            
            flag = !flag;
        }
    }
    
    public static void swap(int[] arr , int i ,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
