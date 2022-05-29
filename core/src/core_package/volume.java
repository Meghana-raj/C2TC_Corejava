package core_package;

public class volume {
	void vol(int n)
	{
		int v = n*n*n;
		System.out.println("the volume of the cube is "+v);
		
	}
	void vol(double m)
	{
		double v=(4/3.0)*3.15*m*m*m;
		System.out.println("the volume of the sphere is "+v);
		
	}
	void vol(int l,int b,int w)
	{
		int v=l*b*w;
		System.out.println("the volume of the cuboid is "+v);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		volume ob= new volume();
		ob.vol(10);
		ob.vol(5,6,7);
		ob.vol(9.0);

	}

}
