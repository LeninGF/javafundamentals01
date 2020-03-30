package cec.epn.presentation;

import cec.epn.negocio.*;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {
    private void mainMenu() {
        int choice = 0;
        do {
            System.out.println("Main Menu");
            System.out.println("1. Second Degree Equation Solver");
            System.out.println("2. Vowel Counter");
            System.out.println("3. Vowel Counter with Regex");
            System.out.println("4. Prime Number");
            System.out.println("5. Calculator");
            System.out.println("6. Exit");
            System.out.print("Make your choice: ");
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            System.out.println("You chose: " + choice);
            switch (choice) {
                case 1:
                    secondDegreeProgram();
                    break;
                case 2:
                    vowelCounterProgram();
                    break;
                case 3:
                    vowelCounterRegexProgram();
                    break;
                case 4:
                    primeIdProgram();
                    break;
                case 5:
                    calculatorProg();
                    break;
                case 6:
                    System.out.println("Exiting application");
                    break;
                default:
                    System.out.println("Wrong Choice Try Again");
                    break;
            }
        } while (choice != 6);

    }

    private void secondDegreeProgram() {
        double[] results;
        System.out.println("========Second Degree Equation Program=======");
        System.out.println("\t\t\t\tax^2+bx+c=0");
        System.out.print("Input a: ");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        System.out.print("Input b: ");
        double b = scanner.nextDouble();
        System.out.print("Input c: ");
        double c = scanner.nextDouble();

        SecondDegreeEquation secondDegEq = new SecondDegreeEquation(a, b, c);
        results = secondDegEq.solveSecondDegEq();
        if (results[0] != -999 && results[1] != -999) {
            System.out.println("Equation: " + a + "x^2+" + b + "x+" + c + " is solvable");
            int cont = 1;
            for (double root : results
            ) {
                System.out.println("x" + cont + ": " + root);
                cont += 1;
            }
        } else {
            System.out.println("Equation: " + a + "x^2+" + b + "x+" + c + " is NOT solvable");
        }

    }

    private void vowelCounterProgram() {
        final String textIn = "La lluvia en Sevilla es una maravilla";
        int numberVowels = 0;
        VowelCounter vowelCounter = new VowelCounter(textIn);
        numberVowels = vowelCounter.counter();
        System.out.println(textIn + " has " + numberVowels + " vowels");
    }

    private void vowelCounterRegexProgram() {
        System.out.print("Write a sentence to count its vowels: ");
        Scanner scan = new Scanner(System.in);
        String textIn = scan.nextLine();
        int numberVowels = 0;
        VowelCounterRegex countingVowels = new VowelCounterRegex(textIn);
        numberVowels = countingVowels.vowelCount();
        System.out.println(textIn + " has " + numberVowels + " vowels");
    }

    private void primeIdProgram() {
        boolean result;
        System.out.print("Input an integer number: ");
        Scanner scanner = new Scanner(System.in);
        int data = scanner.nextInt();
        PrimeNumber primeNumber = new PrimeNumber(data);
        result = primeNumber.isPrime();
        if (result) {
            System.out.println("\nNumber " + data + " is Prime");
        } else {
            System.out.println("\nNumber " + data + " is Not Prime");
        }


    }

    private void calculatorProg() {
        System.out.println("Program Arithmetic Operations");
        System.out.print("Please select an operation: +, -, *, ^, %: ");
        Scanner scanner = new Scanner(System.in);
        String operation = scanner.next();
        System.out.print("Input First Number: ");
        int num1 = scanner.nextInt();
        System.out.print("Input Second Number: ");
        int num2 = scanner.nextInt();
        Calculator calculator = new Calculator(operation, num1, num2);
        double result = calculator.arithmeticOper();
        System.out.println(num1 + " " + operation + " " + num2 + " = " + result);

    }

    public static void main(String[] args) {
        // write your code here
        Main mainObj = new Main();
        mainObj.mainMenu();

    }
}
