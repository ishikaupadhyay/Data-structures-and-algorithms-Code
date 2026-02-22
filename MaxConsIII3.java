public class MaxConsIII3 {

    public int FindMaximumConsecutiveOnesIII(int arr[], int k) {
        /// optimal approach : sliding window/2 pointers with some smartness!!

        int left = 0;
        int right;
        int maxLen = 0;
        int zeros = 0;

        for (right = 0; right < arr.length; right++) {

            if (arr[right] == 0) {
                zeros++;
            }

            // when zeros >k

            if (zeros > k) {
                if (arr[left] == 0) {
                    zeros--;
                }
                left++;// shrinking the window
            }

            // updating length:
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0 };
        int k = 3;
        MaxConsIII3 result = new MaxConsIII3();
        System.out.println(result.FindMaximumConsecutiveOnesIII(arr, k));
    }
}
