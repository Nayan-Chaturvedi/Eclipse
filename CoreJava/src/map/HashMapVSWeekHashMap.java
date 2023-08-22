package map;

import java.util.HashMap;
import java.util.WeakHashMap;

class Employee
{
	private String name;
	private int empId;
	
	public Employee(String name, int empId)
	{
		this.name=name;
		this.empId=empId;
	}
	
	public String toString()
	{
		return  empId + " ";
	}
	@Override
	public void finalize()
	{
		System.out.println("Clean work by Garbage Collector "
				+ "before deallocate memory from heaps");
	}
}

public class HashMapVSWeekHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Employee e =new Employee("Nayan", 21);
			
			WeakHashMap hm =new WeakHashMap();
			hm.put(e, "HashMap");
			
			System.out.println(hm);
			e=null; 
			System.gc();
			
			System.out.println(e);
			
			System.out.println("Last Statement");
	}

}
