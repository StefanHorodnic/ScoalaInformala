package com.stefan;

import static com.stefan.HomeworkHelper.scanner;

public class Homework3 {

    public static void main(String[] args) {

        System.out.println("Please type your name: ");

        String name = scanner.nextLine();

        if (!name.equals("")) {
            System.out.println("Hello, " + name + "!");
        } else {
            System.out.println("Hello, stranger.");
        }
    }
}
