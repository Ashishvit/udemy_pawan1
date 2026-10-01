package java_code11.basic_code;

public class PalindromeNumber {

    public static void main(String[] args) {
        int n= 141;
        int temp = n;
        int reverse = 0;
        // Reverse the number
        while (n!=0)
        {
            int r = n%10;
            reverse = reverse*10+r;
            n = n/10;
        }

        // Check palindrome
        if (temp == reverse) {
            System.out.println(temp+ " is a palindrome.");
        } else {
            System.out.println(temp + " is not a palindrome.");
        }
    }
}
