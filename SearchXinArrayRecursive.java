
import javax.naming.directory.SearchControls;

public class SearchXinArrayRecursive {

    public int SearchingX(int arr[], int low, int high, int target) {
        // base case :
        if (low > high)
            return -1;

        int mid = (low + high) / 2;

        if (arr[mid] == target) {
            return mid;
        } else if (target > mid) {
            return SearchingX(arr, mid + 1, high, target);
        }

        return SearchingX(arr, low, mid - 1, target);

    }

    public int search(int arr[], int target) {
        return SearchingX(arr, 0, arr.length - 1, target);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 7, 9 };
        int target = 9;

        SearchXinArrayRecursive result = new SearchXinArrayRecursive();
        int ans = result.search(arr, target);

        if (ans == -1) {
            System.out.println("TARGET VALUE IS NOT PRESENT IN THE ARRAY ");
        } else {
            System.out.println("the target val in the array is present at index " + ans);
        }
    }
}
