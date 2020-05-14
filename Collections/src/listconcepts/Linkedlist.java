package listconcepts;

import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> ll = new LinkedList<String>();
		
		ll.add("Test");
		ll.add("qtp");
		ll.add("Year");
		
		System.out.println("Contents of LinkedList ->"  +ll);
		
		ll.addFirst("Monday");
		ll.addLast("Friday");
		
		System.out.println("Contents of LinkedList ->"  +ll);
		
		System.out.println(ll.get(0));
		ll.set(0,  "Sunday");
		System.out.println(ll.get(0));
		
		ll.remove(2);
		System.out.println("Contents of LinkedList ->"  +ll);
		
		System.out.println("Prin using for loop");
		for(int n =0; n<ll.size();n++) {
			System.out.println(ll.get(n));
		}
		

	}

}
