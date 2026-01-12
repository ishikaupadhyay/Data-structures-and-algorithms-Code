public class longestSubarray {
    static int FindLongestSubarray(int arr[], int k) {
        int n = arr.length;
        int maxLength = 0;

        // for finding any possible startindex
        for (int startindex = 0; startindex < n; startindex++) {
            for (int endindex = startindex; endindex < n; endindex++) {
                int currentSum = 0;
                for (int i = startindex; i<=endindex; i++)
                    currentSum += arr[i];
                if (currentSum == k)
             {// finding he length of that subarray!
                        maxLength = Math.max(maxLength, endindex - startindex + 1);
                    }

            }

        }
        return maxLength;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 5, 6, 7, 1, 2, 2, 1 };
        int k = 6;
        int maxlen = FindLongestSubarray(arr, k);
        System.out.println("THE LONGEST SUBARRAY GIVING THE SUM k= " + maxlen);
    }
}
