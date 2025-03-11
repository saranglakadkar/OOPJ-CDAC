import java.util.Arrays;
public class MergeSortedArrays {
    public static void merge(int A[], int B[]) {
        int n = A.length, m = B.length;

        for (int i = 0; i < n; i++) {
            if (A[i] > B[0]) {
                int temp = A[i];
                A[i] = B[0];
                B[0] = temp;
                Arrays.sort(B);
            }
        }
    }

    public static void main(String[] args) {
        int A[] = {1, 3, 5, 7};
        int B[] = {2, 4, 6, 8};
        merge(A, B);
        System.out.println("Merged Array: " + Arrays.toString(A) + " " + Arrays.toString(B));
    }
}
