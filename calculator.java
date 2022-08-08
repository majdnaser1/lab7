package week2day2;

import java.util.Scanner;

public class calculator {

    public  static void main(String[]args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter your first name");
        int number1 = in.nextInt();
        System.out.println("Enter your second name");
        int number2 = in.nextInt();
        System.out.println("Enter your operation");
        String operation = in.next();

        if (operation.equals("+")) {
            System.out.println(number1 + number2);
        } else if (operation.equals("-")) {
            System.out.println(number1 - number2);
        } else if (operation.equals("*")) {
            System.out.println(number1 * number2);
        } else if (operation.equals("/")) {
            System.out.println(number1 / number2);
        } else if (operation.equals("%")) {
            System.out.println(number1 % number2);
        }


    }
}

