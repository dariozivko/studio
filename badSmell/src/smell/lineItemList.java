package smell;

import java.util.Vector;
 
class Lineitemlist {
    private Vector _lineList;
 
    public void setLineItems(Vector lineItems) {
        _lineList = lineItems;
    }
 
    Vector getLineItems() {
        return _lineList;
    }
}
