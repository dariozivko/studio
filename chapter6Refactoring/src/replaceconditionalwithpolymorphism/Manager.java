package replaceconditionalwithpolymorphism;

public class Manager extends EmployeeType {

	@Override
	int getTypeCode() {
		return EmployeeType.MANAGER;
	}

}
