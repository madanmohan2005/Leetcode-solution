import java.util.*;

class Solution {
    public String decodeString(String s) {

        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();

        StringBuilder curr = new StringBuilder();
        int number = 0;

        for (char ch : s.toCharArray()) {

            if (Character.isDigit(ch)) {
                number = number * 10 + (ch - '0');
            }
            else if (ch == '[') {
                countStack.push(number);
                stringStack.push(curr);

                number = 0;
                curr = new StringBuilder();
            }
            else if (ch == ']') {
                int repeatCount = countStack.pop();
                StringBuilder prev = stringStack.pop();

                for (int i = 0; i < repeatCount; i++) {
                    prev.append(curr);
                }

                curr = prev;
            }
            else {
                curr.append(ch);
            }
        }

        return curr.toString();
    }
}