package core_package;
import java.util.*;
public class hashsetex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			HashSet<String> hs=new HashSet<String>();
			hs.add("JAVA");
			hs.add("hsfazg");
			hs.add("yuaabsjdg");
			hs.add("iruh");
			hs.add("sudyf");
			hs.add("JAVA");
			hs.add(null);
			hs.add(null);
			hs.add(null);
			System.out.println(hs);
			Iterator<String> itr = hs.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
	}

}
