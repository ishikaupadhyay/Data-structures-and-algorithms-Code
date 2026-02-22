public class MaxConsIII2 {
    public int FindMaximumConsecutiveOnesIII(int arr[], int k) {
        /// better approach : sliding window/2 pointers

        int left = 0;
        int right ;
        int maxLen = 0;
        int zeros = 0;

        for (right = 0; right < arr.length; right++) {

            if (arr[right] == 0) {
                zeros++;
            }

            // when zeros >k

            while (zeros > k) {
                if (arr[left] == 0) {
                    zeros--;
                }
                left++;
            }
            // updating length:
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0 };
        int k = 3;
        MaxConsIII2 result = new MaxConsIII2();
        System.out.println(result.FindMaximumConsecutiveOnesIII(arr, k));
    }
}
