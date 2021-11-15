package day01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        PositiveNumberContainer positiveNumberContainer = new PositiveNumberContainer();

        double numberToCheck;

        do{
            System.out.println("Adjonmeg egy szamot: ");
            numberToCheck = scnr.nextDouble();
            positiveNumberContainer.addNumber(numberToCheck);
        }
        while (numberToCheck > 0 );

        for (int i = 0 ; i < positiveNumberContainer.getNumbers().size()-1; i++){
            System.out.print(positiveNumberContainer.getNumbers().get(i) + ", ");
        }

    }
}
