package smell;

import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Vector;
 
public class Order {
 
    private Lineitemlist lineItemList;
	private Iterator iter;
	private LineItem item;
	private int total;
	private int lineItemTotal;
 
    public Order(Lineitemlist lis) {
        lineItemList = lis;
    }
 
    public void writeOrder(Order order, PrintWriter pw) {
        printItems(order, pw);
        pw.println("Order total = " + getTotal());
    }

	private void printItems(Order order, PrintWriter pw) {
		iter = order.lineItemList.getLineItems().iterator();
        
            while (iter.hasNext()) {
                item = (LineItem)iter.next();
 
                pw.println("Begin Line Item");
                pw.println("Product = " + item.getProductID());
                pw.println("Image = " + item.getImageID());
                pw.println("Quantity = " + item.getQuantity());
                pw.println("Total = " + item.getUnitPrice() * item.getQuantity());
                pw.println("End Line Item");
            }
	}

	private int calculateTotal(Vector lineItems) {
        iter = lineItems.iterator();
        total = 0;
        
            while (iter.hasNext()) {
                item = (LineItem)iter.next();
                lineItemTotal = item.getUnitPrice() * item.getQuantity();
                total += lineItemTotal;
            }
		return total;
	}
 
	public int getTotal() {
            return calculateTotal(lineItemList.getLineItems());
    }
}