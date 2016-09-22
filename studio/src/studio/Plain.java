package studio;

public class Plain extends SeminarPrinter { 	
	
	@Override 	
	public String header(Seminar seminar) { 		
		return  "Seminario di " + seminar.getCourse().getName() + " (" 
				+ seminar.getCourse().getNumber() + ") su " 
				+ seminar.getCourse().getDescription() + "\n" 
				+ "Il seminario si terrà presso " + seminar.getLocation() 
				+ " e al momento ci sono ancora " + seminar.getSeatsLeft() + " posti disponibili\n" 
				+ "\n\n" 
				+ "Gli studenti attualmente iscritti sono: \n"; 	
		} 	
	
	@Override 	public String render(Student student) { 		
		return "** " + student.getName() + " " + student.getLastname() + " ** \n"; 	
		} 	
	
	@Override 	public String footer() { 		
		return ""; 	
		} 
}
