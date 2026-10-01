package java_code11.String_code;

public class find_last_repeat_char {

        public static void main(String[] args) {

            String str = "programminqqe";
            char[] ch = str.toCharArray();
            for (int i = ch.length - 1; i >= 0; i--) {

                for (int j = i - 1; j >= 0; j--) {

                    if (ch[i] == ch[j]) {
                        System.out.println("Last repeated character = " + ch[i]);
                        return;   // program ends immediately
                    }
                }
            }

            System.out.println("No repeated character found");
        }
}


