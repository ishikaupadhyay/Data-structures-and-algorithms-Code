public class findrotations2 {
    // BETTER APPR
    public int FindRotations(int arr[]) {

        // condition is : where arr shall break is : arr[i]>arr[i+1], //i+1= no. of
        // roatations!

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[i + 1]) {

                return i + 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2, 3 };
        findRotations result = new findRotations();
        System.out.println(result.FindRotations(arr));
    }
}
