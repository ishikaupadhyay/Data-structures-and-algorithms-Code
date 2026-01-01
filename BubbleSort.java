public class BubbleSort {

    public static void Sorting(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n-1-i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }

        System.out.println("SORTED ARRAY :");
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }

    public static void main(String[] args) {
        int arr[] = { 34, 56, 76, 12, 6 };

        System.out.println("UNSORTED ARRAY: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        Sorting(arr);
    }
}
