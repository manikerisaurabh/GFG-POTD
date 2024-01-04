public class 04-Jan {
    static int singleElement(int[] a , int n) {
        Arrays.sort(a);
        int result = 0;
        for (int i = 0; i < 32; i++) {
            int sum = 0;
            int mask = 1 << i;
            for (int num : a) {
                if ((num & mask) != 0) {
                    sum++;
                }
            }
            if (sum % 3 != 0) {
                result |= mask;
            }
        }

        return result;
    }
}
