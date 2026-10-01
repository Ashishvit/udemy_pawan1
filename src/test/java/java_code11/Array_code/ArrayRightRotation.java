package java_code11.Array_code;

public class ArrayRightRotation {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        // Rotate 3 times
        for (int k = 1; k <= 3; k++) {

            int last = arr[arr.length - 1];
            // Shift elements to the right
            for (int i = arr.length - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            // Put last element at first position
            arr[0] = last;
        }
        // Print array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
