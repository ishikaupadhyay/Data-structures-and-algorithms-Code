public class FirstandLastOccurence2 {

    public int FirstOccurence(int arr[], int target) {
//using binary searches 
        int low = 0;
        int high = arr.length - 1;

        int anss = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                anss = mid;
                high = mid - 1;
            }

            else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return anss;
    }

    public int LastOccurence(int arr[], int target) {

        int low = 0;
        int high = arr.length - 1;
        // int mid = low + (high - low) / 2;::: yha nhi aaegaa
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                ans = mid;
                low = mid + 1;
            }

            else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 4, 13, 13, 13, 20, 40 };
        int target = 13;

        FirstandLastOccurence2 result = new FirstandLastOccurence2();
        int ans = result.LastOccurence(arr, target);
        int anss = result.FirstOccurence(arr, target);
        System.out.println("LAST OCCURENCE OF TARGET " + target + " IS = " + ans);
        System.out.println("FIRST OCCURENCE OF TARGET " + target + " IS = " + anss);
    }
}
