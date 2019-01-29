package polymorphism;

public class Methodoverloading {
	
	public void getInfo(int id)
	{
		System.out.println("Id: " + id);
	}
	public void getInfo(String name)
	{
		System.out.println("Name: " + name);
	}
	public void getInfo(int id, String name)
	{
		System.out.println("Id: " + id + "Name: " + name);
	}
	public void getInfo(int id, String name, String dept)
	{
		System.out.println("Id: " + id + "Name: " + name + "Department: " + dept);
	}
	public void getInfo(int id, String name, String dept, int salary)
	{
		System.out.println("Id: " + id + "Name: " + name + "Department: " + dept + "Salary: " + salary);
	}
	public static void main(String[] args) {
		Methodoverloading mo = new Methodoverloading();
		mo.getInfo("Sangeeta");
		mo.getInfo(19, "Sangeeta", "Computer", 20000);

	}

}
