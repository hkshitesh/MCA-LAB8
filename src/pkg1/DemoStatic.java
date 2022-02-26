package pkg1;

public class DemoStatic {
	
	int a=10;
	static int b=20;
	
	public void f1()
	{
		System.out.println("I am Non-Static Method");
	}
	
	public static void f2()
	{
		System.out.println("I am in f2 static method");
	}
	
	public static void f3()
	{
		System.out.println("I am in f3 static method");
		f1();
		f2();
	}
	public static void main(String[] args) 
	{
		

	}

}
