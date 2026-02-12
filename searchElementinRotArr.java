public class searchElementinRotArr {
    public int SearchElementinRotatedArray(int arr[], int target) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;
        searchElementinRotArr result = new searchElementinRotArr();
        System.out.println(result.SearchElementinRotatedArray(arr, target));
    }
}
