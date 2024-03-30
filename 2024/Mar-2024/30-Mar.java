public class 30-Mar {

    int minValue(Node root) {
        // code here
        if(root.left==null){
            return root.data;
        }
        return minValue(root.left);
    }
}