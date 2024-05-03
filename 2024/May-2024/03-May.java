public class 03-May {

    // Recursive function to print right view of a binary tree.
    ArrayList<Integer> Kdistance(Node root, int k)
    {
        ArrayList<Integer>ans = new ArrayList<>();
        int dist = 0;
        findH(root,k,dist,ans);
        return ans;
        
    }
    public void findH(Node root, int k, int dist,ArrayList<Integer> ans){
        if(root==null)return;
        if(k==dist){
            ans.add(root.data);
            return;
        }
        dist++;
        findH(root.left,k,dist,ans);
        findH(root.right,k,dist,ans);
    }
}