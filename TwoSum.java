public class TwoSum {
    public static int[] FindTwoSum(int arr[], int k) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length ; j++) {
                if (arr[i] + arr[j] == k) {
                    return new int[] { i, j };
                }
            }

        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 6, 7, 8,0 };
        int k = 14;
        int[] result = FindTwoSum(arr, k);
        System.out.println("The two indices that give the k=14 are :" + result[0] + " and " + result[1]);
        System.out.print("THE VALUES ARE : "+arr[result[0]]+" and " + arr[result[1]]);
        

    }
}
