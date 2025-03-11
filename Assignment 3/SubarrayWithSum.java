public class SubarrayWithSum {
    public static void main(String[] args) {
        int arr[] = {1, 4, 20, 3, 10, 5};
        int S = 33, start = 0, sum = 0;

        for (int end = 0; end < arr.length; end++) {
            sum += arr[end];

            while (sum > S) {
                sum -= arr[start];
                start++;
            }

            if (sum == S) {
                System.out.println("Subarray found from index " + start + " to " + end);
                return;
            }
        }
        System.out.println("No subarray found");
    }
}
