import java.util.Arrays;

public class KokoEatingBananas2 {

    // using binary search !

    public int calculateTotalhrs(int arr[], int hourly) {
        int totalhrs = 0;
        for (int pile : arr) {
            totalhrs += (int) Math.ceil((double) pile / hourly);
        }
        return totalhrs;
    }

    public int minEatingSpeed(int arr[], int h) {

        // finding the maxVal in the arr(max size)
        int maxval = Arrays.stream(arr).max().getAsInt();
        int low = 1;
        int high = maxval;
        int ans = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int hrs = calculateTotalhrs(arr, mid);

            if (hrs <= h) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 6, 7, 11 };
        int h = 8;
        KokoEatingBananas2 result = new KokoEatingBananas2();
        System.out.println(result.minEatingSpeed(arr, h));
    }
}
