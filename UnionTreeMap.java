import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class UnionTreeMap {
    public static List<Integer> FindUnion(int arr1[], int arr2[], int n, int m) {
        TreeMap<Integer, Integer> freq = new TreeMap<>();

        for (int i = 0; i < n; i++) { // adding values of arr1 in the tree created
            freq.put(arr1[i], freq.getOrDefault(arr1[i], 0) + 1);// freq.getorDf- task: in the arr1 , whatevr elements
                                                                                 // comes..index+1 , if not 0
        }

        for (int i = 0; i < m; i++) { // adding values of arr2 in the tree created
            freq.put(arr2[i], freq.getOrDefault(arr1[i], 0) + 1);// freq.getorDf- task: in the arr2 , whatevr elements
                                                                 // comes..index+1 , if not 0
        }

        List<Integer> Union = new ArrayList<>();
        { // Because function must return List, not array.

            // So we’ll copy all keys from map into this list.
            for (int key : freq.keySet()) //keySet return only  unique vals
                Union.add(key);// adding arr1 and arr2 ie UNion HAPPENING

            return Union;
        }
    }

    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4, 5, 6 };
        int arr2[] = { 2, 2, 3, 4, 5 };
        int n = 6;
        int m = 5;
        List<Integer> union = FindUnion(arr1, arr2, n, m);

        for (int val : union) {
            System.out.print(val + " ");
        }

    }
}