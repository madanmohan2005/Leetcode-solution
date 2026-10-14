import java.util.*;

class Solution {
    public String simplifyPath(String path) {

        Deque<String> st = new ArrayDeque<>();

        // Split the path using '/'
        for (String part : path.split("/")) {

            // Ignore empty components and single '.'
            if (part.isEmpty() || part.equals(".")) {
                continue;
            }

            // Move to parent directory
            else if (part.equals("..")) {
                if (!st.isEmpty()) {
                    st.pop();
                }
            }

            // Normal directory name
            else {
                st.push(part);
            }
        }

        // Construct the canonical path
        StringBuilder result = new StringBuilder();

        Iterator<String> it = st.descendingIterator();

        while (it.hasNext()) {
            result.append("/").append(it.next());
        }

        // If stack is empty, return root
        return result.length() == 0 ? "/" : result.toString();
    }
}