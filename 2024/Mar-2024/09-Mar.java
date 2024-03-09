public char nthCharacter(String s, int r, int n) {
    // code here
    StringBuilder sb1 = new StringBuilder(s);
    int m = s.length();
    for (int i = 0; i < r; i++) {
        StringBuilder sb2 = new StringBuilder();
        for (int j = 0; j < m; j++) {
            char c = sb1.charAt(j);
            // System.out.println(c);
            if (c == '0')
                sb2.append("01");
            else
                sb2.append("10");
        }
        sb1 = sb2;
    }
    // System.out.println(sb1);
    return sb1.charAt(n);
}