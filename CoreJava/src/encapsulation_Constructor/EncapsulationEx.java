package encapsulation_Constructor;

class Books
{
	private int pageNum;
	
	void setPageNum(int x) //setter
	{
		if(x>0)
		{
			pageNum=x;	
		}
		else
		{
			System.out.println("Please give positive value");
		}
	}
	
	int getPageNum() //getter
	{
		return pageNum;
	}
}

public class EncapsulationEx {

	public static void main(String[] args) 
	{
		Books b=new Books();
		b.setPageNum(-100);
		System.out.println("getter (page num) = " + b.getPageNum());

	}

}
