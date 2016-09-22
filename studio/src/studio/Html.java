package studio;

public class Html extends SeminarPrinter { 	
	
	@Override 	
	public String header(Seminar seminar) { 		
		return "<html>" + "<head><title>" + seminar.getCourse().getName() 						
				+ "</title></head><body><div>" 						
				+ seminar.getCourse().getName() + ":</div><ul><li>" 						
				+ seminar.getCourse().getDescription() + "</li><li>" 						
				+ seminar.getLocation() + "</li><li>" + seminar.getSeatsLeft() 						
				+ "</li></ul><div>partecipanti:</div><ul>"; 	
	} 		
	
	@Override 	
	public String render(Student student) { 		
		return "<li>" + student.getFullName() + "</li>"; 	
	} 	
	
	@Override 	
	public String footer() { 		
		return "</ul>" + "</body>" + "</html>"; 	
	} 
}
