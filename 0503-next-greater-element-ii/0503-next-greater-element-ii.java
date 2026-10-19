import java.util.*;

class Solution {
    public int[] nextGreaterElements(int[] nums) {

        int n = nums.length;

        Deque<Integer> st = new ArrayDeque<>();
        int[] ans = new int[n];

        Arrays.fill(ans, -1);

        for (int i = 0; i < 2 * n; i++) {

            int currIndex = i % n;

            while (!st.isEmpty() &&
                   nums[currIndex] > nums[st.peek()]) {

                int prev = st.pop();
                ans[prev] = nums[currIndex];
            }

            if (i < n) {
                st.push(currIndex);
            }
        }

        return ans;
    }
}