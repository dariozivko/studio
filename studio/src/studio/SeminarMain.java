package studio;

public class SeminarMain {

	public static void main(String[] args) {
		
		Course course = new Course("Agricoltura", 3, "Uva e vino");
		Seminar seminar = new Seminar("Impariamo", "Soazza", course);
		Student student = new Student("Dario", "Zivko");
		seminar.addStudent(student);

		System.out.println("Seminario di " + seminar.getName() + " concernente " + seminar.getDescription());
		System.out.println("Luogo: " + seminar.getLocation());
		System.out.println("Posti disponibili: " + seminar.getSeatsLeft());
		System.out.println("Attualmente iscritti: " + seminar.getStudentList());
	}
}