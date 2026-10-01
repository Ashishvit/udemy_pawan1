package java_code11.pattern;

public class pattern1
{
        public static void main(String[] args)
        {
            String word = "retest";
            // lengths we want to print
            int[] cutLengths = {6, 5, 3, 2};
            // Loop through lengths
            for (int j = 0; j < cutLengths.length; j++) {
                int len = cutLengths[j];  // pick the length
                // Print each character up to len
                for (int i = 0; i < len; i++) {
                    System.out.print(word.charAt(i));
                }
                System.out.println(); // move to next line
            }
        }
    }

