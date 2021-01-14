
package resturantmanagement.model;

public class Order {
    private int orderID;
    private int qty;
    private int total;

    public Order(int orderID, int qty, int total) {
        this.orderID = orderID;
        this.qty= qty;
        this.total = total;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
