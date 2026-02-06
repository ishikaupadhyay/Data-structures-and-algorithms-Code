public class StockBuyandSell2 {
    public int FindBestBuyandSellTime(int nums[]) {

        int min = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] < min) {
                min = nums[i];

            }
            // int profit=nums[i]-min;
            else {
                maxprofit = Math.max(maxprofit, nums[i] - min);
            }
        }
        return maxprofit;
    }

    public static void main(String[] args) {
        int nums[] = { 7, 1, 5, 3, 6, 4 };
        StockBuyandSell2 result = new StockBuyandSell2();

        System.out.println(result.FindBestBuyandSellTime(nums));
    }

}
