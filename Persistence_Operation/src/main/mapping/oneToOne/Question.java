package oneToOne;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Question
{
	@Id
	@Column(name = "Ques_ID")
	private int QuesionNum;
	@Column(name = "Ques")
	private String ques;
	@OneToOne
	@JoinColumn(name = "Ans_Id")
	private Answer answer;
	
	public Answer getAnswer()
	{
		return answer;
	}

	public void setAnswer(Answer answer) 
	{
		this.answer = answer;
	}

	public int getQuesionNum()
	{
		return QuesionNum;
	}
	
	public void setQuesionNum(int quesionNum)
	{
		QuesionNum = quesionNum;
	}
	
	public String getQues() 
	{
		return ques;
	}
	
	public void setQues(String ques)
	{
		this.ques = ques;
	}

	@Override
	public String toString() {
		return "Question [QuesionNum=" + QuesionNum + ", ques=" + ques + ", answer=" + answer + "]";
	}
	
	
	
	
	
}