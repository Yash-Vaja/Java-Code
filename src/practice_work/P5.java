package practice_work;// Write a Java program to print the odd numbers from 1 to 9.
// Prints one number per line.

public class P5 {
    public static void main(String[] args) {

        for (int i=1;i<10;i++){
            if (i % 2 != 0){
                System.out.println(i);
            }
        }
    }
}
