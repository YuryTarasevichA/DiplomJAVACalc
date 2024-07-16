package ru.gb;

import ru.gb.Calculate.ViewCalc;
import ru.gb.ComplexCalc.ConsoleLogger;
import ru.gb.ComplexCalc.Factory.CalcFactory;
import ru.gb.ComplexCalc.Factory.LogCalcFactory;
import ru.gb.ComplexCalc.ViewComplex;
import ru.gb.Geometric.ViewGeometric;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choise;
        do {
            System.out.println("Выберите что какой калькулятор нужен: ");
            System.out.println("1. Комплексный");
            System.out.println("2. Обычный");
            System.out.println("3. Расчёт площади геометрических фигур");
            System.out.println("0. Выйти");
            choise = scanner.nextInt();
            switch (choise) {
                case 1:
                    CalcFactory calcFactoryComplex = new LogCalcFactory(new ConsoleLogger());
                    ViewComplex viewComplex = new ViewComplex(calcFactoryComplex);
                    viewComplex.program();
                case 2:
                    ViewCalc viewCalc = new ViewCalc();
                    viewCalc.program();
                case 3:
                    ViewGeometric viewGeometric = new ViewGeometric();
                    viewGeometric.program();
                case 0:
                    System.out.println("Выход из программы...");
                    break;
                default:
                    System.out.println("Неверный выбор. Пожалуйста, попробуйте еще раз.");
            }
        } while (choise != 0);


    }
}
