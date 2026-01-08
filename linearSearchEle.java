public class linearSearchEle {
    public static void main(String[] args) {
        int arr[]={1,3,4,6,5,4,3,1,0};
        int ele=4;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==ele){
                System.out.print(i+",");
            }
        }

    }
}
