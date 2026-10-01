package java_code11.Array_code;

public class MergeArrays {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};

        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] merged = new int[n1 + n2];

        // Copy arr1 elements
        for (int i = 0; i < n1; i++) {
            merged[i] = arr1[i];
        }
        // Copy arr2 elements
        for (int i = 0; i < n2; i++) {
            merged[n1 + i] = arr2[i];
        }
        // Print merged array
        System.out.println("Merged Array:");
        for (int i = 0; i < merged.length; i++) {
            System.out.print(merged[i] + " ");
        }
    }
}

