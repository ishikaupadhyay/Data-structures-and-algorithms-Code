import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {
    public void threeSum(int arr[]) {

        Arrays.sort(arr); // needed to normalize triplets
        int n = arr.length;

        Set<List<Integer>> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {

                        set.add(Arrays.asList(arr[i], arr[j], arr[k]));
                    }
                }
            }
        }
        if (set.isEmpty()) {
            System.out.println("No triplet found");
        } else {
            for (List<Integer> triplet : set) {
                System.out.println(triplet);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, -1, 0, 2, 1, -2 };
        ThreeSum result = new ThreeSum();
        result.threeSum(arr);
    }
}
