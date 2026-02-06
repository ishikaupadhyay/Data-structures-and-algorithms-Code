public class kadanes3 {
    public int maxSubArray(int[] nums) {
        int maxi = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (sum > maxi) {
                maxi = sum;// if greater val found!so updaate the maxi
            }
            if (sum < 0) {
                sum = 0;// if smhw the sum becomes -ve , update it to 0
            }

        }
        return maxi;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, -9, 0, 3, 6, 7 };
        kadanes3 result = new kadanes3();
        System.out.println(result.maxSubArray(arr));
    }
}
