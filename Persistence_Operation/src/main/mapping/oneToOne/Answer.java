package oneToOne;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Answer 
{
	@Id
	@Column(name = "Ans_ID")
	private int answerId;
	@Column(name = "Ans")
	private String ans;
	

	public int getAnswerId()
	{
		return answerId;
	}
	
	public void setAnswerId(int answerId)
	{
		this.answerId = answerId;
	}
	
	public String getAns() 
	{
		return ans;
	}
	
	public void setAns(String ans)
	{
		this.ans = ans;
	}

	@Override
	public String toString() 
	{
		return "Answer [answerId=" + answerId + ", ans=" + ans + "]";
	}
	
	
	
	
}
