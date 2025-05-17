package pack5;
/*
 * Output should be in the below sequence using this keyword
	two parameterized method
	default method
	four parameterized method
	one parameterized method
	three parameterized method*/

public class Assi2 
{
	public void m0() 
	{
		this.m2(43,89);
		System.out.println("Default method");
		
	}
	
	public void m1(int a) 
	{
		this.m4(847, 893, 27, 39);
		System.out.println("1 parameterized method");
		
	}
	
	public void m2(int a, int b) 
	{
		System.out.println("2 parameterized method");
		
	}
	
	public void m3(int a, int b, int c) 
	{
		this.m1(1);
		System.out.println("3 parameterized method");
		
	}
	
	public void m4(int a, int b, int c, int d) 
	{
		this.m0();
		System.out.println("4 parameterized method");
		
	}
	
	public static void main(String[] args)
	{
		Assi2 ob = new Assi2();
		ob.m3(23, 44, 32);
	}

}
