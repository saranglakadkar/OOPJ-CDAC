
import java.util.Scanner;

public class PrintMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows and columns: ");
        int m = sc.nextInt(), n = sc.nextInt();
        int matrix[][] = new int[m][n];

        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = sc.nextInt();

        System.out.println("Matrix is:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }
        sc.close();
    }
}
