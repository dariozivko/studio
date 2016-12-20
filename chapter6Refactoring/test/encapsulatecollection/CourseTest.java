package encapsulatecollection;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class CourseTest {

	@Test
	public void test() {
		Person kent = new Person();
		
		kent.addCourse(new Course ("Smalltalk Programming", false));
		kent.addCourse(new Course ("Appreciating Single Malts", true));
		
		assertEquals(2, kent.getCourses().size());
		
		Course refact = new Course ("Refactoring", true);
		kent.addCourse(refact);
		kent.addCourse(new Course ("Brutal Sarcasm",	false));
		
		assertEquals(4, kent.getCourses().size());
		
		kent.getCourses().remove(refact);
		
		assertEquals(3, kent.getCourses().size());
	}
}
