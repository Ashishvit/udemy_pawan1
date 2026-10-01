package java_code11.String_code;


    public class ReverseEvenWordsSimple {

        public static void main(String[] args) {

            String input = "hello my name is ashish";
            String[] words = input.split(" ");

            for (int i = 0; i < words.length; i++) {

                if ((i + 1) % 2 == 0) { // check even word
                    String rev = "";
                    for (int j = words[i].length() - 1; j >= 0; j--) {
                        rev = rev + words[i].charAt(j); // reverse manually
                    }
                    words[i] = rev;
                }
            }
            // print final sentence
            for (String w : words) {
                System.out.print(w + " ");
            }
        }
    }
    //String str = "Hello";
//String[] words[] = input.split(" ");


