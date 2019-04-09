package Zadanka.Zadanie3Exceptions;

public class Calculator {
    public double divide(double x, double y) throws DivideByZeroException { //
        if (y == 0) {
            throw new DivideByZeroException("Nie dziel przez 0");
        }
        return x / y;

    }
}
