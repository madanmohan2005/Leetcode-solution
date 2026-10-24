class Solution {
    public String removeKdigits(String num, int k) {
        Deque<Character> st = new ArrayDeque<>();
        //step 1 : monotonic stack completed
        for(char ch : num.toCharArray())
        {
            while(!st.isEmpty() && k>0 && st.peek()>ch)
            {
                st.pop();
                k--;
            }
            st.push(ch);
        }
        //step 2: still  digits are pending
        while(k>0 && !st.isEmpty())
        {
            st.pop();
            k--;
        }
        //build your ans string , reverse it and remove trailing space
        StringBuilder ans = new StringBuilder();
        while(!st.isEmpty())
        {
            ans.append(st.peek());
            st.pop();
        }
        //reverse String
        ans.reverse();
        //trailin zero
        int index =0;
        while(index<ans.length() && ans.charAt(index)=='0')
        {
            index++;
        }
        String result = ans.substring(index);
        if(result.length()==0)
        {
            return "0";
        }
        else{
            return result;
        }
    }
}