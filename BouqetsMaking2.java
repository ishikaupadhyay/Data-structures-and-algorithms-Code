
public class BouqetsMaking2 {

    public boolean possibleMaking(int bloomday[], int day, int m, int k) {
        int cnt = 0;
        int bouq = 0;

        for (int bloom : bloomday) {
            if (bloom <= day) {
                cnt++;

                if (cnt == k) {
                    bouq++;
                    cnt = 0;
                }
            } else {
                cnt = 0;
            }
        }
        return bouq >= m;
    }

    int minDaysBouq(int bloomday[], int m, int k) {
        // kinda base case ;
        int totalflowers = m * k;
        if (totalflowers > bloomday.length)
            return -1;

        int minDays = Integer.MAX_VALUE;
        int maxDays = Integer.MIN_VALUE;

        for (int bloom : bloomday) {
            minDays = Math.min(minDays, bloom);
            maxDays = Math.max(maxDays, bloom);
        }

        int low = minDays;
        int high = maxDays;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (possibleMaking(bloomday, mid, m, k)) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = { 7, 7, 7, 7, 13, 11, 12, 7 };
        int m = 2, k = 3;

        BouqetsMaking2 result = new BouqetsMaking2();
        System.out.println(result.minDaysBouq(arr, m, k));
    }
}
