
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class longestConsecutiveArray3 {

    public int longestConsecutive(int arr[]) {
        int n = arr.length;
        int longest = 1;
        int cnt = 0;
        // base case
        if (n == 0)
            return 0;

        // USING HASHET
        Set<Integer> set = new HashSet<>();

        // adding elements in the Hashset:
        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }
        // checking whether that no.is the start of that arr or not :, while going
        // through each ele of the LOOP
        for (int it : set) {
            if (!set.contains(it - 1)) {
                cnt = 1;
                int x = it;

                // keep checking the next consecutive integers :
                while (set.contains(x + 1)) {
                    x = x + 1;
                    cnt++;

                }
                longest = Math.max(longest, cnt);
            }
        }return longest;
    }

    public static void main(String[] args) {
        int arr[] = { 100, 4, 200, 1, 3, 2 };
        longestConsecutiveArray3 result = new longestConsecutiveArray3();
        System.out.println(result.longestConsecutive(arr));
    }
}
