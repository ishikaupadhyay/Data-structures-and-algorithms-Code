import java.util.Arrays;

public class nextGreaterEletoright {

    public int[] FindNextGreaterElement(int arr[]) {
        int n = arr.length;

        int newArr[] = new int[n];
        Arrays.fill(newArr, -1);// new arr of -1 se bhar diaa hai

        for (int i = 0; i < n; i++)
        {
            int currEle = arr[i];

            for (int j = i + 1; j < n; j++) {
                if (arr[j] > currEle) {
                    newArr[i] = arr[j];
                    break;
                }
            }
        }
        return newArr;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 2, 4 };
        nextGreaterEletoright result = new nextGreaterEletoright();
        int ans[] = result.FindNextGreaterElement(arr);

        System.out.println(Arrays.toString(ans));
    }
}
