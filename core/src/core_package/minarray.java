package core_package;


	
public class minarray {
	public static void main(String[] args) {
	int arr[] = {9,6,5,8};
	int min = arr[0];
	
	for (int i = 1; i < arr.length; i++)
	{

	if (min > arr[i])
	min = arr[i];
	}
	
	System.out.println("the lowest value is"+min);
	
	}

}
