package assignment8;

import java.util.Scanner;
import java.util.Stack;

public class Palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string :");
        String ip = sc.nextLine();
        Stack st = new Stack();
        for (int i = 0; i < ip.length(); i++) {
            st.push(ip.charAt(i));
        }
        String reverse = "";
        while (!st.isEmpty()) {
            reverse = reverse + st.pop();
        }
        if (ip.equals(reverse)) {
            System.out.println("This is a palindrome ");
        } else {
            System.out.println("This is not a palindrome ");
        }
    }

}
