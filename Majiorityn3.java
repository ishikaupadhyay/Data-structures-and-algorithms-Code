public class Majiorityn3 {

    public int CountMajiorityNby3(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < arr.length; i++) {
            int cnt = 0;

            for (int j = 0; j < n; j++) {
                if (arr[j] == arr[i])
                    cnt++;
            }
            if (cnt > (n / 3))
                return arr[i];// return the majiority element!!
        }
        return -1;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 1, 1, 1, 0, 3, 4 };
        Majiorityn3 obj = new Majiorityn3();
        System.out.println(obj.CountMajiorityNby3(arr));
    }
}
