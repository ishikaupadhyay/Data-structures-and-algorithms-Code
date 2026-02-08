import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FourSum1 {
    public void fourSum(int arr[]) {

        Arrays.sort(arr); // needed to normalize triplets
        int n = arr.length;

        Set<List<Integer>> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    for (int l = k + 1; l < n; l++) {
                        if (arr[i] + arr[j] + arr[k] + arr[l] == 0) {

                            set.add(Arrays.asList(arr[i], arr[j], arr[k], arr[l]));
                        }
                    }
                }
            }
        }
        if (set.isEmpty()) {
            System.out.println("No qaudraplet found");
        } else {
            for (List<Integer> quadraplet : set) {
                System.out.println(quadraplet);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 0, -1, 0, -2, 2 };
        FourSum1 result = new FourSum1();
        result.fourSum(arr);
    }
}
