package core_package;
import java.util.Scanner;


public class Library {
	int acc_num;
	String title; 
	String author;
	
	void input()
	{
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Enter the title");
	title=sc.nextLine();
	
	System.out.println("Enter the Author Name");
	author=sc.nextLine();
	System.out.println("Enter Access Number\n");
	acc_num=sc.nextInt();
	
	}
	
	
	void compute()

	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of days late:");
		int days = sc.nextInt();
		int fine=days*5;
		System.out.println("Fine =Rs."+fine);
		
	}
	
	
	void display()
	{
		System.out.println("Access Number\tTitle\tAuthor");
		System.out.println(acc_num+"\t\t"+title+"\t\t"+author);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library obj=new Library();
		
		obj.input();
		
			
		obj.compute();
		
		obj.display();
		
		
	}

}
