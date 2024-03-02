public class 02-Mar {
    public int firstElementKTime(int n, int k, int[] a) { 
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int i=0;i<a.length;i++) {
            if(hm.containsKey(a[i]) && (hm.get(a[i])+1==k)) {
                return a[i];
            }else if(hm.containsKey(a[i])&&hm.get(a[i])!=k) {
                hm.put(a[i],hm.get(a[i])+1);
            }
            else {
                hm.put(a[i],1);
            }
        }
        return -1;
    }
}