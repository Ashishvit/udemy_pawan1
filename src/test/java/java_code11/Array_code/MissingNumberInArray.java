package java_code11.Array_code;

public class MissingNumberInArray {
    public static void main(String[] args) {

        int[] arr = {7, 8, 9, 10, 12};

        int start = 7;
        int end = 12;

        int actualSum = 0;

        // Calculate actual sum
        for (int num : arr) {
            actualSum = actualSum + num;
        }

        // Expected sum
        int expectedSum = ((end - start + 1) * (start + end)) / 2;

        // Missing number
        int missing = expectedSum - actualSum;

        System.out.println("Missing Number = " + missing);
    }
}

//missing number from 1 ot n

//int arr[] = {1, 2, 4, 5};
//int n = 5;

//int expectedSum = n * (n + 1) / 2;
//int actualSum = 0;

// Calculate actual sum
        //for (int num : arr) {
//actualSum = actualSum + num;
     //   }

//int missing = expectedSum - actualSum;

       // System.out.println("Missing Number: " + missing);
    //}
