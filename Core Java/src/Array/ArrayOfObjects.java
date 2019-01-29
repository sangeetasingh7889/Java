package Array;

public class ArrayOfObjects {
	private String title, author;
	
	public ArrayOfObjects(String title, String author)
	{
		super();
		this.title = title;
		this.author = author;
	}

	public static void main(String[] args) {
		ArrayOfObjects ao = new ArrayOfObjects("Java", "James");
		ArrayOfObjects ao1 = new ArrayOfObjects("Python", "Vikash");
		ArrayOfObjects ao2 = new ArrayOfObjects("PHP", "Tarun");
		ArrayOfObjects ao3 = new ArrayOfObjects("Spring", "Akash");
		ArrayOfObjects ao4 = new ArrayOfObjects("Hibernate", "Shiv");
		
		ArrayOfObjects obj[] = {ao,ao1,ao2,ao3,ao4};
		
		/*ArrayOfObjects obj[] = new ArrayOfObjects[5];
		obj[0] = ao;
		obj[1] = ao1;
		obj[2] = ao2;
		obj[3] = ao3;
		obj[4] = ao4;*/
		
		for(int i=0; i<obj.length; i++)
		{
			ArrayOfObjects as = obj[i];
			System.out.println(as.title+" "+as.author);
		}
	}

}
