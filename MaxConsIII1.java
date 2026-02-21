public class MaxConsIII1 {
    public int FindMaximumConsecutiveOnesIII(int arr[], int k)
    {
        int maxlen = 0;
        for (int i = 0; i < arr.length; i++)
        {
            int zeros = 0;

            for (int j = i; j < arr.length; j++) 
            {

                if (arr[j] == 0) { //jitne 0 aa reh h count
                    zeros++;
                }
                if (zeros > k) {
                    break;//jyada ho rhe hai toh nikal jaoo waha see!
                }
                maxlen = Math.max(maxlen, j - i + 1);//returned : max consecutive ones ki length
            }
        }
        return maxlen;
    }

    public static void main(String[] args) {
        int arr[]={1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        int k=3;
        MaxConsIII1 result= new MaxConsIII1();
        System.out.println(result.FindMaximumConsecutiveOnesIII(arr, k));
    }
}
