package java_code11.Array_code;

public class First_Non_Repeat_Digit_Array {
    public static void main(String args[])
    {
       int arr[] = new int[] {34, 45, 18, 34, 22, 56,45, 22, 11, 34, 11}; // Example input

        for (int i = 0; i < arr.length; i++) {
           int count = 0;
           for (int j = 0; j < arr.length; j++) {

                if (i != j && arr[i] == arr[j]) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println("First non-repeating digit: " + arr[i]);
                break;
            }
        }
    }
}
