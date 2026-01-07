import java.util.Arrays;

public class RotationK {
  public static void rightRotation(int arr[], int k) {
    int n = arr.length;
    k = k % n;
    int temp[] = Arrays.copyOfRange(arr, n - k, n);

    for (int i = n - k - 1; i >= 0; i--) {// shifting bache hue element to right !
      arr[i + k] = arr[i];
    }

    for (int i = 0; i < k; i++) {
      arr[i] = temp[i];
    }

  }

  public static void leftRotation(int arr[], int k) {
    int n = arr.length;
    k = k % n;// actual mai itni baar rotation krna haii!//ex=k=15, 15=6+6+3{6 times
              // measn-->ORIGINAL ARR only }
    // toh jitna modulus aa rha hai - bs utni baar krna hai!

    // storing ele(jo rotate honge..)..alg se
    int temp[] = Arrays.copyOfRange(arr, 0, k);// k prints till k-1 !

    // shifting the other elements now(the left ones)to left position by k positions
    for (int i = k; i < n; i++) {
      arr[i - k] = arr[i];
    }

    // pastig the stored var at last now(left rotation will happen now!)
    for (int i = 0; i < k; i++) {
      arr[n - k + i] = temp[i];// the temp stores at last positions
    }

  }

  public static void main(String[] args) {
    int arr[] = { 1, 3, 4, 5, 7, 8 };
    int k = 2;// no.of times rotation!

    System.out.println("ORIGINAL ARRAY: ");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();

    leftRotation(arr, k);
    System.out.println("Left Rotated array: ");
    System.out.print(Arrays.toString(arr));

    System.out.println();

    int arr2[] = { 1, 2, 3, 4, 5 ,6};
    System.out.println("ORIGINAL ARRAY: ");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr2[i] + " ");
    }
    rightRotation(arr2, k);
    System.out.println("Right Rotated array: ");
    System.out.print(Arrays.toString(arr2));

  }

}
