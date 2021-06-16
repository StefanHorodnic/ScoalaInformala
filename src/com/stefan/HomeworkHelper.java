package com.stefan;

import java.util.Scanner;

public class HomeworkHelper {

    //Fields
    public static Scanner scanner = new Scanner(System.in);

    //Helper Methods
    public static boolean isInputAnInteger(){
        if(!scanner.hasNextInt()){
            System.out.println(scanner.next() + " nu este un număr întreg!");
            return false;
        }
        else{
            return true;
        }
    }

    public static boolean isInputAFloat(){
        if(!scanner.hasNextFloat()){
            System.out.println(scanner.next() + " nu este un număr valid!");
            return false;
        }
        else{
            return true;
        }
    }


    public static boolean isInputAValidOperator(String inputOperator){
        return switch (inputOperator) {
            case "-", "+", "*", "/" -> true;
            default -> false;
        };
    }
}
