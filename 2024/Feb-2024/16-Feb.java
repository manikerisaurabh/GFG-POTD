public class 16-Feb {

    Node build(Node n, Node parent) {
        if (n == null) return parent;
    
        Node root = build(n.left, n);
    
        if (parent != null) {
            parent.left = n.right;
        }
    
        n.right = build(n.right, parent);
    
        return root;
    }
    public Node flattenBST(Node root) {
        // Code here
          return build(root, null);
    }
}