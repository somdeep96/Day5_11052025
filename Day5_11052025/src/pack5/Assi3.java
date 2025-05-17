package pack5;
/* Concept of local and global variables.
 * Global- Declared inside the class and outside the method. 
 * Local- Declared within the class.
 * this keyword is used to differentiate between global and local variable where variable names are same.
 */

public class Assi3 
{
	int a; //Global variable.
	
	public void m1(int a) //Local variable.
	{
		this.a = a;
	}
	
	public static void main(String[] args)
	{
		Assi3 ob = new Assi3();
		
		ob.m1(88);
		System.out.println(ob.a);
	}
	

}
