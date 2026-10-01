package java_code11.String_code;

public class DuplicateCharacter
{
    public static void main(String[] args)
    {
        String str = "Ashish";
        char[] arr = str.toCharArray();
        System.out.println("Duplicate characters:");
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i + 1; j < arr.length; j++)
            {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    break; // stop after first duplicate to avoid repeating
                }
            }
        }
    }
}
