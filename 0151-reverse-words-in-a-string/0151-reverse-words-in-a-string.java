class Solution {
    public String reverseWords(String s) {
        StringBuilder ans= new StringBuilder();
        int i=s.length()-1;
        while(i>=0)
        {
            while(i>=0 && s.charAt(i)==' ')
            {
                i--;
            }
            if(i<0)
            {
                break;
            }
            int j=i;
            while(j>=0 && s.charAt(j)!=' ')
            {
                j--;
            }
            //jaise hi j space pe aaye ruk jana h aur substring ko answer me append karna hai
            ans.append(s.substring(j+1 , i+1));
           // remove faltu ke space add single space after word completion
            while(j>=0 && s.charAt(j)==' ')
            {
                j--;
            }
            //j>=0 space needed
            if(j>=0)
            {
                ans.append(' ');
            }
            //i place at j position
            i=j;
        }
        //we have to convert in string because this is in stringbuilder
        return ans.toString();
    }
}