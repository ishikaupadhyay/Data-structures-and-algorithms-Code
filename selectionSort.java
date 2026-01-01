public class selectionSort {
    public static void Sorting(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n ; j++) {
                if (arr[j] <arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        System.out.println("SORTED ARRAY :");
        for (int num : arr) {
            System.out.print(num + " "); 
        }

    }
    public static void main(String[] args) {
        int arr[] = { 34, 56, 76, 12, 6 };
       
            System.out.println("UNSORTED ARRAY: " );
        for(int num:arr){
            System.out.print(num+" ");
        }
        Sorting(arr);
    }
}
