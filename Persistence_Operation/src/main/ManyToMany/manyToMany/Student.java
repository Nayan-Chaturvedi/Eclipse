package manyToMany;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.*;

@Entity
public class Student 
{
	@Id
	private int studentid;
	private String studentName;
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Teacher> teach;;

	public List<Teacher> getTeach() 
	{
		return teach;
	}

	public void setTeach(List<Teacher> teach) 
	{
		this.teach = teach;
	}

	public int getStudentid() 
	{
		return studentid;
	}
	
	public void setStudentid(int studentid)
	{
		this.studentid = studentid;
	}
	
	public String getStudentName()
	{
		return studentName;
	}
	
	public void setStudentName(String studentName) 
	{
		this.studentName = studentName;
	}
	
	@Override
	public String toString() 
	{
		return "Student_Id : "+ studentid +" Student_Name : "+studentName;	
	}
	
	
}
