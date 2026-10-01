package java_code11.String_code;
import java.util.Scanner;

public class Reverse_String {

    public static void main(String[] args) {

        String rev = " ";
        System.out.println("Enter the string");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        for ( int i = str.length() - 1; i >= 0; i-- )
        {
            rev = rev + str.charAt(i);

        }
        System.out.print("Reverse string is :"+rev);
    }

}


