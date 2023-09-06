package generic;

import java.util.*;

interface itr
{
	void fly();
}

class Aeroplane implements itr
{
	public void fly()
	{
		System.out.println("Aeroplaane fly in air");
	}
	
	public void air()
	{
		System.out.println("Aeroplane fly in the Sky");
	}
}


public class MoreOnGenerics {

	public static void main(String[] args) 
	{
		ArrayList<String> al=new ArrayList<String>();
		
		List<String> l=new ArrayList<String>();
		
		Collection<String> c=new ArrayList<String>();
		
		Iterable<String> it=new ArrayList<String>();
		
		// Generics ke type ko parent nahi bna sakte hai
		
//		ArrayList<Object> obj=new ArrayList<String>(); // C.E.

//		ArrayList<Integer> in=new ArrayList<int>();
		
		// Parameter type should be always be class / Interface / Enum type, -
		// - but not for parameter type

//		ArrayList<float> al=new ArrayList<float>(); // C.E.

		ArrayList<itr> it1=new ArrayList<itr>();
		
		ArrayList<Aeroplane> it2=new ArrayList<Aeroplane>();
	}

}
