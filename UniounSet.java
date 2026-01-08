import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class UniounSet {

    public static List<Integer> FindUnion(int arr1[], int arr2[]) {
        Set<Integer> st = new TreeSet<>();

        for (int num : arr1) {
            st.add(num);/// arr1 added to set
        }
        for (int num : arr2) {
            st.add(num);// arr2 added to set
        }

        // converting set to List NOW:(coz the ans will be displyed in list format only!)
       return new ArrayList<>(st);
    }

    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4, 5 };
        int arr2[] = { 2, 2, 3, 3 };
        

        List<Integer> ans = FindUnion(arr1, arr2 );

        System.out.println("UNION OF THE TWO GIVEN ARRAYS:");
        for (int val : ans) {
            System.out.print(val + " ");
        }
    }

}
