package core_package;

import java.lang.*;
public class impthreads implements Runnable {

	public void run()
	{
		System.out.println("new thread running");
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
		System.out.println(Thread.currentThread());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		impthreads hello=new impthreads();
		Thread t= new Thread (hello);
		t.setName("new thread");
		t.start();
	}

}