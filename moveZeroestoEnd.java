public class moveZeroestoEnd {

    static void shiftZeroToEnd(int arr[]) {
        // creating a temp arr to store non zero element:
        int temp[] = new int[arr.length];
        int index = 0;// inexing for temp

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                temp[index] = arr[i];
                index++;
            }
        }

        // copying back the non zero lememts to the strting of the array :

        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 1, 0, 0, 0, 9, 6, 0 };
        shiftZeroToEnd(arr);
    }
}
