package practical_assignment;
/*
* Create package stores. Under it create a class called stock with member
variable (item_no, item_name, stock_availible, and cost). Under the default
package create a class called sales with field name (qty_sold) and it is the
child class of stores class. Write a program to print the current stock of each
item and perform addition.
* */
public class P7 {
    public static void main(String[] args) {

        Sales s = new Sales(101, "Gold Ring", 50, 2500, 10);

        s.displayStock();
        s.printCurrentStock();
        s.addition();
    }
}
