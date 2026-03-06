public class HistogramRectangle1 {
    public int LargestRectangleinHistogram(int height[]) {
        int n = height.length;

        int maxArea = 0;

        for (int i = 0; i < n; i++) {
            int minHeight = Integer.MAX_VALUE;
            for (int j = i; j < n; j++) {
                minHeight = Math.min(minHeight, height[j]);

                // calculating area
                int area = minHeight * (j - i + 1);

                maxArea = Math.max(maxArea, area);
            }
        }

        return maxArea;

    }

    public static void main(String[] args) {
        int arr[] = { 2, 1, 5, 6, 2, 3 };
        HistogramRectangle1 result = new HistogramRectangle1();
        System.out.println(result.LargestRectangleinHistogram(arr));
    }
}