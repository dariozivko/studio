package studio;

public class Csv extends SeminarPrinter { 	
	
	@Override 	
	public String header(Seminar seminar) { 		
		return quote(seminar.getCourse().getNumber()) + ";" 
				+ quote(seminar.getCourse().getName()) + ";" 
				+ quote(seminar.getCourse().getDescription()) + ";" 
				+ quote(seminar.getLocation()) + ";" 
				+ quote(seminar.getSeatsLeft()) + System.getProperty("line.separator"); 	
	} 		
	
	@Override 	
	public String render(Student student) { 		
		return quote(student.getName()) + ";" 
				+ quote(student.getLastname()) + System.getProperty("line.separator"); 	
	} 	
	
	@Override 	
	public String footer() { 		
		return ""; 	
	} 	
	
	private String quote(Object field) { 		
		return wrap("\"", field); 	
	} 	
	
	private String wrap(String wrapper, Object wrapped) { 		
		return wrapper + wrapped + wrapper; 	
	} 
}
