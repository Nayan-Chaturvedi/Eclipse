package in.google.Mechanical.Electri;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student
{
	@Id
	private int id;
	private String name;
	
	
	public int getId() {
		return id;
	}


	public void setId(int id)
	{
		this.id = id;
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
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	
}
