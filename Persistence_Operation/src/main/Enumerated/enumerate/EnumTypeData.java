package enumerate;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "enum_type_data")
public class EnumTypeData 
{
	@Id
	private int age;
	private String name;
	
	@Enumerated(EnumType.STRING)
	private Months months;
	
	public Months getMonths()
	{
		return months;
	}

	public void setMonths(Months months)
	{
		this.months = months;
	}

	public int getAge()
	{
		return age;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}

	@Override
	public String toString() 
	{
		return "EnumTypeData [age=" + age + ", name=" + name + ", months=" + months + "]";
	}

	
	
	
	
	
	
}
