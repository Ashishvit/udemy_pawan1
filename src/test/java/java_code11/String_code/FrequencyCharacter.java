package java_code11.String_code;

public class FrequencyCharacter {

    public static void main(String args[]) {
        String str1 = "aabbbcccccc";
        char str2[] = str1.toCharArray();
        int freq[] = new int[str2.length];
        // store frequencies
        for (int i = 0; i < str2.length; i++) {

            freq[i] = 1; // start with count = 1
            for (int j = i + 1; j < str2.length; j++) {
                if (str2[i] == str2[j]) {
                    freq[i]++;
                    // mark as visited with '\0' (null character)
                    str2[j] = '\0';
                }
            }
        }

        // Display characters and frequencies
        System.out.println("Characters and their corresponding frequencies:");
        for (int i = 0; i < str2.length; i++) {

            if (str2[i] != '\0' && str2[i] != ' ') {

                System.out.print(str2[i]+""+freq[i]) ;
            }
        }
    }
}
