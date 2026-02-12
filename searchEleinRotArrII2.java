public class searchEleinRotArrII2 {
   

    public boolean SearchElementinRotatedArray(int arr[], int target) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return true;
            }

            // check whether left part is sorted
            if (arr[low] <= arr[mid]) {
                // does target lie b/w low and mid
                if (arr[low] <= target && target <= arr[mid]) {
                    high = mid - 1;
                } else {
                    // check the right part of the arr then,
                    low = mid + 1;
                }
            }
            // checking whether right parrt is SORTED :

            else {
                if (arr[mid] <= target && target <= arr[high]) {
                    low = mid + 1;
                } else {// check the left part;
                    high = mid - 1;

                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7,0, 0, 1, 2 };
        int target = 12;
        searchEleinRotArrII2 result = new searchEleinRotArrII2();
        System.out.println(result.SearchElementinRotatedArray(arr, target));
    }
}


