import java.util.*;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        Stack<Integer> st = new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();

        // Traverse nums2
        for (int num : nums2) {

            // Find next greater element for elements in stack
            while (!st.isEmpty() && st.peek() < num) {
                map.put(st.pop(), num);
            }

            st.push(num);
        }

        // Elements remaining in stack have no greater element
        while (!st.isEmpty()) {
            map.put(st.pop(), -1);
        }

        // Build the answer for nums1
        int[] ans = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            ans[i] = map.get(nums1[i]);
        }

        return ans;
    }
}