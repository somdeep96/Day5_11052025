package pack5;
/**Output should be in the below sequence using this keyword
	three parameterized constructor
	default constructor
	one parameterized constructor
	four parameterized constructor
	two parameterized constructor*/


public class Assi1 
{
	public Assi1() //This is a default constructor.
	{
		this(46,95,37); //Calling the 3 parameterized const.
		System.out.println("This is a default constructor!");
	
	}
	
	public Assi1(int a) //This is one parameterized constructor.
	{
		this(); //Calling the default const.
		System.out.println("This is one paramterized constructor!");
		
	}
	
	public Assi1(int a, int b) //This is two parameterized constructor.
	{
	
		this(38,96,23,66); //Calling the 4 parameterized const.
		System.out.println("This is two parameterized constructor.");
		
	}
	
	public Assi1(int a, int b, int c) //This is three parameterized constructor.
	{
		
		System.out.println("This is three parameterized constructor.");
		
	}
	
	public Assi1(int a, int b, int c, int d) //This is four parameterized constructor.
	{
		this(1); //Calling the 1 parameterized const.
		System.out.println("This is four parameterized constructor.");
	}
	
	public static void main(String[] agrs)
	{
		Assi1 ob1 = new Assi1(11,44); //Calling the 2 parameterized const.
	}
}
