package BMI;
import java.util.Scanner;

import BMI.calculator.calculator;
import BMI.utility.PrinterHelp;


public class Main {
    public static void main(String[] args) {


        char option;
        double height;
        double weight;

        Scanner scanner = new Scanner(System.in);

        do{

            PrinterHelp.startMenu();
            option = scanner.next().charAt(0);

            if(option != 'a' && option != 'b'){
                PrinterHelp.incorrectInput();  // Challenge, create and use a static method to inform the user of a wrong entry via PrinterHelper
                continue;
            }

            if(option == 'b')                       // if b option is enabled break to discontinue
                break;


            PrinterHelp.getWeight();
            weight = scanner.nextDouble();

            PrinterHelp.getHeight();
            height = scanner.nextDouble();

            calculator calculator = new calculator(height, weight);


            System.out.println("Your BMI: " + calculator.getRoundedBMI());
            System.out.println("BMI Category: " + calculator.calculateBMICategory());

        }while (option != 'b');
    }
}