public class MatrixRowColSum {
    public static void main(String[] args) {
        int matrix[][] = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        int rows = matrix.length, cols = matrix[0].length;

        System.out.println("Row-wise sum:");
        for (int i = 0; i < rows; i++) {
            int sum = 0;
            for (int j = 0; j < cols; j++)
                sum += matrix[i][j];
            System.out.println("Row " + (i+1) + ": " + sum);
        }

        System.out.println("Column-wise sum:");
        for (int j = 0; j < cols; j++) {
            int sum = 0;
            for (int i = 0; i < rows; i++)
                sum += matrix[i][j];
            System.out.println("Column " + (j+1) + ": " + sum);
        }
    }
}
