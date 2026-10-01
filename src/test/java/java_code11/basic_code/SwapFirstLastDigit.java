package java_code11.basic_code;

    public class SwapFirstLastDigit {

        public static void main(String[] args) {

            int n = 12345;
            int original = n;

            // Get last digit
            int last = n % 10;

            // Find first digit and its place value
            int divisor = 1;

            while (n >= 10) {
                n = n / 10;
                divisor = divisor * 10;
            }

            int first = n;

            // Swap first and last digit
            int result = last * divisor
                    + (original % divisor / 10) * 10
                    + first;

            System.out.println(result);
        }
    }

