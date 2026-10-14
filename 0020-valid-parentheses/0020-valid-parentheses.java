import java.util.*;

class Solution {
    public boolean isValid(String s) {

        Deque<Character> st = new ArrayDeque<>();

        for (char ch : s.toCharArray()) {

            // Opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } 
            else {

                // Check if stack is empty
                if (st.isEmpty()) {
                    return false;
                }

                // Check matching brackets
                if (ch == ')' && st.peek() != '(') {
                    return false;
                }

                if (ch == '}' && st.peek() != '{') {
                    return false;
                }

                if (ch == ']' && st.peek() != '[') {
                    return false;
                }

                // Remove the matching opening bracket
                st.pop();
            }
        }

        // Stack must be empty after processing the string
        return st.isEmpty();
    }
}