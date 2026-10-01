package java_code11.Array_code;

public class MoveZeroInEnd {

        public static void main(String[] args) {

            int[] arr = {1, 0, 2, 0, 4, 0, 5};
            int j = 0;
            for (int i = 0; i < arr.length; i++) {

                if (arr[i] != 0) {   // Non-zero mila

                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    j++;
                }
            }
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
}
//    if (arr[i] != 0) → Check whether the current element is non-zero.
//If it is 0, the entire block is skipped and i moves to the next element.
//If it is non-zero, store its value in temp.
//Swap the non-zero value with arr[j] so the non-zero element moves to the front.
//j++ moves the placement pointer to the next position for the next non-zero element.
