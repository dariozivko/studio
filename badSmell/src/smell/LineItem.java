package smell;

import java.util.Vector;
 
class LineItem {
	private int _productId;
    private int _imageID;
    private int _quantity;
    private int _unitPrice;
	private Vector _lineItems;
 
    public LineItem(int prodID, int imageID, int qty) {
        _productId = prodID;
        _imageID = imageID;
        _quantity = qty;
    }
 
    public void setLineItems(Vector lineItems) {
        _lineItems = lineItems;
    }
 
    Vector getLineItems() {
        return _lineItems;
    }
 
    int getProductID() {
        return _productId;
    }
 
    int getImageID() {
        return _imageID;
    }
 
    int getQuantity() {
        return _quantity;
    }
 
    int getUnitPrice() {
        return _unitPrice;
    }
 
    void setProductID(int id) {
        _productId = id;
    }
 
    void setImageID(int id) {
        _imageID = id;
    }
 
    void setQty(int qty) {
        this._quantity = qty;
    }
 
    void setUnitPrice(int i) {
        _unitPrice = i;
    }
}
