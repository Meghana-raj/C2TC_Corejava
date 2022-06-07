package core_package;

public class woexc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d=0, a;
		try {
			a=42/d;
			System.out.println("will not print");
		}catch(ArithmeticException e) {
			System.out.println("division by zero");
		}
		System.out.println("will be printed");
	}

}
