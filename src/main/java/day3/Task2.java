package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            double number1 = scanner.nextDouble();
            double number2 = scanner.nextDouble();
            if (number2 != 0) {
                double result = number1 / number2;
                System.out.println(result);
            } else break;
        }
    }
}