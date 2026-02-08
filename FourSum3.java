import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum3 {
    public List<List<Integer>> foursum(int arr[]) {
        // step 1:sort the array:
        Arrays.sort(arr);
        int sum;
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {// first loop for first element
            // skipping duplicated(aage aane wale)
             if (i > 0 && arr[i] == arr[i- 1])
                    continue;

            for (int j = i + 1; j< arr.length; j++) {
                if (j > i+1 && arr[j] == arr[j - 1])
                    continue;

                // STEP 2: using 2 ptrs to find the other 2 values that sum up with i to give 0

                int left = j+ 1;// i se aage wale values!
                int right = arr.length - 1;// frm last of the given array

                while (left < right) {
                    sum = arr[i] +arr[j]+ arr[left] + arr[right];

                    if (sum == 0) {
                        ans.add(Arrays.asList(arr[i], arr[j],arr[left], arr[right]));
                        left++;
                        right--;

                        while (left < right && arr[left] == arr[left + 1])
                            left++;// duplicate ele mile toh aage badho
                        while (left < right && arr[right] == arr[right -1])
                            right--;// similarly
                    } else if (sum < 0)
                        left++;
                    else
                        right--;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, -1, 0, 2, 1, -2 };
        FourSum3 result = new FourSum3();
        List<List<Integer>> ans = result.foursum(arr);
        System.out.println(ans);

    }
}
