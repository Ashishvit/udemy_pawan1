package java_code11.Array_code;
public class second_largest_number_in_array
{
	public static void main(String[] args) {
        int[] arr = new int[]{12, 35, 60, 34,49};
        // Initialize the largest and second largest
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int num : arr)
        {
            if (num > first)
            {
              second = first;
              first = num;

            } 
            else if (num > second && num != first)
            {
                second = num;
            }
        }
        if (second == Integer.MIN_VALUE)
        {
            System.out.println("There is no second largest element.");
        } else {
            System.out.println("The second largest element is: " + second);
        }
    }
}

//