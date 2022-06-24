package core_package;

public class Extend_example  extends Thread {

		public void run()
		{
			System.out.println("thread"+Thread.currentThread()+"started");
			System.out.println("thread with priority  "+Thread.currentThread().getPriority()+" is running");
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			Extend_example t1=new Extend_example();
			Extend_example t2=new Extend_example();
			Extend_example t3=new Extend_example();
			
			t1.setPriority(MIN_PRIORITY);
			t2.setPriority(NORM_PRIORITY);
			t3.setPriority(MAX_PRIORITY);
			
			t1.start();
			t2.start();
			t3.start();
			
			System.out.println("priority of thread "+t1.getName()+"="+t1.getPriority());
			System.out.println("priority of thread "+t2.getName()+"="+t2.getPriority());
			System.out.println("priority of thread "+t3.getName()+"="+t3.getPriority());
		}

	}

