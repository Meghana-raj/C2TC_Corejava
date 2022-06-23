package core_package;
import java.util.ArrayDeque;
public class dequeue_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<String> dq = new ArrayDeque<String>();
		dq.add("eygrfvhb");
		dq.add("eruytfb");
		dq.add("trfgbauugf");
		dq.add("jgfliub");
		dq.add("kjfhiuafb");
		dq.add("kuhfab");
		System.out.println(dq);
		
		dq.addFirst("First");
		dq.addLast("Last");
		System.out.println(dq.size());
		dq.offer("Offer1");
		System.out.println(dq);
		dq.offerFirst("Offer First");
		dq.offerLast("OfferLast");
		dq.offer("Final");
		System.out.println(dq);
		System.out.println(dq.size());
		
		System.out.println("Poll "+dq.poll());
		String str = dq.toString();
		System.out.println(str);
		
		char [] ch = str.toCharArray();
		System.out.println(ch);
		System.out.println(ch[1]);
	}
	}


