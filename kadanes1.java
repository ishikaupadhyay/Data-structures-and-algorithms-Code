public class kadanes1 {
    public int maxSubArray(int[] nums) {
        int maxi = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int sum = 0;// to make the sum 0 after every iteration

                for (int k = i; k <= j; k++) {// to calculate the sum
                    sum += nums[k];

                }

                maxi = Math.max(maxi, sum);
            }
        }
        return maxi;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, -9, 0, 3, 6, 7 };
        kadanes1 result = new kadanes1();
        System.out.println(result.maxSubArray(arr));
    }

}
