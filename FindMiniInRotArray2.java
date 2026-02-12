public class FindMiniInRotArray2 {

    public int FindMinimumEle(int arr[]) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            // approach:as its a rotated array : So one part must be sorted ,lets find out
            // which :
            // checking if left right part is :

            if (arr[mid] > high) {
                low = mid + 1;// then minimum val will lie in right side of the array !
            } else {
                high = mid;// otherwise the minimum val will lie in the left side of the arr or at the mid
                           // itelf;
            }

            // OR
            // if (arr[mid] <high) {
            // high = mid - 1;
            // } else {
            // low = mid+1;
            // }

        }
        return arr[low];
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2, 3 };
        FindMiniInRotArray2 result = new FindMiniInRotArray2();
        System.out.println(result.FindMinimumEle(arr));
    }
}
