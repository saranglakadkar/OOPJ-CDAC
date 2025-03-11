import java.util.Arrays;

public class MaxProduct {
    public static void main(String[] args) {
        int arr[] = {2, 3, 5, 7, -7, 5, 8, -5};
        Arrays.sort(arr);
        int n = arr.length;

        int product1 = arr[n - 1] * arr[n - 2];
        int product2 = arr[0] * arr[1];

        if (product1 > product2)
            System.out.println("Pair: (" + arr[n - 2] + ", " + arr[n - 1] + "), Max Product: " + product1);
        else
            System.out.println("Pair: (" + arr[0] + ", " + arr[1] + "), Max Product: " + product2);
    }
}
