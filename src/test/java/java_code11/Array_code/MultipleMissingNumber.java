package java_code11.Array_code;
import java.util.HashSet;

public class MultipleMissingNumber {

        public static void main(String[] args) {
            // Input array
            int[] arr = {1, 2, 4, 6, 7, 9};
            // Range
            int start = 1;
            int end = 9;
            // Create HashSet
            HashSet<Integer> set = new HashSet<>();
            // Store all array elements in HashSet
            for (int num : arr) {
                set.add(num);
            }
            // Check every number from start to end
            for (int i = start; i <= end; i++) {

                // If number is not present in HashSet
                if (!set.contains(i)) {
                    System.out.print(i);
                }
            }
        }
    }

