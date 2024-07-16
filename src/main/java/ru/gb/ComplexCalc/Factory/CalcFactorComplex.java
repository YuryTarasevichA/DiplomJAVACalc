package ru.gb.ComplexCalc.Factory;


import ru.gb.ComplexCalc.ComplexCalculate;

public class CalcFactorComplex implements CalcFactory{

    @Override
    public ComplexCalculate create(double realPart, double imaginaryPart) {
        return new ComplexCalculate(realPart, imaginaryPart);
    }

}
