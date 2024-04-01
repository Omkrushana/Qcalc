package com.crio.qcalc;

public class ScientificCalculator extends StandardCalculator {

    public static void getVersion() {
        System.out.println("Scientific Calculator 1.0");
    }

    // Sine

    // Cosine

    // Tan

    // Log

    // Square Root

    // Cube Root

    // Square

    public void sin(double a) {
        result = (Math.sin(a));
    }

    public void cos(double a) {
        result = (Math.cos(a));
    }

    public void square(double a) {
        multiply(a, a);
    }

    public void tan(double a) {
        result = (Math.tan(a));
    }

    public void log(double exp) {
        result = Math.log(exp);
    }

    public void cbrt(int a) {
        result = Math.cbrt(a);
    }


    @Override

    public void printResult() {

        System.out.println("Scientific Calculator Result:" + result);

    }

    public void sqrt(double a) {
        result = Math.sqrt(a);
    }


}
