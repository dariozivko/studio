package replaceconditionalwithpolymorphism;

public class Salesman extends EmployeeType {

	@Override
	int getTypeCode() {
		return EmployeeType.SALESMAN;
	}

}
