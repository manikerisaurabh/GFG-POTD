public class 12-Jul {
    boolean solve(Node root, int target, int sum){
        if(root==null)return false;
        if(root.left==null && root.right==null){
            return sum+root.data==target;
        }
         return solve(root.left,target,sum+root.data) | solve(root.right,target,sum+root.data);
    }
    boolean hasPathSum(Node root, int target) {
        // Your code here
        return solve(root,target,0);
    }

}
