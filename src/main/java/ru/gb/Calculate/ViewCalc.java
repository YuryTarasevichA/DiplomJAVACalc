package ru.gb.Calculate;

import java.util.InputMismatchException;
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
            try {
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
                                if (num2 == 0) throw new ArithmeticException("Деление на 0 не допустимо");
                                result = calculate.divide(num1, num2);
                                break;
                            default:
                                throw new IllegalArgumentException("Неверная операция");
                        }

                        System.out.println("Ответ: " + result);

                    case 0:
                        System.out.println("Выход...");
                        break;
                    default:
                        System.out.println("Неверный выбор. Пожалуйста, попробуйте еще раз.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: некорректный ввод числа, введите числа.");
                scanner.next();
            } catch (ArithmeticException | IllegalArgumentException e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        } while (choise != 0);
    }
}

