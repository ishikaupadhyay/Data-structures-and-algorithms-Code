import java.util.ArrayList;
import java.util.List;

public class MajiorityNby3III {

    public List<Integer> CountMajiorityNby3(int arr[]) {
        int n = arr.length;
        int cnt1 = 0;
        int cnt2 = 0;
        int ele1 = Integer.MIN_VALUE;
        int ele2 = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (cnt1 == 0 && ele2 != arr[i]) {
                cnt1 = 1;
                ele1 = arr[i];
            } else if (cnt2 == 0 && ele1 != arr[i]) {
                cnt2 = 1;
                ele2 = arr[i];
            } else if (arr[i] == ele1) {
                cnt1++;
            } else if (arr[i] == ele2) {
                cnt2++;
            }

            else {
                cnt1--;
                cnt2--;
            }
        }

        cnt1 = 0;
        cnt2 = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == ele1) {
                cnt1++;
            }
            if (arr[i] == ele2) {
                cnt2++;
            }
        }

        int majiority = (n / 3) + 1;
        List<Integer> result = new ArrayList<>();
        if (cnt1 > majiority) {
            result.add(ele1);
        }
        if (cnt2 > majiority && ele1 != ele2) {
            result.add(ele2);
        }
return result;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 1, 1, 1, 0, 3, 4 };
        MajiorityNby3III obj = new MajiorityNby3III();
        System.out.println(obj.CountMajiorityNby3(arr));
    }
}
