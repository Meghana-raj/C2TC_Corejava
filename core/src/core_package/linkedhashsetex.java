package core_package;
import java.util.*;
public class linkedhashsetex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			LinkedHashSet<String> hs=new LinkedHashSet<String>();
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
