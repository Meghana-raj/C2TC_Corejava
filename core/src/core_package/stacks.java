package core_package;
import java.util.*;
public class stacks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> st= new Stack<String>();
		st.push("i ");
		st.push("am");
		st.push("a ");
		st.push("student");
		st.push("at ");
		st.push("Sea");
		Iterator<String> str = st.iterator();
		while(str.hasNext()) {
			System.out.println(str.next()+"");
			
		}
		System.out.println();
		
		st.pop();
		str=st.iterator();
		while(str.hasNext()) {
			System.out.println(str.next()+"");
			
		}
		System.out.println();
		System.out.println(st.peek());
		
		System.out.println(st.empty());
		
		System.out.println(st.search("am"));
	}

}
