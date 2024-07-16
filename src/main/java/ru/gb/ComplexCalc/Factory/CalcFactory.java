package ru.gb.ComplexCalc.Factory;


import ru.gb.ComplexCalc.ComplexCalc;

public interface CalcFactory {
    ComplexCalc create(double realPart, double imaginaryPart);
}
