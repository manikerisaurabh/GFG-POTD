public class 11-Jan {

    public static String removeKdigits(String S, int K) {
        int n = S.length();
        Stack<Character> stack = new Stack<>();

        for (char digit : S.toCharArray()) {
            while (K > 0 && !stack.isEmpty() && stack.peek() > digit) {
                stack.pop();
                K--;
            }
            stack.push(digit);
        }
        while (K > 0) {
            stack.pop();
            K--;
        }

        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
        result.reverse();
        int startIndex = 0;
        while (startIndex < result.length() && result.charAt(startIndex) == '0') {
            startIndex++;
        }

        return startIndex == result.length() ? "0" : result.substring(startIndex);
    }
}