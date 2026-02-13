import java.util.Arrays;

public class KokoEatingBananas1 {

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

        for (int i = 1; i < maxval; i++) {
            int hours = calculateTotalhrs(arr, i);

            if (hours <= h) {
                return i;
            }
        }
        return maxval;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 6, 7, 11 };
        int h = 8;
        KokoEatingBananas1 result = new KokoEatingBananas1();
        System.out.println(result.minEatingSpeed(arr, h));
    }
}
