package replaceTypeCodeWithStateStrategy;

public class Engineer extends EmployeeType {

	@Override
	int getTypeCode() {
		return EmployeeType.ENGINEER;
	}
}
