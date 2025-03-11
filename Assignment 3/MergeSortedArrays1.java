import java.util.Arrays;

public class MergeSortedArrays1 {
    public static void merge(int A[], int B[]) {
        int p = A.length, q = B.length;

        for (int i = 0; i < p; i++) {
            if (A[i] > B[0]) {
                int temp = A[i];
                A[i] = B[0];
                B[0] = temp;
                Arrays.sort(B);
            }
        }
    }

    public static void main(String[] args) {
        int A[] = {1, 5, 6, 7, 8, 10};
        int B[] = {2, 4, 9};

        merge(A, B);

        System.out.println("Sorted A: " + Arrays.toString(A));
        System.out.println("Sorted B: " + Arrays.toString(B));
    }
}
