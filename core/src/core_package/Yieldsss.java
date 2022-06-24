package core_package;

public class Yieldsss implements Runnable{
	public void run()
	{
		System.out.println(Thread.currentThread());
		Thread.yield();
		System.out.println(Thread.currentThread());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Yieldsss a=new Yieldsss();
		Thread t=new Thread(a,"chlid1");
		Yieldsss b=new Yieldsss();
		Thread t1=new Thread(b,"chlid2");
		t.start();
		t1.start();
		
	}

}

