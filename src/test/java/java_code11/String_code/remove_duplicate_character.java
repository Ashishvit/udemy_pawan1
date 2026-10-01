package java_code11.String_code;

// remove duplicate character
public class remove_duplicate_character
{

        public static void main(String args[])
        {
            String str = "programming"; // example input
            char arr[] = str.toCharArray();
            System.out.println("Unique characters:");

            for (int i = 0; i < arr.length; i++) {
                // check duplicates of arr[i]
                for (int j = i + 1; j < arr.length; j++) {

                    if (arr[i] == arr[j]) {
                        arr[j] = '\0'; // mark duplicate with null char
                    }
                }
            }

            for (int i = 0; i < arr.length; i++) {

                if (arr[i] != '\0') { // print only non-null chars
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }


