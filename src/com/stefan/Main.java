package com.stefan;
import java.util.Scanner;

public class Main  {

    //Fields
    private static Scanner scanner;

    //Constructor
    public static void main(String[] args) {
        createScanner();

        t1MultiplyTwoNumbers();

        t2Readakeyboardnumber();

        t3ReadAKeyboardNumber();

        t4Calculator();

        t5AllEvenNumbers();
    }

    //Private methods
    private static void createScanner(){
        scanner = new Scanner(System.in);
    }

    private static void t1MultiplyTwoNumbers(){

        int firstNumber;
        int secondNumber;
        String askForFirstNumber = "Primul număr: ";
        String askForSecondNumber = "Al doilea număr: ";

        System.out.println("T1: Citire a 2 numere și afișarea înmulțirii lor");

        System.out.print(askForFirstNumber);

        while(!isInputAnInteger()){
            System.out.print(askForFirstNumber);
        }

        firstNumber = scanner.nextInt();

        System.out.print(askForSecondNumber);

        while(!isInputAnInteger()){
            System.out.print(askForSecondNumber);
        }

        secondNumber = scanner.nextInt();

        System.out.println("Rezultatul înmulțirii este: " + firstNumber * secondNumber);
    }

    private static void t2Readakeyboardnumber(){
        int inputNumber;
        String askForNumber = "Alege un număr: ";

        System.out.println();
        System.out.println("T2: Citire a unui number de la tastatură.");
        System.out.print(askForNumber);

        while(!isInputAnInteger()){
            System.out.print(askForNumber);
        }

        inputNumber = scanner.nextInt();

        if(inputNumber == 5){
            System.out.println("Numărul este 5");
        }
        else {
            System.out.println(("Numărul nu este 5"));
        }
    }

    private static void t3ReadAKeyboardNumber() {

        int inputNumber;
        String askForNumber = "Alege un număr: ";

        System.out.println();
        System.out.println("T3: Citire a unui number de la tastatură.");
        System.out.print(askForNumber);

        while(!isInputAnInteger()){
            System.out.print(askForNumber);
        }

        inputNumber = scanner.nextInt();

        if(0 < inputNumber && inputNumber < 10){
            System.out.println("Numărul mai mic decat 10.");
        }
        else if(inputNumber >= 10 && inputNumber < 20){
            System.out.println("Numărul este între 10 - 20.");
        }
        else if(inputNumber > 30){
            System.out.println("Numărul este mai mare decât 30.");
        }
        else{
            System.out.println("Numărul este mai mic sau egal cu 0");
        }
    }

    private static void t4Calculator(){
        int a;
        int b;
        String operator;

        String askForNumberA = "a = ";
        String askForNumberB = "b = ";
        String askForOperator = "Alege tipul de operație matematică: ";
        String operationTypeError = "Operație matematică invalidă!";

        System.out.println();
        System.out.println("T4: Realizati o aplicatie ce imita un calculator.");
        System.out.print(askForNumberA);

        while(!isInputAnInteger()){
            System.out.print(askForNumberA);
        }

        a = scanner.nextInt();

        System.out.print(askForNumberB);

        while(!isInputAnInteger()){
            System.out.print(askForNumberB);
        }

        b = scanner.nextInt();

        System.out.print(askForOperator);

        operator = scanner.next();

        while(!isInputAValidOperator(operator)){
            System.out.println(operationTypeError);
            System.out.print(askForOperator);
            operator = scanner.next();
        }

        System.out.print(operationResult(operator, a,b));
    }

    private static void t5AllEvenNumbers(){

        System.out.println();
        System.out.println();
        System.out.println("T5: Afișați toate numerele pare de a 0 la 100.");

        for(int i=0;i <= 100; i++){
            if(i % 2 == 0){
                System.out.print(i + " ");
            }
        }



    }

    //Helper Methods
    private static boolean isInputAnInteger(){
        if(!scanner.hasNextInt()){
            System.out.println(scanner.next() + " nu este un număr întreg!");
            return false;
        }
        else{
            return true;
        }
    }

    private static boolean isInputAValidOperator(String inputOperator){
        return switch (inputOperator) {
            case "-", "+", "*", "/" -> true;
            default -> false;
        };
    }

    private static String operationResult(String inputOperator, int a, int b){

        String prefix = "Rezultatul operației matematice este ";

        return switch (inputOperator) {
            case "-" -> prefix + (a - b);
            case "+" -> prefix + (a + b);
            case "*" -> prefix + a * b;
            case "/" -> prefix + (float) a / (float) b;
            default -> "";
        };
    }
}
