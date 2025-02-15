package Slide80;

public class SumCalculator {

    public static void main(String[] args) {

        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(12);
        calculator.setSecondNumber(0);
        System.out.println(calculator.getDivisionResult());
    }
}

class SimpleCalculator {

    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber() {
        return firstNumber;
    }
    public double getSecondNumber() {
        return secondNumber;
    }
    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }
    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }
    public double getAdditionResult() {
        return firstNumber + secondNumber;
    }
    public double getSubtractionResult() {
        return firstNumber - secondNumber;
    }
    public double getMultiplicationResult() {
        return firstNumber * secondNumber;
    }
    public double getDivisionResult() {
        if (secondNumber != 0) {
            return firstNumber / secondNumber;
        }
        else {
            return 0;
        }
    }
}