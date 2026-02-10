public class longestConsecutiveArray {
    public boolean linearSearch(int arr[], int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x)
                return true;
        }
        return false;
    }

    public int longestConsecutive(int arr[]) {
        int n = arr.length;
        int longest = 1;
        int cnt = 0;
        if (arr.length == 0)
            return 0;

        for (int i = 0; i < n; i++) {
            int x = arr[i];

            while (linearSearch(arr, x + 1)) {
                x += 1;
            }
            cnt++;
        }
        int result = (Math.max(longest, cnt));
        return result;

    }

    public static void main(String[] args) {
        int arr[] = { 0, 3, 7, 2, 5, 8, 4, 6, 0 };
        longestConsecutiveArray result = new longestConsecutiveArray();
        System.out.println(result.longestConsecutive(arr));
    }
}
