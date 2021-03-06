package studio;

public abstract class SeminarPrinter { 	
	
	public String print(Seminar seminar) { 		
		String result = header(seminar); 		
		
		for (Student student : seminar.getStudentList()) { 			
			result += render(student); 		
			} 		
		
		result += footer(); 		
		
		return result; 	
		} 	
	
	public abstract String header(Seminar seminar); 	
	public abstract String render(Student student); 
	public abstract String footer(); 
	
}
