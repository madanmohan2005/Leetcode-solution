class Solution {
    public static void solve(char[] s ,int i ,int j)
    {
        if(i>=j)
        {
            return ;
        }
        //swap an array
        char temp = s[i];
        s[i]=s[j];
        s[j]=temp;
        i++;
        j--;
        solve( s, i,j);

    }
    public void reverseString(char[] s) {
        int i=0;
        int j=s.length-1;
        solve (s, i,j);

    }
}