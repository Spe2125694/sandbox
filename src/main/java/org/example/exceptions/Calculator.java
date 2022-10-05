package org.example.exceptions;

public class Calculator {

    public int divide(int o1, int o2) throws DivideByZeroException {
        int returnValue = 0;

        if (o2 != 0) {
            returnValue = o1 / o2;
        } else {
            throw new DivideByZeroException("You can't divide by zero");
        }

        return returnValue;
    }
    public double divide(double o1, double o2) throws DivideByZeroException {
        double returnValue = 0.0;

        if (o2 != 0.0) {
            returnValue = o1 / o2;
        } else {
            throw new DivideByZeroException("You can't divide by zero");
        }
        return returnValue;
    }



    public static void main(String[] args) {
        Calculator c = new Calculator();
        try {
            System.out.println(c.divide(2.0, 0.0));
        } catch (DivideByZeroException e) {
            throw new RuntimeException(e);
        }
    }
}
