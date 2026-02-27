import java.util.Arrays;

public class nextGreaterEle21 {
    public int[] FindNextGreaterElement(int arr[]) {
        int n = arr.length;
        int newArr[] = new int[n];// to store answer
        Arrays.fill(newArr, -1);// mtlb newArr ke andar -1 value daldi haii!

        for (int i = 0; i < arr.length; i++) {
            int currEle = arr[i];
            for (int j = 1; j < arr.length; j++) {
                int ind = (i + j) % n;

                if (arr[ind] > currEle) {
                    newArr[i] = arr[ind];
                    break;
                }
            }
        }
        return newArr;
    }

    public static void main(String[] args) {
        int arr[] = { 6, 8, 0, 1, 3 };
        nextGreaterElement result = new nextGreaterElement();
        int ans[] = result.FindNextGreaterElement(arr);
        System.out.println(Arrays.toString(ans));
    }
}
