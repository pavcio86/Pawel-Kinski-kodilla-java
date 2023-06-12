package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b)  throws ArithmeticException{
        double result = a/b;
        try{
            if (b == 0) {
                throw new ArithmeticException();
            }
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println(" warning!!!   divider cannot equals " + b + " , enter right divider");
        } finally {
            System.out.print("result is : ");
        }
        return result;
    }

    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {
        FirstChallenge firstChallenge = new FirstChallenge();
        double result = firstChallenge.divide(3, 0);

        System.out.println(result);
    }
}