package java_code11.Array_code;

public class Frequency_int_array {

    public static void main(String[] args) {

        int arr[] = {0, 4, 4, 5, 6, 6, 7, 7, 8, 9,9,9,9,9};
        //int[] arr = new int[]{1, 2, 3};
        int freq[] = new int[arr.length]; // store frequencies
        for (int i = 0; i < arr.length; i++) {
            freq[i] = 1; // start with count = 1
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    freq[i]++;
                    // mark as visited with Integer.MIN_VALUE
                    arr[j] = '\0';
                }
            }
        }
        // Display characters and frequencies
        System.out.println("Characters and their corresponding frequencies:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != '\0') {
                System.out.println(arr[i] + "->" + freq[i] + " ");
            }
        }
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (freq[i] > max) {
                max = freq[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
          if (freq[i] == max) {
              System.out.println(arr[i] + " -> " + freq[i]);
          break;
          }
       }
    }
}


