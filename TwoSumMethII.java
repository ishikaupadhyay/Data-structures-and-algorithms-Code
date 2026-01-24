import java.util.Arrays;

public class TwoSumMethII {
    public static int[] FindTwoSum(int arr[], int k) {
        int n = arr.length;

        int newArr[][] = new int[n][2];// to store the values of arr and its index

        // getting the values in the new arr frm the original arr

        for (int i = 0; i < n; i++) {
            newArr[i][0] = arr[i];// values
            newArr[i][1] = i;
        }

        Arrays.sort(newArr, (a, b) -> Integer.compare(a[0], b[0]));// sorting the arr(only values , index remains at
                                                                   // their position)

        int left = 0;// 1st ptr
        int right = n - 1;// 2nd ptr

        while (left < right) {
            int sum = newArr[left][0] + newArr[right][0];

            if (sum == k) {
                return new int[] { newArr[left][1], newArr[right][1] };
            } else if (sum < k)
                left++;
            else
                right--;// when sum>k;
        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 6, 8, 0, 4 };
        int k = 9;
        int[] result = FindTwoSum(arr, k);
        System.out.println("The two indices that give the k=14 are :" + result[0] + " and " + result[1]);
        System.out.print("THE VALUES ARE : " + arr[result[0]] + " and " + arr[result[1]]);
    }
}
