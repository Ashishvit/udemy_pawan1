package java_code11.Array_code;

public class CompareDigit {

        public static void main(String[] args) {
            String input = "658488";
            StringBuilder result = new StringBuilder();

            for (int i = 0; i < input.length() - 1; i++) {

                char a = input.charAt(i);
                char b = input.charAt(i + 1);
                if (a > b) {
                    result.append(">");
                } else if (a < b) {
                    result.append("<");
                } else {
                    result.append("=");
                }
            }
            System.out.println(result);
        }
    }

