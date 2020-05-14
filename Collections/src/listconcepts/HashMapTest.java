package listconcepts;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		HashMap<Integer , String> hm = new HashMap<Integer , String>();
		hm.put(1 ,  "Monday");
		hm.put(2, "Tuesday");
		hm.put(3 ,"wednesday");
		
		System.out.println(hm.get(1));
		System.out.println(hm.get(2));
		System.out.println(hm.get(3));
		System.out.println(hm.get(4)); //return null
		
		for(Entry m : hm.entrySet()) {
			System.out.println(m.getKey() +" "+ m.getValue());
			
		}
		System.out.println(hm);
		hm.remove(3);
		System.out.println(hm);
		
		
		HashMap <Integer, Employee> emp = new HashMap <Integer, Employee>();
		
		Employee e1= new Employee ("John" , 25 , "QA");
		Employee e2= new Employee ("Tom" , 25 , "QA");
		Employee e3= new Employee ("Peter" , 25 , "QA");
		
		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);
		
		for(Entry<Integer , Employee> m :emp.entrySet()) {
			int key = m.getKey();
			Employee e = m.getValue();
			System.out.println("Employee " +  key  + " Info :");
			System.out.println(e.name +"  "+ e.age +"  "+ e.dept);
		}
		
		
		
		
	}

}
