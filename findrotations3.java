public class findrotations3 {

    public int FindRotations(int arr[]) {
        int low = 0;
        int high = arr.length - 1;

        while(low<=high){

            int mid =low+(high-low)/2;

            if(arr[mid]<arr[high]){
                high=mid-1;
            }else {
                low=mid+1;
            }
        }return low;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2, 3 };
        findRotations result = new findRotations();
        System.out.println(result.FindRotations(arr));
    }

}
