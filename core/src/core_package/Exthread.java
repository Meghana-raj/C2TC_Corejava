package core_package;

public class Exthread extends Thread{

	public void run()
	{
		System.out.println("hieeee");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread t=new Exthread();
		t.start();
	}

}