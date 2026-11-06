class Solution {

    public int large(int[] weights, int largest) {

        for(int i = 0; i < weights.length; i++) {

            if(weights[i] > largest) {
                largest = weights[i];
            }
        }

        return largest;
    }

    public int shipWithinDays(int[] weights, int days) {

        int largest = weights[0];

        largest = large(weights, largest);

        int low = largest;

        int high = 0;

        for(int i = 0; i < weights.length; i++) {
            high = high + weights[i];
        }

        int ans = high;

        while(low <= high) {

            int mid = low + (high - low) / 2;

            int count = 1;

            int sum = 0;

            for(int i = 0; i < weights.length; i++) {

                if(sum + weights[i] <= mid) {

                    sum = sum + weights[i];

                }
                else {

                    count++;

                    sum = weights[i];
                }
            }

            if(count <= days) {

                ans = mid;

                high = mid - 1;
            }
            else {

                low = mid + 1;
            }
        }

        return ans;
    }
}