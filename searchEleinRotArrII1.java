public class searchEleinRotArrII1 {

    public boolean SearchElementinRotatedArray(int arr[], int target) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 9;
        searchEleinRotArrII1 result = new searchEleinRotArrII1();
        System.out.println(result.SearchElementinRotatedArray(arr, target));
    }
}
