import java.util.*;

class Solution {

    static void solve(int[] candidates, int target, int index,
                      List<Integer> output,
                      List<List<Integer>> ans) {

        // Base Case
        if (target == 0) {
            ans.add(new ArrayList<>(output));
            return;
        }

        if (index >= candidates.length || target < 0) {
            return;
        }

        // =========================
        // Include
        // =========================
        output.add(candidates[index]);

        solve(candidates,
              target - candidates[index],
              index + 1,      // Cannot reuse same element
              output,
              ans);

        // Backtrack
        output.remove(output.size() - 1);

        // =========================
        // Skip Duplicates
        // =========================
        while (index + 1 < candidates.length &&
               candidates[index] == candidates[index + 1]) {
            index++;
        }

        // =========================
        // Exclude
        // =========================
        solve(candidates,
              target,
              index + 1,
              output,
              ans);
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        Arrays.sort(candidates);

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();

        solve(candidates, target, 0, output, ans);

        return ans;
    }
}