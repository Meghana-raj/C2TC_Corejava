package core_package;
import java.util.*;
public class linkedlists {

	public static void main(String[] args) {
		LinkedList<Integer> LL=new LinkedList<Integer>();
		for(int i=1;i<=5;i++) {
			LL.add(i);
		}
		System.out.println(""+LL);
		LL.remove(3);
		System.out.println(""+LL);
		for(int i=0;i<=LL.size();i++) {
			System.out.println(""+LL.get(i));
		}
		
	}

}
