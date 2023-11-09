package array;

//1:04:41 Arrays (College Wallah) Total duration is =1:15:41

class SearchElementInArray
{
	void searchElementInArray()
	{
		int n=33;
		int ans=-1;
		
		int a[]= {10,20,33,44,55,66,33};
		First:
		for (int i = 0; i < a.length; i++) 
		{
			if(n==a[i])
			{
				ans=i;
				break First;
			}
			
		}
		System.out.println("Found " + n + " at index " + ans);
		
	}
}

public class ProgramSearchThreGivenNumber {

	public static void main(String[] args) {
		SearchElementInArray s=new SearchElementInArray();
		s.searchElementInArray();

	}

}
