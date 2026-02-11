public class SearchXinArrayIterative {

    public int SearchingX(int arr[], int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (target > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 7, 9 };
        int target = 9;

        SearchXinArrayIterative result = new SearchXinArrayIterative();
        System.out.println(result.SearchingX(arr, target));
    }
}
