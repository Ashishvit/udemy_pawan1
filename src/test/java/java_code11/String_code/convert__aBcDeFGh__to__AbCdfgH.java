package java_code11.String_code;

public class convert__aBcDeFGh__to__AbCdfgH
{
        public static void main(String[] args)
        {
            String input = "aBcDeFGh";
            String result = "";

            for (int i = 0; i < input.length(); i++)
            {
                char ch = input.charAt(i);
                // if lowercase
                if (ch >= 'a' && ch <= 'z') {
                    ch = (char)(ch - 32);   // convert to uppercase
//ch = (char)(ch-32) ch = (char)(ch-32) ch = (char)(ch-32);
                   // (char)(ch - 32)
                    //(ch - 32) is an int (since arithmetic on char promotes to int).
                    //(char) casts it back to a character.
                }
                // if uppercase
                else if (ch >= 'A' && ch <= 'Z')  { //   ch = (char)(ch+32)

                    ch = (char)(ch + 32);   // convert to lowercase
                }
                result = result + ch; // append converted char
            }
            System.out.println("Output: " + result);
        }
    }



