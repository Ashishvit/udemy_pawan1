package java_code11.Array_code;
import java.util.*;
//Java Program to Remove Duplicate Elements
//From the Array using Set

// Function to remove duplicate from array
public class duplicate_arrays_hashset 
{

 public static void main(String[] args)
	 {

	Scanner sc = new Scanner(System.in);
	System.out.println("enter size of array");
	int n = sc.nextInt();
	int arr[] = new int[n];
	System.out.println("enter the element in array");
	for(int i = 0;i<n;i++)
	{
		arr[i] = sc.nextInt();
	}
     LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();

     // adding elements to LinkedHashSet
     for (int i = 0; i < arr.length; i++)
         set.add(arr[i]);

     // Print the elements of LinkedHashSet
     System.out.print(set);
 }
}



