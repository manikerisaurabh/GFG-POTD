public class 02-Apr {
    void inorder(Node root, List<Integer> list){
        if(root == null) return;
        inorder(root.left, list);
        list.add(root.data);
        inorder(root.right, list);
    }
    
    int absolute_diff(Node root)
    {
        int diff=Integer.MAX_VALUE;
        List<Integer> list = new ArrayList();       
        inorder(root, list);        
        for(int i=1; i<list.size(); i++){
            int abs_dif = list.get(i) - list.get(i-1);      
            diff = Math.min(diff, abs_dif);        
        }
        
        return diff;
    }
}
