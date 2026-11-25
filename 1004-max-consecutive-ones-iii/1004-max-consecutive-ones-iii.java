class Solution {
    public int longestOnes(int[] nums, int k) {
        int i = 0, j = 0;
        int zeroCount = 0;
        int maxSize = 0;
        int n = nums.length;

        while (j < n) {

            // Expand the window
            if (nums[j] == 0) {
                zeroCount++;
            }

            // Shrink the window if more than one zero exists
            while (zeroCount > k) {
                if (nums[i] == 0) {
                    zeroCount--;
                }
                i++;
            }

            // Delete exactly one element conceptually
            int windowLength = j - i + 1;
            maxSize = Math.max(maxSize, windowLength );

            // Move the right pointer
            j++;
        }

        return maxSize;
    
    }
}