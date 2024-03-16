public class 16-Mar {

    void deleteNode(Node del_node)
    {
         // Your code here
         Node ptr = del_node.next;
         del_node.data = ptr.data;
         del_node.next = ptr.next;
         
    }
}