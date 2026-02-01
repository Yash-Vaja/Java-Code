package practice_work;

//Write a program to demonstrate throw and throws keyword.
public class P20 {
    static void check(int age) throws ArithmeticException {
        if (age < 18)
            throw new ArithmeticException("Not eligible");
        else
            System.out.println("Eligible");
    }

    public static void main(String[] args) {
        try {
            check(16);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
