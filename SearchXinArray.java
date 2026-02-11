public class SearchXinArray {
    public int SearchingX(int arr[], int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 7, 9 };
        int x = 4;

        SearchXinArray result = new SearchXinArray();
        System.out.println(result.SearchingX(arr, x));
    }
}
