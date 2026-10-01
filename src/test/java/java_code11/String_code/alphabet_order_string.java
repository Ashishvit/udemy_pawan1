package java_code11.String_code;
import java.util.Scanner;
public class alphabet_order_string {

	public static void main(String[] args)
	{
		//System.out.println("Enter a string:"); //String abc = "hello";
		//Scanner sc = new Scanner(System.in);
	//	String str = sc.nextLine();
		String str = "hello";
		String str1 = str.toLowerCase();
		char ch[] = str1.toCharArray();
		for(int i = 0; i < str.length(); i++)
		{
			for(int j = i+1; j < str.length(); j++)
			{
				if(ch[i]>ch[j]) {
					char temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
		}
		System.out.println(ch);  
	}

}
