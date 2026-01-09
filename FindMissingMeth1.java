public class FindMissingMeth1 {
    static int FindMissingVal(int arr[], int N) {
        // first lets find out which element is not in the array
        for (int i = 1; i < N; i++) {
            boolean found = false;// Is this number present in the array or not?”

            for (int j = 0; j < arr.length; j++) { // to chech whether the missing val is missing ..uusing linear
                                                   // search!
                if (arr[j] == i) {
                    found = true;
                    break;
                }
            }
            if (!found)// if i (the missing val) is not present , simply return that this is "the
                       // missing value !"
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 5 };
        int N = 5;
        int ans = FindMissingVal(arr, N);
        System.out.println(ans + " ");
    }
}
