package com.crio.qcalc;

public class StandardCalculator {

    protected double result;

    public static void getVersion() {
        System.out.println("Standard Calculator 1.0");
    }


    public double getResult() {
        return result;
    }


    public void setResult(int result) {
        this.result = result;
    }

    public void setResult(double result) {
        this.result = (int) result;
    }

    public final int add(int num1, int num2) {
        add((double) num1, (double) num2);
        return (int) (result = num1 + num2);
    }


    public final int subtract(int num1, int num2) {
        return (int) (result = num1 - num2);
    }


    public final int multiply(int num1, int num2) {
        multiply((double) num1, (double) num2);
        return (int) (result = num1 * num2);
    }

    public final int divide(int num1, int num2) {
        return (int) (result = num1 / num2);
    }


    public final void add(double num1, double num2) {

        double result = num1 + num2;

        if ((result == Double.MAX_VALUE) || (result == Double.POSITIVE_INFINITY)) {

            throw new ArithmeticException("Double overflow");

        }

        this.result = result;

    }


    public final void subtract(double num1, double num2) {
        double result = num1 - num2;
        if (Double.isInfinite(result) || Double.isNaN(result)) {
            throw new ArithmeticException("Double overflow");
        }

        this.result = result;
    }


    public final void multiply(double num1, double num2) {
        double result = num1 * num2;
        if (Double.isInfinite(result) || Double.isNaN(result)) {

            throw new ArithmeticException("Double overflow");

        }

        this.result = result;
    }


    public final void divide(double num1, double num2) {
        double result = num1 / num2;
        if (num2 == 0.0) {

            throw new ArithmeticException("Divide By Zero");

        }

        if ((result == Double.MAX_VALUE) || (result == Double.POSITIVE_INFINITY)) {

            throw new ArithmeticException("Double overflow");

        }

        this.result = result;
    }



    public void printResult() {

        System.out.println("Standard Calculator Result:" + result);

    }


}
