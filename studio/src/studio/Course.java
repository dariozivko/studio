package studio;

public class Course {
	
	private String _name;
	private int _number;
	private String _description;
	
	public Course(String courseName, int courseNumber, String description) {
		_name = courseName;
		_number = courseNumber;
		_description = description;
	}

	public String getName(){
		return _name;
	}
	
	public int getNumber(){
		return _number;
	}
	
	public String getDescription(){
		return _description;
	}

}