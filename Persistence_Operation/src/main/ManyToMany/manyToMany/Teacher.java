package manyToMany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Teacher
{
	@Id
	private int teacherId;
	private String teacherName;
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Student> std;
	

	public List<Student> getStd() 
	{
		return std;
	}

	public void setStd(List<Student> std) 
	{
		this.std = std;
	}

	public int getTeacherId() 
	{
		return teacherId;
	}
	
	public void setTeacherId(int teacherId)
	{
		this.teacherId = teacherId;
	}
	
	public String getTeacherName() 
	{
		return teacherName;
	}
	
	public void setTeacherName(String teacherName)
	{
		this.teacherName = teacherName;
	}
	
	@Override
	public String toString() 
	{
		return "Teacher_Id : "+ teacherId +" Teacher_Name : "+teacherName;	
	}
	
}
