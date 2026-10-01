package java_code11.String_code;

public class SwapStrings
{
    public static void main(String[] args)
    {
        String a = "java";
        String b = "World";

        System.out.println("Before Swap:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Swap without temp
        a = a + b;  // HelloWorld
        b = a.substring(0, a.length() - b.length());
        // a.substring(0, 5) - takes characters from index 0 to 4 (5 characters total).
        a = a.substring(b.length()); //b.length() - start index for

        System.out.println("\nAfter Swap:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

// Swap with temp
//String temp = a;
//a = b;
//b = temp;

 //a.substring(5):
//Current a = "HelloWorld"
//Substring with one argument (5) means:
//take everything from index 5 till the end
//start from index 5 to end.

// Extract from start index to end of string
//String substring(int beginIndex);

// Extract from start index to just before end index
//String substring(int beginIndex, int endIndex); it end index take value till (endindex-1)
