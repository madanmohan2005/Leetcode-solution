import java.util.*;

class Solution {
    public int maxFrequencyElements(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Step 1: Frequency count
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 2: Maximum frequency find karo
        int maxFreq = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
            }
        }

        // Step 3: Total frequency count karo
        int total = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxFreq) {
                total += entry.getValue();
            }
        }

        return total;
    }
}