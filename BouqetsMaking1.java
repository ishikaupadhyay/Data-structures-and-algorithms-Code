import java.util.Arrays;

public class BouqetsMaking1 {

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

        int minDays = Arrays.stream(bloomday).min().getAsInt();
        int maxDays = Arrays.stream(bloomday).max().getAsInt();

        for (int day = minDays; day <= maxDays; day++) {
            if (possibleMaking(bloomday, day, m, k))
                return day;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 7, 7, 7, 7, 13, 11, 12, 7 };
        int m = 2, k = 3;

        BouqetsMaking1 result = new BouqetsMaking1();
        System.out.println(result.minDaysBouq(arr, m, k));
    }
}
