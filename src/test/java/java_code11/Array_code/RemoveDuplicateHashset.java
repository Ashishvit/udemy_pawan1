package java_code11.Array_code;

import java.util.HashSet;

public class RemoveDuplicateHashset
{
    public static void main(String[] args)
    {
        int arr[] = {99, 10, 77, 88, 88, 99, 10, 77, 88};

        HashSet<Integer> set = new HashSet<>();

        System.out.println("Unique elements:");
        for (int num : arr) {
            if (!set.contains(num)) {
                System.out.println(num);
                set.add(num);
            }
        }
    }
}
