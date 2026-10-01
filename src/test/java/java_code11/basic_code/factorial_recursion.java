package java_code11.basic_code;


public class factorial_recursion
{

        // Recursive method
        static int factorial(int n)
        {
            if (n <= 1)
            {   // base case
                return 1;
            }
            return n * factorial(n - 1);  // recursive step
        }

        public static void main(String[] args)
        {
            int num = 5;  // change this number as needed
            int result = factorial(num);
            System.out.println( result);
        }
    }


