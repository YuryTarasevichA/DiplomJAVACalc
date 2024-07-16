package ru.gb.ComplexCalc.Factory;


import ru.gb.ComplexCalc.ComplexCalc;
import ru.gb.ComplexCalc.ComplexCalculate;
import ru.gb.ComplexCalc.LogComplex;
import ru.gb.ComplexCalc.Logable;

public class LogCalcFactory implements CalcFactory{
    private Logable logger;

    public LogCalcFactory(Logable logger) {
        this.logger = logger;
    }

    @Override
    public ComplexCalc create(double realPart, double imaginaryPart) {
        return new LogComplex(new ComplexCalculate(realPart, imaginaryPart),logger);
    }
}
