import java.util.Arrays;

public class agressivecows1 {
    public boolean isCapable(int stalls[], int cows, int d) {
        // function to check whether the given no. of cows canbe fiited to teh given
        // stalls wth diff distances1

        int cnt = 1;
        int lastPos = stalls[0];

        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - lastPos >= d) {
                cnt++;
                lastPos = stalls[i];
            }

            // if all cows hv entered :
            if (cnt >= cows)
                return true;

        }
        return false;
    }

    public int AgressiveCows(int stalls[], int cows) {
        // step 1:
        Arrays.sort(stalls);
        // step 2 :

        int maxDis = stalls[stalls.length - 1] - stalls[0];
        // step 3 :
        int ans = 0;

        for (int i = 1; i <= maxDis; i++) {
            if (isCapable(stalls, cows, i))

            {
                // update ans :
                ans = i;// iis the distances (min which is max among all)
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int stalls[] = { 0,3,4,7,10,9 };
        int cows = 4;
        agressivecows1 result = new agressivecows1();
        System.out.println(result.AgressiveCows(stalls, cows));
    }
}
