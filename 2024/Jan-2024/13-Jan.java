public class 13-Jan {

    public static Node insertionSort(Node head)
    {
        //code here
        ArrayList<Integer> ans = new ArrayList<>();
        Node temp = head;

        while (temp != null) {
            ans.add(temp.data);
            temp = temp.next;
        }

        Collections.sort(ans);

        temp = head;
        int i = 0;

        while (temp != null) {
            temp.data = ans.get(i);
            i++;
            temp = temp.next;
        }

        return head;
    }
}