public class trapppingRainwater1 {
    public int traprainwater(int[] arr) {
        int n = arr.length;
        int totalwater = 0;

        for (int i = 0; i < n; i++) {
            int maxLeft = 0;
            int maxRight = 0;

            for (int j = 0; j <= i; j++) {
                if (arr[j] > maxLeft) {
                    maxLeft = arr[j];
                }
            }

            for (int j = i; j < n; j++) {
                if (arr[j] > maxRight) {
                    maxRight = arr[j];
                }
            }

            totalwater += Math.min(maxLeft, maxRight) - arr[i];
        }
        return totalwater;
    }

    public static void main(String[] args) {
        int arr[] = {4,2,0,3,2,5 };
        trapppingRainwater1 result = new trapppingRainwater1();
        System.out.println(result.traprainwater(arr));
    }
}
