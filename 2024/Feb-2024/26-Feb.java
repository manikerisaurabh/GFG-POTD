public class 26-Feb {

    public List<String> AllPossibleStrings(String s)
    {
        List<String> ans=new ArrayList<>();
        trav(s.toCharArray(),0,s.length(),"",ans);
        Collections.sort(ans);
        return ans;
    }
    public static void trav(char a[],int i,int n,String s,List<String> l){
        if(i==n){
            if(s.length()>0)l.add(s);
            return;
        }
        trav(a,i+1,n,s+a[i],l);
        trav(a,i+1,n,s,l);
    }    
}