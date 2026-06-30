import java.util.*;

class Solution {

    public void getAllSubsequence(int[] nums, int index,
                                  List<Integer> output,
                                  List<List<Integer>> ans) {

        // Base case
        if (index == nums.length) {
            ans.add(new ArrayList<>(output));
            return;
        }

        // Include
        output.add(nums[index]);
        getAllSubsequence(nums, index + 1, output, ans);

        // Backtrack
        output.remove(output.size() - 1);

        // Exclude
        getAllSubsequence(nums, index + 1, output, ans);
    }

    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();

        getAllSubsequence(nums, 0, output, ans);

        return ans;
    }
}