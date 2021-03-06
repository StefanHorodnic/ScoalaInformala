package com.stefan;

import static com.stefan.HomeworkHelper.isInputAFloat;
import static com.stefan.HomeworkHelper.scanner;

public class Homework2 {

    //Main method
    public static void main(String[] args) {

        float weigth;
        float height;

        do {
            System.out.println("Masa corporală: ");
        }
        while(!isInputAFloat());

        weigth = scanner.nextFloat();

        do {
            System.out.println("Înălțime (în metrii): ");
        }
        while(!isInputAFloat());

        height = scanner.nextFloat();

        if(height > 0 || weigth > 0)
        {
            float index = weigth/(height*height);

            System.out.println("Indicele de Masă Corporală =" + index);

            if(index <= 18.49){
                System.out.println("Subponderal.");
            }
            else if(index > 18.49 && index <= 24.99){
                System.out.println("Greutate normala");
            }
            else if(index > 24.99 && index <= 29.99){
                System.out.println("Supraponderal");
            }
            else if(index > 29.99 && index <= 34.99){
                System.out.println("Obezitate (gradul I)");
            }
            else if(index > 34.99 && index <= 39.99 ){
                System.out.println("Obezitate (gradul II)");
            }
            else {
                System.out.println("Obezitate morbidă");
            }
        }
        else{
            System.out.println("Ciudat că ai înălțimea sau greutatea mai mică sau egală cu 0!!");
        }
    }
}
