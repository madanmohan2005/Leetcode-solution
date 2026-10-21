class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();
        for(char ch:s.toCharArray())
        {
            if(ch=='#' && !st1.isEmpty())
            {
                st1.pop();
            }
            else if(ch=='#' && st1.isEmpty())
            {
                continue;
            }
            else
            {
                st1.push(ch);
            }
        }
         for(char ch:t.toCharArray())
        {
            if(ch=='#' && !st2.isEmpty())
            {
                st2.pop();
            }
            else if(ch=='#' && st2.isEmpty())
            {
                continue;
            }
            else
            {
                st2.push(ch);
            }
        }
        if(st1.equals(st2))
        {
            return true;
        }
        return false;
    }
}