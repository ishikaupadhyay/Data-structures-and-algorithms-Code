import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FourSum2 {
    public List<List<Integer>> fourSum(int arr[]) {
        int n = arr.length;
        // for storing unique triplets:
        Set<List<Integer>> ans = new HashSet<>();

        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {
                Set<Integer> hashSet = new HashSet<>();

                for (int k = j + 1; k < n; k++) {
                    int fourth = -(arr[i] + arr[j] + arr[k]);
                    if (hashSet.contains(fourth)) {
                        
                        List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k], fourth);
                        Collections.sort(temp);
                        ans.add(temp);
                    }
                    hashSet.add(arr[k]);
                }
            }
        }
        return new ArrayList<>(ans);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 0, -1, 0, -2, 2 };
        FourSum2 result = new FourSum2();
        List<List<Integer>> ans = result.fourSum(arr);
        System.out.println(ans);

    }
}
