package core_package;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class throwsss {

	private String firstName, lastName;
	
	void accept() throws IOException
	{
	
	InputStreamReader sr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(sr);
	System.out.println ("Enter your first name");
	firstName = br.readLine();
	System.out.println ("Enter your last name");
	lastName = br.readLine();
	}
	void display() {
	System.out.println("Full Name: " +firstName+ "" +lastName);}
	public static void main(String[] args) throws IOException
	{
	throwsss obj = new throwsss();
	obj.accept();
	obj.display();
	}
	}