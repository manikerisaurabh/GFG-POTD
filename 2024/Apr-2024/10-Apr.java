public class 10-Apr {

    static int findSingle(int n, int arr[]){
        // code here
        int xor=0;
        for(int ele:arr)
        {
            xor^=ele;
        }
        return xor;
    }
}