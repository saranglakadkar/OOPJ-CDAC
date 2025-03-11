public class CountNumbers {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33, 36, 39, 42, 45, 48};
        int evenCount = 0, oddCount = 0, multipleOf3 = 0;

        for (int num : arr) {
            if (num % 2 == 0) evenCount++;
            else oddCount++;
            if (num % 3 == 0) multipleOf3++;
        }

        System.out.println("Even Count: " + evenCount);
        System.out.println("Odd Count: " + oddCount);
        System.out.println("Multiples of 3: " + multipleOf3);
    }
}
