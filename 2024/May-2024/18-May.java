public class 18-May {

    public int findPeakElement(List<Integer> a) {
        // Code here
         Collections.sort(a);
        return a.get(a.size()-1);
    }
}