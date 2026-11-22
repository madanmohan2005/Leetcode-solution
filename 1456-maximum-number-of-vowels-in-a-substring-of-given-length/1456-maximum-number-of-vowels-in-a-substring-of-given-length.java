class Solution {
    public int maxVowels(String s, int k) {
        int n = s.length();
        char[] ch = s.toCharArray();
        int count = 0;
        for(int i=0 ; i<k ; i++)
        {
            if(ch[i]=='a' || ch[i] =='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u')
            {
                count=count+1;
            }
        }
        int  maxCount = count;
        for(int i =k ; i<n ; i++)
        {
            
            if(ch[i-k] =='a' || ch[i-k]=='e' || ch[i-k]=='i' || ch[i-k]=='o' || ch[i-k]=='u')
            {
                if(count>0)
                {
                    count = count-1;
                }
            }
            if(ch[i]=='a' || ch[i] =='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u')
            {
                count=count+1;
            }
            maxCount = Math.max(maxCount , count);
        }
        return maxCount;
    }
}