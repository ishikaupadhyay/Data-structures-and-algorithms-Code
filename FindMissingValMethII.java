public class FindMissingValMethII {
    public static int FindMissing(int arr[], int N) {

        // In XOR same values make up the O/p =0, and if one zero val wth one non0 ->
        // O/P=that value itself
        // when (xor1)xor(xor2)=only missing val remain then(kyuki it would be present
        // only in array with 1 to N elements!)
        int xor1 = 0;
        int xor2 = 0;
        // xor1:calculates xor of 1 to N elemenst
        // xor2 -for calculating xor of given array elements

        for (int i = 0; i < N - 1; i++) {
            xor1 ^= (i + 1);
            xor2 ^= arr[i];
        }
        // xor1=[1,2,3,4] as the loop ran frm 1 to 4 only , to make it till 5
        xor1 ^= N;
        return xor1 ^ xor2;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 5 };
        int N = 5;
        int ans = FindMissing(arr, N);
        System.out.println("MISSING VALUE IN THE GIVEN ARRAY :" + ans);
    }
}
