package ru.gb.Geometric;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ViewGeometric {
    Scanner scanner = new Scanner(System.in);

    public void program() {
        int choise;
        do {
            System.out.println("Выберите действие: ");
            System.out.println("1. Посчитать площадь треугольника");
            System.out.println("2. Посчитать площадь прямоугольника");
            System.out.println("3. Посчитать площадь окружности");
            System.out.println("0. Вернуться назад");
            choise = scanner.nextInt();
            switch (choise) {
                case 1:
                    try {
                        System.out.println("Введите длины сторон треугольника: ");
                        double side1 = scanner.nextDouble();
                        double side2 = scanner.nextDouble();
                        double side3 = scanner.nextDouble();
                        Geometric triangle = new Triangle(side1, side2, side3);
                        double area = triangle.calculateArea();
                        System.out.println("Ответ = " + area);
                    } catch (InputMismatchException e) {
                        System.out.println("Ошибка: Некорректный ввод. Введите числа.");
                        scanner.next();
                    }
                    break;
                case 2:
                    try {
                        System.out.println("Введите длины сторон прямоугольника: ");
                        double length = scanner.nextDouble();
                        double width = scanner.nextDouble();
                        Geometric rectangle = new Rectangle(length, width);
                        double area2 = rectangle.calculateArea();
                        System.out.println("Ответ = " + area2);
                    } catch (InputMismatchException e) {
                        System.out.println("Ошибка: Некорректный ввод. Введите числа.");
                        scanner.next();
                    }
                    break;
                case 3:
                    try {
                        System.out.println("Введите радиус окружности: ");
                        double radius = scanner.nextDouble();
                        Geometric circle = new Circle(radius);
                        double area3 = circle.calculateArea();
                        System.out.println("Ответ = " + area3);
                    } catch (InputMismatchException e) {
                        System.out.println("Ошибка: Некорректный ввод. Введите числа.");
                        scanner.next();
                    }
                    break;
                case 0:
                    System.out.println("Выход...");
                    break;
                default:
                    System.out.println("Неверный выбор. Пожалуйста, попробуйте еще раз.");
            }
        } while (choise != 0);
    }
}
