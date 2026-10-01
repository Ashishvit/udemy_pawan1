
package java_code11.Array_code;

public class RearrangeDigits
{
    public static void main(String[] args)
    {
        int num = 10704050;
        String str = String.valueOf(num);

        String nonZero = "";
        String zeros = "";

        // Loop through each character
        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if (ch != '0')
            {
                nonZero = nonZero + ch; // keep non-zero digits
            }
            else
            {
                zeros = zeros + ch;   // collect zeros separately
            }
        }

        String result = nonZero + zeros;
        System.out.println(result);  // Output: 17450000
    }
}
