public class FirstandLastOccurence1 {

    public int FirstOccurence(int arr[], int target) {

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }

    public int LastOccurence(int arr[], int target) {

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 4, 13, 13, 13, 20, 40 };
        int target = 13;

        FirstandLastOccurence1 result = new FirstandLastOccurence1();
        int ans = result.LastOccurence(arr, target);
        int anss = result.FirstOccurence(arr, target);
        System.out.println("LAST OCCURENCE OF TARGET " + target + " IS = " + ans);
        System.out.println("FIRST OCCURENCE OF TARGET " + target + " IS = " + anss);
    }
}a
