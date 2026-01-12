/*Write a Java program to capitalize the first letter of each word
        in a sentence.*/

import java.util.Scanner;

public class P8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s  = sc.nextLine();
        StringBuffer sb = new StringBuffer();
        sb.append(Character.toUpperCase(s.charAt(0)));
        for (int i = 1 ; i< s.length(); i++) {
            if (s.charAt(i-1) == ' '){
                sb.append(Character.toUpperCase(s.charAt(i)));
            }else{
                sb.append(s.charAt(i));
            }
        }
        System.out.println("Final string: "+  sb);
    }
}
