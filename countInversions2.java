public class countInversions2 {
    public int FindCountInversions(int arr[]) {
        return mergesort(arr, 0, arr.length - 1);
    }

    public int merge(int[] arr, int low, int mid, int high) {
        // Temporary array
        int[] temp = new int[high - low + 1];

        // Starting indices of left and right halves
        int left = low;
        int right = mid + 1;
        int k = 0;

        // Variable to count inversions
        int cnt = 0;

        // Merge elements in sorted order
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp[k++] = arr[left++];
            } else {
                temp[k++] = arr[right++];
                cnt += (mid - left + 1); // Count inversions
            }
        }

        // Copy remaining elements of left half
        while (left <= mid) {
            temp[k++] = arr[left++];
        }

        // Copy remaining elements of right half
        while (right <= high) {
            temp[k++] = arr[right++];
        }

        // Copy back to original array
        for (int i = low; i <= high; i++) {
            arr[i] = temp[i - low];
        }

        return cnt;
    }

    public int mergesort(int arr[], int low, int high) {
        int cnt = 0;

        if (low >= high)
            return cnt;
        int mid = (low + high) / 2;

        cnt += mergesort(arr, low, mid);
        cnt += mergesort(arr, mid + 1, high);
        cnt += merge(arr, low, mid, high);
        return cnt;
    }

    public int numberOfInversions(int[] arr) {
        return mergesort(arr, 0, arr.length - 1);
    }

    public static void main(String[] args) {
        int arr[] = { 5, 3, 2, 1, 4 };
        countInversions2 obj = new countInversions2();

        // Count inversions
        int cnt = obj.numberOfInversions(arr);

        System.out.println("The number of inversions are: " + cnt);
    }
}