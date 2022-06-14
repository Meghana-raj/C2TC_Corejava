package core_package;
import java.io.IOException;
public class throwstest {
	
	
	static void display() throws IOException
{
	System.out.println("Hello Java");
	throw new IOException();
}
	public static void main(String[] args)
	{
	throwstest obj = new throwstest();
	try {
	obj.display();
	
	}
	catch (IOException e) {
	System.out.println ("Caught an exception: In" +e);
}
}
	}