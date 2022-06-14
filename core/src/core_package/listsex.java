package core_package;
import java.util.ArrayList;
import java.util.List;

public class listsex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list= new ArrayList<String>();
		System.out.println("adding elements to list");
		list.add("A");
		list.add("B");
		list.add("D");
		list.add("E");
		list.add("A");
		System.out.println("the elements of array list are "+list);
		System.out.println("adding an element after B");
		list.add(2,"C");
		System.out.println(""+list);
		System.out.println("removing an element from list");
		list.remove("A");
		System.out.println(""+list);
		System.out.println("removing an element from position");
		list.remove(3);
		System.out.println(""+list);
		for(int i=0;i<4;i++) {
		System.out.println(""+list.get(i));  }
		list.set(1,"A");
		System.out.println(""+list);
		list.lastIndexOf(2);
	}

}
