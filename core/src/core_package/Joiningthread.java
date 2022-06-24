package core_package;

public class Joiningthread implements Runnable{

	public void run()
	{
		System.out.println("child thread is running");
		for (int i=1;i<=6;i++)
		{
			System.out.println("i="+i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Joiningthread a=new Joiningthread();
		Thread t=new Thread(a,"child");
		t.start();
		try
		{
			t.join();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
			System.out.println("main Thread ends");
		}
		System.out.println("main Thread is ending");
	
		
		
	}

}