
public class RotationbyKMethII {

    static void reverseArray(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    static int[] rotation(int arr[], String direction, int k) {
        int n = arr.length;
        k = k % n;// non negotiable step
        if (n == 0 || k == 0)
            return arr;

        if (direction.equals("left")) {
            // step 1:REVERSE THE COMPLETE ARRAY
            reverseArray(arr, 0, n - 1);

            // step 2: reverse the n-k elements:
            reverseArray(arr, 0, n - k-1);

            // step 3 : reverse the k elements :
            reverseArray(arr, n - k , n - 1);
        }

        else if (direction.equals("right")) {
            // step 1: reverse the entire array :
            reverseArray(arr, 0, n - 1);
            // step 2 : reverse the 1st k elemenst
            reverseArray(arr, 0, k - 1);

            // step 3 : reverse the remaining n-k elements :
            reverseArray(arr, k, n - 1);
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        System.out.println("original array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        int k = 2;
        String direction = "left";
        rotation(arr, direction, k);

        System.out.println();
        for (int x : arr) {
            System.out.print(x + " ");
            
            //if wants to call both operations together ;ie left n right both:
            //arr..
            //int left arr[]=arr.clone
            //int rightarr[]=arr.clone
            //and tehn call roattion(()) functinon for both spearately 
        }
    }

}
