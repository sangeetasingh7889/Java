package learn.thiskeyword;

public class Employee {
	private String name, city;
	private int salary;
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getCity()
	{
		return city;
	}
	public void setCity(String city)
	{
		this.city =city;
	}
	public int getSalary()
	{
		return salary;
	}
	public void setSalary(int salary)
	{
		this.salary = salary; 
	}
	public void getInfo()
	{
		ThisasArgument ta = new ThisasArgument();
		ta.setEmpInfo(this);//This is referring the current class object.
	}
	

	public static void main(String[] args) {
		Employee ee = new Employee();
		ee.getInfo();

	}

}
