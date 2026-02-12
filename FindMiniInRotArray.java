public class FindMiniInRotArray {
    public int FindMinimumEle(int arr[]) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
        }
        return min;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2, 3 };
        FindMiniInRotArray result = new FindMiniInRotArray();
        System.out.println(result.FindMinimumEle(arr));
    }
}
