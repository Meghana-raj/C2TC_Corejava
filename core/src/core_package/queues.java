package core_package;
import java.util.*;
public class queues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> qu= new PriorityQueue<String>();
		qu.add("altrfab");
		qu.add("ajkhf");
		System.out.println(qu.poll());
		System.out.println(qu);
		qu.clear();
		System.out.println(qu);
	//	System.out.println(q.remove());  //it returns Exception that there is no element in Queue
		System.out.println(qu.poll());    // it returns Null when the queue is empty
		
		qu.add("ayktkbka");
		qu.add("agfycby");
		qu.add("uyffkua");
		qu.add("mjhdtrfrb");
		System.out.println(qu);
		System.out.println(qu.element()); //it Returns the head of this queue
		System.out.println(qu.peek());   //it Returns the head of this queue
		System.out.println(qu.remove(qu.element()));
		System.out.println(qu);
	}

}
