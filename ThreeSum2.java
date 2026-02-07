import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum2 {
    public List<List<Integer>> threeSum(int arr[]) {
        int n = arr.length;
        // for storing unique triplets:
        Set<List<Integer>> ans = new HashSet<>();

        for (int i = 0; i < n; i++) {
            Set<Integer> hashSet = new HashSet<>();

            for (int j = i + 1; j < n; j++) {
                int third = -(arr[i] + arr[j]);

                if (hashSet.contains(third)) {
                    List<Integer> temp = Arrays.asList(arr[i], arr[j], third);
                    Collections.sort(temp);
                    ans.add(temp);
                }
                hashSet.add(arr[j]);
            }
        }
        return new ArrayList<>(ans);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, -1, 0, 2, 1, -2 };
        ThreeSum2 result = new ThreeSum2();
        List<List<Integer>> ans = result.threeSum(arr);
        System.out.println(ans);

    }
}
