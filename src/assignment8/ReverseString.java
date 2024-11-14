package assignment8;

import java.util.Scanner;
import java.util.Stack;

public class ReverseString {

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
        System.out.println("The string after reverse is :  " + reverse);
    }

}
