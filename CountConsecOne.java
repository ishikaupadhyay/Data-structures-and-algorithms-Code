public class CountConsecOne {
    static int FindMaxConsecOne(int arr[]) {
        int max1 = 0;
        int cnt = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                cnt++;
            } else {
                cnt = 0;

            }
            max1 = Math.max(max1, cnt);
        }
        return max1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 0, 1, 1, 1, 0, 0, 0, 1, 1,1, 1 };
        System.out.println(FindMaxConsecOne(arr));
    }
}
