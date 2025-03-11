public class SumAndAverage {
    public static void main(String[] args) {
        int arr[] = {3, 6, 9, 12};
        int sum = 0;

        for (int num : arr) sum += num;

        double avg = (double) sum / arr.length;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
    }
}
