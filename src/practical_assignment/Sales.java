package practical_assignment;
import practical_assignment.stores.Stock;

/*
 Sales class in default package
 Child class of Stock
*/

public class Sales extends Stock {

    int qty_sold;

    public Sales(int item_no, String item_name, int stock_available, double cost, int qty_sold) {
        super(item_no, item_name, stock_available, cost);
        this.qty_sold = qty_sold;
    }

    void printCurrentStock() {
        int currentStock = stock_available - qty_sold;
        System.out.println("Quantity Sold: " + qty_sold);
        System.out.println("Current Stock: " + currentStock);
    }

    void addition() {
        double totalAmount = qty_sold * cost;
        System.out.println("Total Sales Amount: " + totalAmount);
    }

}
