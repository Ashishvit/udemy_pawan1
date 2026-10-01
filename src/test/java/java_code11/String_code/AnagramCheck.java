package java_code11.String_code;
import java.util.Arrays;

    public class AnagramCheck {
        public static void main(String[] args) {
            String s1 = "Listen";
            String s2 = "Silent";

            // normalize: remove spaces and make lowercase
            String a = s1.replaceAll("\\s+", "").toLowerCase();
            String b = s2.replaceAll("\\s+", "").toLowerCase();
         //   replaceAll("\\s+", "") = remove all spaces, tabs, and newlines from the string.
          //  replaceAll("\\s+", "") is a Java method to remove whitespace using regex.
//\\s means any whitespace (space, tab, newline, etc.).
           // + means one or more occurrences together.
                //    "" means replace them with nothing (remove).
                  //  Final effect → removes all spaces, tabs, and newlines from the string.
            // quick length check without return

            if (a.length() != b.length()) {
                System.out.println(s1 + " and " + s2 + " are NOT anagrams.");
            } else {
                // sort chars
                char[] ca = a.toCharArray();
                char[] cb = b.toCharArray();
                Arrays.sort(ca);
                Arrays.sort(cb);

                // check equality
                if (Arrays.equals(ca, cb)) {
                    System.out.println(s1 + " and " + s2 + " are anagrams.");
                } else {
                    System.out.println(s1 + " and " + s2 + " are NOT anagrams.");
                }
            }
        }
    }



