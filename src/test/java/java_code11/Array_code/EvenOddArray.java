package java_code11.Array_code;


    public class EvenOddArray {
        public static void main(String[] args) {
            int[] arr = {10, 21, 4, 45, 66, 93, 20, 5};

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0) {   // check even
                    System.out.println(arr[i] + " is Even");
                } else {                 // else odd
                    System.out.println(arr[i] + " is Odd");
                }
            }
        }
    }


