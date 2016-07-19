package studio;

import java.util.ArrayList;


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
	
	public String getDescription(){
		return _course.getDescription();
	}
	
	public String getLocation(){
		return _location;
	}

	public int getSeatsLeft(){
		return _seatsLeft;
	}

	public String getStudentList() {
		 String lista = new String("");
		if (_studentList.isEmpty()) return "Nessuno studente";
		for (Student stud : _studentList) {
			lista = lista+stud.getInfo()+ " ";
		}
		return lista;
	}

	public void addStudent(Student student) {
		_studentList.add(student);
		}

}