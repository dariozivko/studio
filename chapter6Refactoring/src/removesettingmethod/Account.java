package removesettingmethod;

public class Account {
	
	private String _id;

	Account(String id) {
		initializeId(id);
	}

	void initializeId (String arg) {
		_id = "ZZ" + arg;
	}
}
