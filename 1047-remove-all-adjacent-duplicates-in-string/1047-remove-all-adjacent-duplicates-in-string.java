class Solution {
    public String removeDuplicates(String s) {
        StringBuilder s1= new StringBuilder();
        for(int i=0; i<s.length(); i++)
        {
            char ch=s.charAt(i);
            if(s1.length()>0 && s1.charAt(s1.length()-1)==ch)
            {
                s1.deleteCharAt(s1.length()-1);
            }
            else
            {
                s1.append(ch);
            }
        }
        return s1.toString();
    }
}