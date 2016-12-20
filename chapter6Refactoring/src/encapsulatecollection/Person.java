package encapsulatecollection;

import java.util.HashSet;
import java.util.Set;

public class Person {
	
	private Set<Course> _courses = new HashSet<Course>();
	
	public Set<Course> getCourses() {
		return _courses;
	}
	
	public void addCourse (Course course) {
		_courses.add(course);
	}
	
	public void removeCourse (Course course) {
		_courses.remove(course);
	}
		
	public void initializeCourses(Set<Course> courses) {
		_courses.addAll(courses);
	}
}