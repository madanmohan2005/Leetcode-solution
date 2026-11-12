class Solution {
    public String removeDuplicates(String s) {
        StringBuilder s1=new StringBuilder();
        char[] currentChar=s.toCharArray();
        for(int i=0 ; i<s.length(); i++)
        {
            if(s1.length()==0 || s1.charAt(s1.length()-1)!=currentChar[i])
            {
                s1.append(currentChar[i]);
            }
            else
            {
                s1.deleteCharAt(s1.length()-1);
            }
        }
        return s1.toString();
    }
}