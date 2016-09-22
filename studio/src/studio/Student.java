package studio;

public class Student {

	private String _name;
	private String _lastname;
	
	public Student(String name, String lastname) {
		_name = name;
		_lastname = lastname;
	}
	
	public String getName() {
		return _name;
	}
	
	public String getLastname() {
		return _lastname;
	}

	public String getFullName() {
		return _name + " " + _lastname;
	}

	public String getInfo() {
		return getFullName();
	}
	
}