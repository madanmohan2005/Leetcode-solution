class Solution {
    public String reverseWords(String s) {
        StringBuilder ans= new StringBuilder();
        int i=0;
        int n=s.length();
        while(i<n)
        {
            while(i<n && s.charAt(i)==' ')
            {
                i++;
            }
            if(i>=n)
            {
                break;
            }
            int j=i;
            while(j<n && s.charAt(j)!=' ')
            {
                j++;
            }
            for(int k = j-1; k >= i; k--)
            {
              ans.append(s.charAt(k));
            }
            while(j<n && s.charAt(j)==' ')
            {
                j++;
            }
            if(j<n)
            {
                ans.append(' ');
            }
            i=j;
        }
        return ans.toString();
    }
}