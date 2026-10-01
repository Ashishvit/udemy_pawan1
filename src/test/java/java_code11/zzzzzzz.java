package java_code11;

public class zzzzzzz
{
public static void main(String args[]){

            String str = "abbcdfgghhii";
            char[] arr = str.toCharArray();
            int count;
            for (int i = arr.length - 1; i >= 0; i--) {
                count = 0;
                for (int j = arr.length - 1; j >= 0; j--) {
                    if (i != j && arr[i] == arr[j]) {
                        count++;
                        break;
                    }
                }

                if (count == 0) {
                    System.out.println("Last non-repeating character: " + arr[i]);
                    break;
                }
            }
        }
    }





