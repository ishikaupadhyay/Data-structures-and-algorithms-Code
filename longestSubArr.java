public class longestSubArr {
    static int FindLongestSubarray(int arr[],int k){
        int maxlen=0;
        for(int i=0;i<arr.length;i++){ //loop for finding strtindex
            for(int j=i;j<arr.length;j++)//loop for finding ending index
            {
                int sum=0;
                for(int idx=i;idx <=j;idx++){
                    sum+=arr[idx];
                }

                if(sum==k){
                    maxlen=Math.max(maxlen,j-i+1);
                }
            }
        }return maxlen;
    }
    public static void main(String[] args) {
        int arr[]={1,2,-1,0,2,-2,1,3};
        int k =2;

        int ans=FindLongestSubarray(arr,k);
        System.out.println(ans);
    }
}
