package core_package;

public class Sleepthread implements Runnable {

	public void run()
	{
		System.out.println("hiiii");
		try
		{
			Thread.sleep(3000);
			
		}
		catch(InterruptedException ie)
		{
			System.out.println(ie.getMessage());
		}System.out.println("hfcmf");
		System.out.println(Thread.currentThread());
	}
	public void m1()
	{
		System.out.println("this is m1 method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sleepthread a=new Sleepthread();
	Thread	t=new Thread(a,"child ");
	t.start();
	System.out.println("number of active "+Thread.activeCount());
		a.m1();
	}
}