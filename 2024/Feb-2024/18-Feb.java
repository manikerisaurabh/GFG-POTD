public class 18-Feb {
    static int sum =0;
    public static int sumOfLeafNodes(Node root)
    {
        // code here
        sum = 0;
        helper(root);
        return sum;
    }
    
    private static void helper(Node root){
        if(root ==null) return;
        if(root.left == root.right){
            sum += root.data;
            return;
        }
        helper(root.left);
        helper(root.right);
    }
}