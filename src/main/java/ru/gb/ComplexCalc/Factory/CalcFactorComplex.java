package ru.gb.ComplexCalc.Factory;


import ru.gb.ComplexCalc.ComplexCalculate;
/**
 * Класс CalcFactorComplex реализует интерфейс CalcFactory и предоставляет
 * метод create для создания объекта ComplexCalculate с заданными значениями действительной
 * и мнимой частей комплексного числа.
 */

public class CalcFactorComplex implements CalcFactory{
    /**
     * Метод create создает и возвращает новый объект ComplexCalculate с заданными
     * значениями действительной и мнимой частей комплексного числа.
     *
     * @param realPart действительная часть комплексного числа
     * @param imaginaryPart мнимая часть комплексного числа
     * @return объект ComplexCalculate с заданными значениями действительной и мнимой частей
     */
    @Override
    public ComplexCalculate create(double realPart, double imaginaryPart) {
        return new ComplexCalculate(realPart, imaginaryPart);
    }

}
