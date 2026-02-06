public class StockBuyandSell1 {
    public int FindBestBuyandSellTime(int nums[]) {
        int maxprprofit = 0;

        /*
         * loop through all teh days
         * for each buy day , loop through all the days as sell days ,
         * profit =sell day- buy day
         * return the max profit val
         */

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {
                int profit = nums[j] - nums[i];

                // update the maxprofit ;
                maxprprofit = Math.max(maxprprofit, profit);
            }
        }
        return maxprprofit;
    }

    public static void main(String[] args) {
        int nums[] = { 7, 1, 5, 3, 6, 4 };
        StockBuyandSell1 result = new StockBuyandSell1();

        System.out.println(result.FindBestBuyandSellTime(nums));
    }
}
