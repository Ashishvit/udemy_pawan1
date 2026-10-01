package java_code11.String_code;

public class string_palindrome
{

        public static void main(String[] args)
        {
            String str = "madam";   // you can change this value
            String reversed = "";

            // reverse the string
            for (int i = str.length() - 1; i >= 0; i--)
            {
                reversed = reversed + str.charAt(i);
            }

            // check palindrome
            if (str.equals(reversed))
            {
                System.out.println(str + " is a Palindrome");
            } else {
                System.out.println(str + " is NOT a Palindrome");
            }
        }
    }


