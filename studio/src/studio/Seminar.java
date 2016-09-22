package studio;

import java.util.ArrayList;
import java.util.List;


public class Seminar {
	
	private String _seminarName;
	private String _location;
	private int _seatsLeft = 10;
	private Course _course;
	private ArrayList<Student> _studentList = new ArrayList<Student>();
	
	public Seminar(String seminarName, String location, Course course) {
		_course = course;
		_location = location;
		_seminarName = seminarName;
	}
	
	public String getName(){
		return _seminarName;
	}
	
	public Course getCourse(){
		return _course;
	}
	
	public String getDescription(){
		return _course.getDescription();
	}
	
	public String getLocation(){
		return _location;
	}

	public int getSeatsLeft(){
		return _seatsLeft;
	}

	public List<Student> getStudentList() {
		return _studentList;
	}

	public void addStudent(Student student) {
		_studentList.add(student);
		}

}