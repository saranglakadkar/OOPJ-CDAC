public class RemoveDuplicates {
    public static int removeDuplicates(int arr[]) {
        if (arr.length == 0) return 0;
        int index = 0; 

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[index]) {
                index++;
                arr[index] = arr[i];
            }
        }
        return index + 1;
    }

    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2, 3, 4, 4, 5};
        int newSize = removeDuplicates(arr);

        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < newSize; i++)
            System.out.print(arr[i] + " ");
    }
}
