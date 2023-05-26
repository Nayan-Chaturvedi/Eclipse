package array;

public class ObjectTypeArray {

	public static void main(String[] args) 
	{
		Object obj[]=new  Object[3];
		
		obj[0]=10;
		obj[1]='a';
		obj[2]="Nayan";
		
		for(Object o:obj)
		{
			System.out.println(o);
		}
		
	}

}
