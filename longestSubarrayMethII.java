public class longestSubarrayMethII {
    static int FindLongestSubarray(int arr[], int k) {
        int maxlen = 0;
        int n = arr.length;
        int left = 0, right = 0;
        int sum = arr[0];
        while (right < n) {

            while (left <= right && sum > k) { // when the sum exceeds k , remove the ele frm left part
                sum -= arr[left];
                left++;
            }

            if (sum == k) {
                maxlen = Math.max(maxlen, right - left + 1);
            }
            // also keep expanding video to the right side ;

            right++;
            if (right < n) {
                sum += arr[right];
            }
        }
        return maxlen;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 5, 6, 7, 0, 1, 2 };
        int k = 18;
        int ans = FindLongestSubarray(arr, k);
        System.out.println(ans);
    }
}
