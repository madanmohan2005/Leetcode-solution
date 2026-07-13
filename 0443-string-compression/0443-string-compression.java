class Solution {
    public int compress(char[] chars) {

        int read = 0;
        int write = 0;

        while (read < chars.length) {

            char currentChar = chars[read];
            int count = 0;

            // count frequency
            while (read < chars.length &&
                   chars[read] == currentChar) {

                read++;
                count++;
            }

            // write character
            chars[write] = currentChar;
            write++;

            // write count
            if (count > 1) {

                String countStr = String.valueOf(count);

                for (char digit : countStr.toCharArray()) {
                    chars[write] = digit;
                    write++;
                }
            }
        }

        return write;
    }
}