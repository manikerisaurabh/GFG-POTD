public class 13-Apr {

    static Long reversedBits(Long x) {
        // code here
          long res = 0;
      int n = 32;
        for (int i = 0; i < n; i++) {
            res <<= 1;
            if ((x & 1) == 1) {
                res ^= 1;
            }
            x >>= 1;
        }
        return res;
    }
}