package learn.thiskeyword;

public class ThisasArgument {
	
	
	public void setEmpInfo(Employee emp)
	{
		emp.setName("Sangeeta");
		emp.setCity("Delhi");
		emp.setSalary(20000);
		System.out.println(emp.getName()+" "+emp.getCity()+" "+emp.getSalary());
	}

}
