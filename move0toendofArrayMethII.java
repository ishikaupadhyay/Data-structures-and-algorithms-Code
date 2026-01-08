public class move0toendofArrayMethII {

    static void shiftingZeros(int arr[]) {

        // approach - 2 pointeers{i - for finding non zer0 in the arr and j for =
        // finding 0 and shifing it back!}

        int j = 0;// found out the first zero

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                // Move j to next zero
                j++;

            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 0, 0, 0, 0, 7, 6, 0, 0 };
        shiftingZeros(arr);
        for (int num : arr)
            System.out.print(num + " ");
        System.out.println();

    }

}
