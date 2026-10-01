package java_code11.String_code;
public class   CONVERT__A2B3C4__TO__AABBBCCCC {

    public static void main(String[] args) {
        //3600
        String input = "A2B3C4";//AABBBCCCC
        String result = "";
        for (int i = 0; i < input.length(); i = i + 2) {
            char letter = input.charAt(i);  // Get the letter
            int count = input.charAt(i + 1)-'0';
           // "charAt(i+1) gives the character, Java promotes char to int automatically in arithmetic operations.
            // and by subtracting '0', we convert it into a numeric integer value."
             //       " So finally it stores the digit as a number in the variable count."
           // c1 = '3' → internally stored as 51 (ASCII value).
          //  c2 = '0' → internally stored as 48.
          //  When you do c1 - c2, Java automatically promotes both chars to int before subtraction.
          //  51 - 48 = 3
         //  ✅ So yes, first the char is converted to its ASCII code (automatically by Java),
            //  then subtraction happens, and that gives the real digit number.

           // "Java promotes char to int automatically in arithmetic operations. " +
            //        "So '5' becomes 53, '0' becomes 48, and when we subtract, we get 5." +
             //       " This is the standard way to convert a digit character into its integer value."
            // Append the letter `count` times
            for (int j = 0; j < count; j++) {
                result =   result + letter; // Append manually
            }
        }
        System.out.println("Converted String: " + result);
    }
}



