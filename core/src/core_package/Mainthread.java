package core_package;

public class Mainthread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Thread obj = Thread.currentThread();
		 Thread t =Thread.currentThread();
		 System.out.println("current thread"+obj);
		 System.out.println("other thread"+t);
		 System.out.println("name of cur thread"+obj.getName());
		 System.out.println("name of cur thread"+t.getName());
		 t.setPriority(10);//highest
		 obj.setPriority(5);
		obj.setName("nothing");
		 t.setName("name");
		 
		 System.out.println("name of the current thread is"+obj);
		 System.out.println("name of the current thread is"+t);
	}

}
