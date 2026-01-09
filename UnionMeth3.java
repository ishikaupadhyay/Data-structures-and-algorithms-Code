import java.util.ArrayList;
import java.util.List;

public class UnionMeth3 {

    static List<Integer> FindUnion(int arr1[], int arr2[], int n, int m) {

        List<Integer> union = new ArrayList<>();// list to store the :union of arr
        int i = 0, j = 0;
        // iterating while both arrays have elements!
        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                if (union.isEmpty() || union.get(union.size() - 1) != arr1[i])
                    union.add(arr1[i]);
                i++;
            }

            else if (arr1[i] > arr2[j]) {
                if (union.isEmpty() || union.get(union.size() - 1) != arr2[j])
                    union.add(arr2[j]);
                j++;

            } else {
                // when size of both arrays are equal!
                if (union.isEmpty() || union.get(union.size() - 1) != arr1[i])
                    union.add(arr1[i]);
                i++;
            }
        }

        // when sizes are unequal
        // when elements in arr 1 are left to iterate :
        while (i < n) {
            if (union.isEmpty() || union.get(union.size() - 1) != arr1[i])
                union.add(arr1[i]);
            i++;
        }
        while (j < m) { // elements in arr2 are left so,
            if (union.isEmpty() || union.get(union.size() - 1) != arr2[j])
                union.add(arr2[j]);
            j++;

        }
        return union;

    }

    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4, 5, 6 };
        int arr2[] = { 2, 3, 3, 4, 5, 7 };
        int n = arr1.length;
        int m = arr2.length;
        List<Integer> ans = FindUnion(arr1, arr2, n, m);
        for (int result : ans) {
            System.out.print(result + " ");
        }

    }
}
