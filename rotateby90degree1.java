public class rotateby90degree1 {
    public int[][] Rotation(int matrix[][], int m, int n) {

        // int m ;//row size
        // int n; //col size
        int rotatedmatrix[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                rotatedmatrix[j][n - 1 - i] = matrix[i][j];
            }
        }
        return rotatedmatrix;
    }

    public static void main(String[] args) {
        int matrix[][] = {
                { 2, 3 },
                { 4, 5 }
        };
        int m = 2;
        int n = 2;
        rotateby90degree1 result = new rotateby90degree1();
        int rotated[][] = result.Rotation(matrix, m, n);

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(rotated[i][j] + " ");
            }
            System.out.println();
        }
    }
}