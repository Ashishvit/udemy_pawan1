package java_code11.String_code;

import java.util.Scanner;

public class count_vowel {

	public static void main(String[] args) {

	//int i;
	System.out.println("enter the element");
	Scanner  sc = new Scanner(System.in);
	
	String abc = sc.nextLine();
	String ab = abc.toLowerCase();
	char[] ch = ab.toCharArray();	
	
	for(int i = 0;i<ch.length;i++) {

		if(ch[i]=='a' || ch[i]=='e' || ch[i]=='o' || ch[i]=='i' || ch[i]=='u')
		{
         System.out.println("vowel "+ch[i]);
		
	    }
		
	}

}
}
