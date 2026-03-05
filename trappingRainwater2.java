public class trappingRainwater2 {
    public int traprainwater(int[] height) {
        int n = height.length;

        // optimal approach :
        /*
         * using 2 ptrs , 2 ptrs for maxleft and maxright
         * find the totaldepth or water
         */

        int left = 0;
        int right = n - 1;

        int maxLeft = 0;
        int maxRight = 0;

        int totalwater = 0;

        // run until the left and right ptrs doesnt come together:
        while (left <= right) {
            if (height[left] <= height[right]) {
                if (height[left] >= maxLeft) {
                    maxLeft = height[left];

                } else {
                    totalwater += maxLeft - height[left];
                }
                left++;
            } else {
                if (height[right] >= maxRight) {
                    maxRight = height[right];
                } else {
                    totalwater += maxRight - height[right];
                }right--;
            }
           
        }
        return totalwater;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 2, 0, 3, 2, 5 };
        trappingRainwater2 result = new trappingRainwater2();
        System.out.println(result.traprainwater(arr));

    }
}
