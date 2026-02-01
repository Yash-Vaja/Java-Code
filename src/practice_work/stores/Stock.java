package practice_work.stores;

/*
 Stock class inside stores package
*/

public class Stock {

    protected int item_no;
    protected String item_name;
    protected int stock_available;
    protected double cost;

    public Stock(int item_no, String item_name, int stock_available, double cost) {
        this.item_no = item_no;
        this.item_name = item_name;
        this.stock_available = stock_available;
        this.cost = cost;
    }

    public void displayStock() {
        System.out.println("Item No: " + item_no);
        System.out.println("Item Name: " + item_name);
        System.out.println("Stock Available: " + stock_available);
        System.out.println("Cost per Item: " + cost);
    }
}
