class Solution {
    public void rotateArrayByOne(int[] nums) {
        int n = nums.length;
        int[] newArr = new int[n];

        for (int i = 1; i < n; i++) {
            newArr[i - 1] = nums[i];
        }
        newArr[n - 1] = nums[0];
//copy back!(this printss the new array actually)
        for (int i = 0; i < n; i++) {
            nums[i] = newArr[i];
        }
    }
}
public class leftrotateMethodI {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6, 7};
        Solution sol = new Solution();
        sol.rotateArrayByOne(nums);

        for (int x : nums) {
            System.out.print(x + " ");
        }
    }
}
