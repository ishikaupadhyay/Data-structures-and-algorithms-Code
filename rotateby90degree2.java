public class rotateby90degree2 {
    public void Rotation(int matrix[][]) {
        int n = matrix.length;
        // optimal method states: first transpose the matrix then reverse it -- and you
        // get the rotated MATRIX;
        // 1. TRANSPOSE:
        for (int i = 0; i < n; i++) {

            for (int j = i + 1; i < n; i++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        // STEP 2: REVERSE :
        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = n - 1;

            int temp = matrix[i][left];
            matrix[i][left] = matrix[i][right];
            matrix[i][right] = temp;
            left++;
            right--;
        }

    }

    public static void main(String[] args) {
        int matrix[][] = {
                { 2, 3 },
                { 4, 5 }
        };
        int m = 2;
        int n = 2;
        rotateby90degree2 result = new rotateby90degree2();
        result.Rotation(matrix);

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}