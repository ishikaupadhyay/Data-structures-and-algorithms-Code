public class majiorityn2 {
    public static int Majiority(int arr[]) {
        int cnt;
        for (int i = 0; i < arr.length; i++) {
            cnt = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == arr[i])
                    cnt++;
            }

            if (cnt > (arr.length) / 2) {
                return arr[i];
            }
        } 
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, -1, 0, 9, 9,9,9,9,9, 1, 2, 3 };
        System.out.println(Majiority(arr));
    }
}
