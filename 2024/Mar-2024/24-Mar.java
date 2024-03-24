public class 24-Mar {

    private void pushAtBottom(Stack<Integer> st,int x){
        if(st.isEmpty()){
            st.push(x);
            return ;
        }
        int pop = st.pop();
        pushAtBottom(st,x);
        st.push(pop);
        return;
    }
    public Stack<Integer> insertAtBottom(Stack<Integer> st, int x) {
       
        pushAtBottom(st,x);
        return st;
        
    }
}