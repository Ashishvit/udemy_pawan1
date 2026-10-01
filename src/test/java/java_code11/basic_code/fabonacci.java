package java_code11.basic_code;
import java.util.Scanner;
public class fabonacci {

public static void main(String args[]) {

	int n1=0, n2 = 1, n3;
	int count;
	System.out.println("how many term want to print");
	Scanner sc  = new Scanner(System.in);
	count = sc.nextInt();
	for(int i = 0;i<count;i++) {

		System.out.print(n1 + " ");
		n3 = n1+n2;
		n1 = n2;
		n2 = n3;
	}
 }
}
//for(int i = 0;i<count;i++)
//		{
//		if(i == 2){
//		System.out.print(n1 + " ");
//	}
//n3 = n1+n2;
//n1 = n2;
//n2 = n3;
// }


