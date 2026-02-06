public class kadanes2 {
    public int maxSubArray(int[] nums) {
        int maxi = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int sum = 0;// to make the sum 0 after every iteration

            for (int j = i; j < nums.length; j++) {

                sum += nums[j];
            
            maxi = Math.max(maxi, sum);
            }
        }
        return maxi;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, -9, 0, 3, 6, 7 };
        kadanes2 result = new kadanes2();
        System.out.println(result.maxSubArray(arr));
    }

}
