import java.util.ArrayList;
import java.util.List;

public class slidingWindowMax1 {
    public List<Integer> FindSlidingWindowMaximum(int arr[], int k) {

        // make a list in which the o/p will be stored :
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < arr.length - k; i++) {
            int maxVal = arr[i];
            for (int j = i; j < i + k; j++) {
                maxVal = Math.max(maxVal, arr[j]);
            }
            result.add(maxVal);
        }
        return result;

    }

    public static void main(String[] args) {
        int[] arr = { 4, 0, -1, 3, 5, 3, 6, 8 };
        int k = 3;
        slidingWindowMax1 ans = new slidingWindowMax1();
        System.out.println(ans.FindSlidingWindowMaximum(arr, k));
    }
}