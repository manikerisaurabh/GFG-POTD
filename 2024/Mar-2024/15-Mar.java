public Node reverse(Node head) {
    if (head.next == null)
        return head;
    Node prev = head, cur = head.next;
    prev.next = null;
    while (cur != null) {
        Node temp = cur.next;
        cur.next = prev;
        prev = cur;
        cur = temp;
    }
    return prev;

}

public Node sort(Node head) {
    // your code here, return the head of the sorted list
    if (head.next == null)
        return head;
    Node temp1 = head, temp2 = head.next, t1 = temp1, t2 = temp2;
    // link the ascending sorted list with temp1 and descending with temp2
    while (temp1.next != null && temp2.next != null) {
        temp1.next = temp2.next;
        temp1 = temp1.next;
        temp2.next = temp1.next;
        temp2 = temp2.next;
    }
    temp1.next = null;
    // reverse the descending sorted list
    t2 = reverse(t2);
    while (t1.next != null) {
        t1 = t1.next;
    }
    // link the two list
    t1.next = t2;
    return head;
}