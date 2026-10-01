package java_code11.basic_code;

public class fabonacci_using_recursion
{
	int a = 0,b = 1, c;
	void fab(int x)
	{
	
	if(x>0)
	{
	System.out.print(a+" ");
	c = a+b;
	a=b;
	b=c;
	fab(x-1);
	}
	}
	public static void main(String[] args)
	{
		int n = 10;
		 fabonacci_using_recursion obj = new  fabonacci_using_recursion();
		obj.fab(n);
	}
}
