package java_code11.String_code;
public class ReversePreserveSpace {

    public static void main(String[] args) {

        String str = "Hello how are you";  //Input:  "I Am Ashish"  Output: "h si hsAmAI"
        char[] input = str.toCharArray();
        char[] result = new char[input.length];
        // Step 1: Copy spaces into result
        for (int i = 0; i < input.length; i++) {
            if (input[i] == ' ') {
                result[i] = ' ';
            }
        }
        // Step 2: Fill characters in reverse order
        int j = input.length - 1;
        for (int i = 0; i < input.length; i++) {
            if (input[i] != ' ') {              // only process non-space characters
                while (j >= 0 && result[j] == ' ') {
                    j--;                        // skip spaces in result array
                }
                result[j] = input[i];           // put character into correct reverse slot
                j--;                            // move backward
            }
        }
        System.out.println("Original : " + str);
        for (char ch : result) {
            System.out.print(ch);
        }
    }
}

//i=6 → input[6] = 'o'

//Not space → process.

//while (result[4] == ' ') → true (index 4 is a space).
// Skip it → j=3.

//Now result[3] empty → place 'o' at result[3].

//Decrement j → j=2.

    //    👉 result = ['_',' ','_','o',' ','g','m','a','I']