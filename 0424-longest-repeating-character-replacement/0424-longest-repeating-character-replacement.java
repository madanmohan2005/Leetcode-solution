class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];

        int i = 0;
        int j = 0;
        int n = s.length();
        int maxFreq = 0;
        int maxSize = 0;

        while (j < n) {
            // Add current character to window
            int index = s.charAt(j) - 'A';
            freq[index]++;

            // Update maximum frequency inside the window
            maxFreq = Math.max(maxFreq, freq[index]);

            // Calculate replacements needed
            int windowLength = j - i + 1;
            int replacements = windowLength - maxFreq;

            // Shrink window if it is invalid
            while (replacements > k) {
                int leftIndex = s.charAt(i) - 'A';
                freq[leftIndex]--;
                i++;

                windowLength = j - i + 1;
                replacements = windowLength - maxFreq;
            }

            // Update answer for valid window
            maxSize = Math.max(maxSize, j - i + 1);

            j++;
        }

        return maxSize;
    }
}