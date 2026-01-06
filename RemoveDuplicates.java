// for method 1:
// import java.util.HashSet;

import java.util.Arrays;

class Solution {

    // METHOD-1 (BRUTE FORCE)
    // TC - O(N), SC - O(N)
    /*
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();

        int index = 0; // starts from this index

        for (int num : nums) {
            if (!seen.contains(num)) {
                seen.add(num);
                nums[index] = num; // unique elements moved forward
                index++;
            }
        }
        return index;
    }
    */

    // METHOD-2 (OPTIMAL)
    // TC - O(N log N) due to sorting
    // SC - O(1)
    public int removeDuplicates(int[] nums) {

        Arrays.sort(nums); // sorting the array
        int n = nums.length;

        if (n == 0) return 0;

        int i = 0; // index for unique elements

        // j is the nearby element of i
        // since array is sorted, duplicates stay adjacent
        for (int j = 1; j < n; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j]; // bring unique element forward
            }
        }

        return i + 1; // number of unique elements
    }
}

public class RemoveDuplicates {
    public static void main(String[] args) {

        int[] nums = {1, 2, 36, 1, 2, 5, 1, 36, 15};

        Solution sol = new Solution();
        int k = sol.removeDuplicates(nums);

        System.out.println("NO OF UNIQUE elements ARE : " + k);

        // printing new array
        System.out.println("NEW ARRAY : ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
