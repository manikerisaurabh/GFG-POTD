public class 14-Jan {

    public static ArrayList<Integer> repeatedRows(int a[][], int m, int n)
    {
        //code here
        ArrayList<Integer> result = new ArrayList<>();
        Map<String, Integer> rowMap = new HashMap<>();

        for (int i = 0; i < a.length; i++) {
            StringBuilder rowStr = new StringBuilder();
            for (int j = 0; j < a[i].length; j++) {
                rowStr.append(a[i][j]);
            }

            if (rowMap.containsKey(rowStr.toString())) {
                result.add(i);
            } else {
                rowMap.put(rowStr.toString(), i);
            }
        }

        return result;
    }
}