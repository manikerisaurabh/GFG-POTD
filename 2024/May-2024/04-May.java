public class 04-May {

    static int preIndex=0;
    GfG(){
        this.preIndex = 0;
    }
    Node buildTree(int in[], int post[], int n) {
        reverse(post);//reverse it and make it inorder. 
        Node root = create_Tree(in,post,0,n-1);
        return root;
    }
    public static Node create_Tree(int inorder[],int preorder[],int inStart,int inEnd){
        
        if(inStart>inEnd){
            return null;
        }
        Node root = new Node(preorder[preIndex++]);
        if(inStart==inEnd){
            return root;
        }
        int ind = search(inorder,root.data,inStart,inEnd);
        root.right = create_Tree(inorder,preorder,ind+1,inEnd);//for postOrder first go right side.
        root.left = create_Tree(inorder,preorder,inStart,ind-1);
        
        return root;
        
    }
    private static int search(int[] inOrder, int data, int inStart, int inEnd) {
		int i = 0;
		for(i=inStart;i<=inEnd;i++) {
			if(inOrder[i]==data) {
				return i;
			}
		}
		return i;
	}
    
    
    
    public static void reverse(int post[]){
        for(int i=0;i<post.length/2;i++){
            int temp = post[i];
            post[i] = post[post.length-i-1];
            post[post.length-i-1] = temp;
        }
    }
}