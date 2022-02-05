package SeleniumJava;

public class Employee {
	
	private Integer empid;
	private String name;
	private Integer Salary; 
	
	public Employee(Integer empid, String name, Integer Salary)
	{  	
		this.empid=empid;
		this.name=name;
		this.Salary=Salary;

	}
	
	public Integer getempid()
	{
	return empid;
	}
	public String getname()
	{
		return name;
	}
	public Integer getsalary()
	{
		return Salary;
	}
	public String tostring()
	{
		return empid+name+Salary;
	}



}
