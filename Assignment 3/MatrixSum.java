public class MatrixSum {
    public static void main(String[] args) {
        int A[][] = { {1, 2}, {3, 4} };
        int B[][] = { {5, 6}, {7, 8} };
        int rows = A.length, cols = A[0].length;
        int sum[][] = new int[rows][cols];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                sum[i][j] = A[i][j] + B[i][j];

        System.out.println("Sum of matrices:");
        for (int[] row : sum) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }
    }
}
