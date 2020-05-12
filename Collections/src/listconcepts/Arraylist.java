package listconcepts;

import java.util.ArrayList;
import java.util.Iterator;



public class Arraylist {

	public static <E> void main(String[] args) {
		// TODO Auto-generated method stub
		//static array - fixed length
		int a[] = new int[3];
		//dynamic arrays - Arraylist
		ArrayList ar = new ArrayList();
		ar.add(10);
		ar.add(20);
		ar.add(30);
		System.out.println(ar.size());
		ar.add(40);
		ar.add(50);//int
		ar.add(50);//duplicate
		ar.add(12.33); // double value
		ar.add("Test"); //string
		ar.add('e');// char
		ar.add(true);//boolean
		System.out.println(ar.size());
		System.out.println(ar.get(4));
		for(int i=0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		ArrayList<Integer>ar1 = new ArrayList<Integer>(); //generics (int)
		ar1.add(100);
	//	ar1.add("String"); // string throws error 
		
		ArrayList<String>ar2 = new ArrayList<String>(); //generics (String)
	//	ar2.add(100); // Integer  throws error
	    ar2.add("String"); 
		
	    ArrayList<E> ar3 = new ArrayList<E>(); 
		//Employee class object
	    Employee e1 = new Employee("Vishal" , 30, "QA");
	    Employee e2 = new Employee("John" , 30, "Dev");
	    Employee e3 = new Employee("Tom" , 30, "Admin");
	    
	    // arraylist 
	    ArrayList<Employee> ar4 = new ArrayList<Employee>();
	    ar4.add(e1);
	    ar4.add(e2);
	    ar4.add(e3);
		
	
	// iterator 
	Iterator<Employee> it = ar4.iterator();
	while (it.hasNext()) {
		Employee emp = it.next();
		System.out.println(emp.name);
		System.out.println(emp.age);
		System.out.println(emp.dept);
	}
	

	}
}


