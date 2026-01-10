public class NumOccurenceOnceMethI {
    static int OnceOccurence(int arr[]) {
        // brute force apprpach
        // for i loop- for taking out one no.
        // for j loop: count of that no. will be checked
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int cnt = 0;// cnt has to be in i loop as to reset it to 0 for traversing to each element!
            {
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j] == num)
                        cnt++;

                }
                if (cnt == 1)
                    return num;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 3, 4 };
        int ans = OnceOccurence(arr);
        System.out.println(ans);

    }
}
