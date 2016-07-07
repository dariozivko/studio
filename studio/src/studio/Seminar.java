package studio;

import java.util.ArrayList;


public class Seminar {
	
	private String _seminarName;
	private String _location;
	private int _seatsLeft = 10;
	private Course _course;
	private ArrayList<Enrollment> _studentList = new ArrayList<Enrollment>();
	
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
		for (Enrollment enrollment : _studentList) {
			lista = lista+enrollment.getInfo()+ " ";
		}
		return lista;
	}

	public void addStudent(Student student) {
		_studentList.add(new Enrollment(student));
		}

}