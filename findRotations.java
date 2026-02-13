public class findRotations {
    public int FindRotations(int arr[]) {

        // ese this code is right , but it give out only the minimum val not the index
        // of it
        /*
         * int min = Integer.MAX_VALUE;
         * for (int i = 0; i < arr.length; i++) {
         * min = Math.min(min, arr[i]);
         * }
         * return min;
         * }
         */

        int minVal = arr[0];
        int minIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            if (minVal > arr[i]) {
                minVal = arr[i];// the most minimum val is now the minVal
                minIndex = i;// index of minVal gets stored here
            }
        }
        return minIndex; //the no.of index= rotations 
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2, 3 };
        findRotations result = new findRotations();
        System.out.println(result.FindRotations(arr));
    }
}
