package ru.gb.Calculate;

import java.util.Scanner;

public class ViewCalc {
    Scanner scanner = new Scanner(System.in);

    Calculate calculate = new BasicCalculator();

    public void program() {
        int choise;
        do {
            System.out.println("Выберите действие: ");
            System.out.println("1. Посчитать");
            System.out.println("0. Вернуться назад");
            choise = scanner.nextInt();
            switch (choise) {
                case 1:
                    System.out.println("Введите первое число:");
                    double num1 = scanner.nextDouble();

                    System.out.println("Введите второе число:");
                    double num2 = scanner.nextDouble();

                    System.out.println("Выбирете действие (+, -, *, /):");
                    char operation = scanner.next().charAt(0);

                    double result = 0;
                    switch (operation) {
                        case '+':
                            result = calculate.add(num1, num2);
                            break;
                        case '-':
                            result = calculate.subtract(num1, num2);
                            break;
                        case '*':
                            result = calculate.multiply(num1, num2);
                            break;
                        case '/':
                            result = calculate.divide(num1, num2);
                            break;
                        default:
                            System.out.println("Invalid operation!");
                    }

                    System.out.println("Ответ: " + result);

                case 0:
                    System.out.println("Выход...");
                    break;
            }

        } while (choise != 0);


    }
}

