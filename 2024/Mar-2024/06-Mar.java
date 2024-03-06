public class 06-Mar {

    ArrayList<Integer> search(String pattern, String text)
    {
        // your code here
        ArrayList<Integer> list = new ArrayList<>();
        int pos = 0;
        
        while(pos != -1){
            pos = text.indexOf(pattern,pos);
            if(pos != -1){
                list.add(pos+1);
                pos = pos+1;
            }
        }
        return list;
    }
}