public class MatrixMultiplication {
    public static void main(String[] args) {
        int A[][] = {{1, 2}, {3, 4}};
        int B[][] = {{5, 6}, {7, 8}};
        int rows = A.length, cols = B[0].length, common = A[0].length;
        int C[][] = new int[rows][cols];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                for (int k = 0; k < common; k++)
                    C[i][j] += A[i][k] * B[k][j];

        System.out.println("Matrix Multiplication Result:");
        for (int[] row : C) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }
    }
}
