package java_code11.basic_code;

import java.util.Scanner;

public class prime_number {

public static void main(String args[]) {

	int a, count=0;
	System.out.print("enter a numberr");
	Scanner sc = new Scanner(System.in);
	a = sc.nextInt();
	for(int i = 2;i<a;i++) {

		if(a%i == 0) {
			count++;
			break;
		}
	}
	if(count==0) {
		System.out.print("no is prime");
	}
	else {
		System.out.print("number is not prime");

	}
}
}
