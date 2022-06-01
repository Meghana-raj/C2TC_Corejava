package core_package;
 final class A{
	void run() {
	
}

public class fin extends A{
	final int speedlimit=100;
	void run() {
		speedlimit=90;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fin obj=new fin();
		obj.run();

	}

}

