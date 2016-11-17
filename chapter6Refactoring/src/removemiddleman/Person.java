package removemiddleman;

class Person {
	private Department _department;
	private String _name;
	
	public Person(String name) {
		_name = name;
	}
	
	public void setDepartment(Department arg) {
		_department = arg;
	}
	
	public Department getDepartment() {
		return _department;
	}
	
	public String getName() {
		return _name;
	}
	
	public Person getManager() {
		return _department.getManager();
	}
}
