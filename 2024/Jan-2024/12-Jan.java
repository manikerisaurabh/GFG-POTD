public class 12-Jan {

    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        // add code here.
        if (k <= 0 || k > q.size()) {
            return q;
        }
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < k; i++) {
            stack.push(q.poll());
        }
        
        while (!stack.isEmpty()) {
            q.add(stack.pop());
        }
        for (int i = 0; i < q.size() - k; i++) {
            q.add(q.poll());
        }
        return q;
    }
}