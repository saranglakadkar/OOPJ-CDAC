public class DiagonalSum {
    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int n = matrix.length, sum = 0;

        for (int i = 0; i < n; i++)
            sum += matrix[i][i] + matrix[i][n - 1 - i];

        if (n % 2 != 0) sum -= matrix[n / 2][n / 2];

        System.out.println("Diagonal Sum: " + sum);
    }
}
