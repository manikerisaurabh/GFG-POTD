public class 21-Apr {

    //Function to partition the array around the range such 
    //that array is divided into three parts.
    public void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
    public void threeWayPartition(int nums[], int lb, int ub)
    {
        // code here 
        int low = 0, mid = 0, high = nums.length - 1;
        
        while (mid <= high) {
            
            if (nums[mid] < lb) {
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] > ub) {
                swap(nums, mid, high);
                high--;
            } else {
                mid++;
            }
        }
    }
}