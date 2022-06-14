package core_package;

public class multiexce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("One");
		System.out.println("Two");
		
		try 
		{
			System.out.println("Before divide");
			int a=1/0; 
			System.out.println("After divide");
		}
		catch(ArithmeticException e)
		{
			System.out.println("A number cannot be divided by zero");
			System.out.println("Three");
			System.out.println("Four");
		}

	}


	}


