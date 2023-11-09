package in.google.Mechanical.HibernateDem;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Teacher 
{
	@Id
	private int teacherId;
	private String name;
	
	
	
	public int getTeacherId() {
		return teacherId;
	}



	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	@Override
	public String toString()
	{
		return "Teacher [teacherId=" + teacherId + ", name=" + name + "]";
	}
}
