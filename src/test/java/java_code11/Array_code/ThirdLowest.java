package java_code11.Array_code;

public class ThirdLowest
{
    public static void main(String[] args)
    {
        int[] arr = {10, 20, 4, 45, 99, 53};

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        int third = Integer.MAX_VALUE;

        for (int num : arr)
        {
            if (num < first)
            {
                third = second;
                second = first;
                first = num;
            } else if (num < second && num != first)
            {
                third = second;
                second = num;
            } else if (num < third && num != second && num != first)
            {
                third = num;
            }
        }
        if (third == Integer.MAX_VALUE) {
            System.out.println("Array does not have 3 distinct elements");
        } else {
            System.out.println("3rd lowest value = " + third);
        }
    }
}