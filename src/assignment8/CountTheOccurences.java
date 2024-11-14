package assignment8;

import java.util.Scanner;

public class CountTheOccurences {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String input = sc.nextLine();
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char x = 'o';
            if (input.charAt(i) == x) {
                count++;
            }
        }
        System.out.println("The number of time appears of o is : " + count);
    }

}
