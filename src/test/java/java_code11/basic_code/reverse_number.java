package java_code11.basic_code;

import java.util.Scanner;

public class reverse_number
{
public static void main(String args[]) {
	int reverse = 0;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a number");
		int n = sc.nextInt();	
		
	while(n!=0)
	{
		int r = n%10;
		reverse = reverse*10+r;
		 n = n/10;
	}
	System.out.println("reverse number is  "+reverse);
}
}

