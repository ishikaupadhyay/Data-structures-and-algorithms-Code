public class CountInversions {
    public int FindCountInversions(int arr[]) {
        int n = arr.length;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            // cnt = 0;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    cnt++;

                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 3, 2, 1, 4 };
        CountInversions result = new CountInversions();
        System.out.println(result.FindCountInversions(arr));
    }
}
