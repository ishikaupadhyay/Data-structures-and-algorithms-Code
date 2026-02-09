import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajiorityNby3II {

    public List<Integer> CountMajiorityNby3(int arr[]) {
        int n = arr.length;

        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> mpp = new HashMap<>();

        int majiority = (n / 3) + 1;// condition is more than n/3;

        for (int i = 0; i < n; i++) {
            mpp.put(arr[i], mpp.getOrDefault(arr[i] , 0)+1);

            if (mpp.get(arr[i]) == majiority){
                result.add(arr[i]);
            }
            if (result.size() == 2)
                break;
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 1, 1, 1, 0, 3, 4 };
        MajiorityNby3II obj = new MajiorityNby3II();
        System.out.println(obj.CountMajiorityNby3(arr));
    }
}
