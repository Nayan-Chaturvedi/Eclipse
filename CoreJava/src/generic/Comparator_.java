package generic;

import java.util.*;


class Studen
{
	private int rollNum;
	private String name;
	
	public Studen(int rollNum, String name) 
	{
		this.rollNum = rollNum;
		this.name = name;
	}

	public int getRollNum() 
	{
		return rollNum;
	}

	public String getName()
	{
		return name;
	}
	
	public String toString()
	{
		return rollNum + " " + name;
	}
	
	
	
}

//  		FIRST APPROCH

//class Alpha implements Comparator<Studen>
//{
//	public int compare(Studen s1, Studen s2)
//	{
//		if(s1.getRollNum()>s2.getRollNum())
//		{
//			return 1;
//		}
//		else
//		{
//			return -1;
//		}
//	}
//}
class Comparator_
{
	public static void main(String[] args) 
	{
		Studen st1=new Studen(21, "Amit");
		Studen st2=new Studen(35, "Vijay");
		
		List<Studen> al=new ArrayList();
		al.add(st1);
		al.add(st2);

		// 2nd APPROCH By using ANNONYMOUS FUCNCTION
		
//		Comparator<Studen> a= new Comparator<Studen>()
//				{
//			public int compare(Studen s1, Studen s2)
//			{
//				if(s1.getRollNum() > s2.getRollNum())
//				{
//					return 1;
//				}
//				else
//				{
//					return -1;
//				}
//			}
//				};
//		
		
		// 		3rd APPROCH by using LAMBDA EXPRESSION
		
		Comparator<Studen> a=(Studen s1, Studen s2)->
		{
			if(s1.getRollNum() > s2.getRollNum())
			{
				return 1;
				
			}
			else
			{
				return -1;
			}
		};
		Collections.sort(al, a);
		
		System.out.println(al);

	}
}