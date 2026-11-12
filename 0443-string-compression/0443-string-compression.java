class Solution {
    public int compress(char[] chars) {
        int i = 0;
        int j = 0;

        while (i < chars.length) {
            int count = 0;
            char currentChar = chars[i];

            while (i < chars.length && chars[i] == currentChar) {
                i++;
                count++;
            }

            chars[j] = currentChar;
            j++;

            if (count > 1) {
                String countstr = String.valueOf(count);

                for (char digit : countstr.toCharArray()) {
                    chars[j] = digit;
                    j++;
                }
            }
        }

        return j;
    }
}