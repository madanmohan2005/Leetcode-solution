class Solution {
    public int large(int[] piles, int largest)
    {
       for(int i=0; i<piles.length; i++)
       {
        if(piles[i]>=largest)
        {
            largest=piles[i];
        }
       }
       return largest;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int largest= piles[0];
        largest=large(piles,largest);
        int low=1;
        int high=largest;
        int ans=largest;
        while(low<=high)
        {
            long sum=0;
            int mid=low + (high-low)/2;
            for(int i=0; i<piles.length; i++)
            {
                sum += (piles[i] + mid-1)/mid;
            }
            if(sum>h)
            {
                
                low=mid+1;
            }
            else{
                ans=mid;
                high=mid-1;
            }
        }
        return ans;
    }
}