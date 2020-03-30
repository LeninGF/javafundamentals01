package cec.epn.negocio;

public class Calculator {
    String operator;
    int number1, number2;

    private double addOp() {
        return number1 + number2;
    }

    private double restOp() {
        return number1 - number2;
    }

    private double prodOp() {
        return number1 * number2;
    }

    private double divOp() {
        double result;
        if (number2 != 0) {
            result = number1 / number2;
        } else {
            result = -999;
        }
        return result;
    }

    private double expOp() {
        return Math.pow(number1, number2);
    }

    private double moduleOp() {
        double result;
        if (number2 != 0) {
            result = number1 % number2;
        } else {
            result = -999;
        }
        return result;
    }

    public double arithmeticOper() {
        double result;
        switch (operator) {
            case "+":
                result = addOp();
                break;
            case "-":
                result = restOp();
                break;
            case "*":
                result = prodOp();
                break;
            case "/":
                result = divOp();
            case "^":
                result = expOp();
                break;
            case "%":
                result = moduleOp();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + operator);
        }
        return result;
    }

    public Calculator(String operator, int number1, int number2) {
        this.operator = operator;
        this.number1 = number1;
        this.number2 = number2;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }
}
