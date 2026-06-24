class Solution {
    public int reverse(int x) {
        int reverseNum=0;
        while(x !=0)
        {
            //last digit lane ke liye
           int Lastdigit=x%10;
           if (reverseNum > Integer.MAX_VALUE / 10 || reverseNum < Integer.MIN_VALUE / 10) {
    return 0;
}
           reverseNum=reverseNum*10 + Lastdigit;
           x=x/10;
        }
        return reverseNum;
    }
}