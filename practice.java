package Bubble_Sort;
import java.util.Arrays;

public class practice {
    public static void main(String[] args) {
        int arr[] = { 23, 42, 41, 39, 38, 37, 22, 20, 2, 3, 1, 6, 4, 5 };
        bubble(arr);
        System.out.print("The Sorted Array Is:");
        System.out.print(Arrays.toString(arr));
    }

    static void bubble(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }
}
