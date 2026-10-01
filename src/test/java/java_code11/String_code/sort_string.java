package java_code11.String_code;

public class sort_string {

    public static void main(String[] args) {

        String str1 = "programmiAGng";
        String str = str1.toLowerCase();
        char[] ch = str.toCharArray();

        for (int i = 0; i < ch.length - 1; i++) {
            for (int j = i + 1; j < ch.length; j++) {

                if (ch[i] > ch[j]) {
                    char temp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = temp;
                    }
                }
            }

            for (int i = 0; i < ch.length; i++) {
                System.out.print(ch[i]);
            }
        }
    }

