class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> q = new ArrayDeque<>();
        int n = nums.length;
        int[] ans = new int[n - k + 1];
        int arrIndex = 0;

        // First window
        for (int i = 0; i < k; i++) {

            int element = nums[i];

            // Remove smaller elements from the back
            while (!q.isEmpty() && nums[q.peekLast()] < element) {
                q.pollLast();
            }

            q.offerLast(i);
        }

        ans[arrIndex] = nums[q.peekFirst()];
        arrIndex++;

        // Remaining windows
        for (int i = k; i < nums.length; i++) {

            // Remove indices outside the current window
            while (!q.isEmpty() && q.peekFirst() <= i - k) {
                q.pollFirst();
            }

            // Remove smaller elements from the back
            while (!q.isEmpty() && nums[q.peekLast()] < nums[i]) {
                q.pollLast();
            }

            // Add new element's index
            q.offerLast(i);

            // Store current window maximum
            ans[arrIndex] = nums[q.peekFirst()];
            arrIndex++;
        }

        return ans;
    }
}