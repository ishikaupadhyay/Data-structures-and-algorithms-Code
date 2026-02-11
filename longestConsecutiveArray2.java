
import java.util.Arrays;

public class longestConsecutiveArray2 {

    public int longestConsecutive(int arr[]) {
        int n = arr.length;
        int longest = 1;
        int cnt = 0;
        int lastele = Integer.MIN_VALUE;
        Arrays.sort(arr);

        // base case
        if (n == 0)
            return 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] - 1 == lastele) {
                cnt++;
                // update the curr ele
                lastele = arr[i];
            }

            else if (arr[i] != lastele) {
                cnt = 1;
                lastele = arr[i];
            }

            longest = Math.max(longest, cnt);
        }
        return longest;

    }

    public static void main(String[] args) {
        int arr[] = { 100, 4, 200, 1, 3, 2 };
        longestConsecutiveArray2 result = new longestConsecutiveArray2();
        System.out.println(result.longestConsecutive(arr));
    }
}
