package replaceinheritancewithdelegation;

import java.util.Vector;

class MyStack{
	private Vector<Object> _vector = new Vector<Object>();
	
	public void push(Object element) {
		_vector.insertElementAt(element, 0);
	}
	
	public Object pop() {
		Object result = _vector.firstElement();
		_vector.removeElementAt(0);
		return result;
	}
}
