import java.util.Arrays;

public class D24_1_insertion_sort {
    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 20, 50, 25, 67, 79, 12, 15 };
        insertionSort(arr);
        System.out.println("sorted array is " + Arrays.toString(arr));
    }
}
