 package java_code11.Array_code;

public class ArrayLeftRotation {

        public static void main(String[] args) {

            int[] arr = {1, 2, 3, 4, 5};
            // Left rotate by 3 positions
            for (int k = 1; k <= 3; k++) {
                // Store first element
                int first = arr[0];
                // Shift elements to the left
                for (int i = 0; i < arr.length - 1; i++) {
                    arr[i] = arr[i + 1];
                }
                // Put first element at last position
                arr[arr.length - 1] = first;
            }
            // Print array
            System.out.print("Array after left rotation: ");
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
    }

