package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (count < 5) {
            double number1 = scanner.nextDouble();
            double number2 = scanner.nextInt();
            if (number2 != 0) {
                double result = number1 / number2;
                System.out.println(result);
            }
            if (number2 == 0) {
                System.out.println("Деление на 0");
            }
            count++;
        }
    }
}