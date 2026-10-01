package java_code11.String_code;

public class SeparateCharDigit {

        public static void main(String[] args) {

            String input = "a1b2c3d4X9Y";  // Example string

            String letters = "";
            String digits = "";

            // Loop through each character
            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);
                // Check using ASCII values
                if (ch >= '0' && ch <= '9') {   // digits ASCII range 48–57
                    digits = digits + ch;
                }
                else if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) { // letters ASCII ranges
                    letters = letters +ch;
                }
            }
            //System.out.print("Letters: " + letters);
            //System.out.println("Digits: " + digits);
            System.out.print(letters+" "+digits);
        }
    }


