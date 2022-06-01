package core_package;

public class statinst {
	static int j=100;
	int n=200;
	
	static void a()
	{
		int a=200;
		System.out.println("print from a");

		
	}
	void a2() {
		System.out.println("inside a2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		statinst ob1=new statinst();
		ob1.a2();
		statinst.a();
	}

}
