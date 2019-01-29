package packageinterface;

public class Student {
	private String name,cls,city;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCls() {
		return cls;
	}

	public void setCls(String cls) {
		this.cls = cls;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	public static void main(String[] args) {
		Student s = new Student();
		s.setName("Amit");
		s.setCls("12");
		s.setCity("nOIDA");
		
		System.out.println(s.getName());
	}
	
	

}
