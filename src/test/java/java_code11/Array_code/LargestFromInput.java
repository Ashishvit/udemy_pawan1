package java_code11.Array_code;

 class LargestFromInput {

    public static void main(String[] args) {

            String str = "abc10795pqr";
            char[] arr = str.toCharArray();
            int first = -1, second = -1, third = -1;
            for (int i = 0; i < arr.length; i++) {

                if (arr[i] >= '0' && arr[i] <= '9') {
// Check if ch's Unicode value is between '0'(48) and '9'(57). Example: '5' = 53, so 53 >= 48 && 53 <= 57 → true.
                    int num = arr[i] - '0';
                    //We do this because first, second, third are int and we need to compare numeric values.
                    if (num > first) {
                        third = second;
                        second = first;
                        first = num;
                    }
                    else if (num > second && num != first) {
                        third = second;
                        second = num;
                    }

                    else if (num > third && num != first && num != second) {
                        third = num;
                    }
                }
            }
            System.out.println("Largest = " + first);
            System.out.println("Second Largest = " + second);
            System.out.println("Third Largest = " + third);
        }
    }

      //  if (num > first) {
        //first = num;
      //  }


