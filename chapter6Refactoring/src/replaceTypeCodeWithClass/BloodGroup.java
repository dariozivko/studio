package replaceTypeCodeWithClass;

public class BloodGroup {
	
	public static final BloodGroup O = new BloodGroup(0);
	public static final BloodGroup A = new BloodGroup(1);
	public static final BloodGroup B = new BloodGroup(2);
	public static final BloodGroup AB = new BloodGroup(3);
	private static final BloodGroup[] _groups = {O, A, B, AB};
	
	private final int _code;

	public BloodGroup(int i) {
		_code = i;
	}
	
	public int getCode() {
		return _code;
	}
	
	public static BloodGroup code(int arg) {
		return _groups[arg];
	}
}
