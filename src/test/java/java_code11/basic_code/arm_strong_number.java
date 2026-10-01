package java_code11.basic_code;

import java.util.Scanner;

public class arm_strong_number 
{

	public static void main(String[] args) 
	{
	int n =153, temp, sum = 0;

	temp = n;
	while(n!=0)
	{
		int r = n%10;
		sum = sum + r*r*r;
		n = n/10;
	}
	if(sum==temp) 
	{
		System.out.println("number is palendrome   "+ sum);
	}
	else
		System.out.println("number is not palendrom");

	}

}
