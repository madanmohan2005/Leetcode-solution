class Solution {
public int[] searchRange(int[] nums, int target) {
    int[] result = {-1, -1};
    int n = nums.length;
    int low = 0;
    int high = n - 1;

    // Find lower bound (first occurrence)
    while (low <= high) {
        int mid = low + (high - low) / 2;

        if (nums[mid] >= target) {
            high = mid - 1;
        } else {
            low = mid + 1;
        }
    }

    // Check whether target exists
    if (low == n || nums[low] != target) {
        return result;
    }

    result[0] = low;

    // Find upper bound
    low = 0;
    high = n - 1;

    while (low <= high) {
        int mid = low + (high - low) / 2;

        if (nums[mid] > target) {
            high = mid - 1;
        } else {
            low = mid + 1;
        }
    }

    result[1] = low - 1;

    return result;
}

}
