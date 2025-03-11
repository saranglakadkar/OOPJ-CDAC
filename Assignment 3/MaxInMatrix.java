public class MaxInMatrix {
    public static void main(String[] args) {
        int matrix[][] = { {1, 9, 3}, {4, 2, 8}, {6, 5, 7} };
        int max = Integer.MIN_VALUE;

        for (int[] row : matrix)
            for (int val : row)
                if (val > max) max = val;

        System.out.println("Maximum Element: " + max);
    }
}
