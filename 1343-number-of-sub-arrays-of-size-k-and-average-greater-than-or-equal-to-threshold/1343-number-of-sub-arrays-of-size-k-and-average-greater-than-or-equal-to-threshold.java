class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum = 0;
        int n = arr.length;
        int count = 0;

        // Calculate first window sum
        for(int i = 0; i < k; i++) {
            sum += arr[i];
        }

        // Calculate first window average
        // int avg = sum / k;

        // if(avg >= threshold) {
        //     count++;
        // }
              //we can do
        if(sum>= k*threshold)
        {
            count++;
        }

        // Slide the window
        for(int i = k; i < n; i++) {
            sum = sum - arr[i-k] + arr[i];

            // avg = sum / k;

            // if(avg >= threshold) {
            //     count++;
            // }

                 //also we can directly do 
            if(sum>=k*threshold)
            {
                count++;
            }
        }

        return count;
    }
}