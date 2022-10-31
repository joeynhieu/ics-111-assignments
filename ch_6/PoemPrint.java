package ch_6;

import java.util.Scanner;

public class PoemPrint {
    public static void printPoemLine(int number) {
        switch (number) {
            case 0: System.exit(0);
            case 1: System.out.println("Mary had a little lamb");
                    break;
            case 2: System.out.println("His fleece as white as snow");
                    break;
            case 3: System.out.println("And everywhere that Mary went");
                    break;
            case 4: System.out.println("The lamb was sure to go");
                    break;
            case 5: System.out.println("He followed her to school one day");
                    break;
            case 6: System.out.println("Which was made against the rule");
                    break;
            case 7: System.out.println("It made the children laugh and play");
                    break;
            case 8: System.out.println("To see a lamb at school");
                    break;
            default: System.out.println("Sorry, invalid number");
            }
    }


public static void main(String[] args) {
    boolean userValue = true;
    Scanner input = new Scanner(System.in);
    while (userValue){
        System.out.println("Please enter a number (1-8; 0 to quit)");
        int number = input.nextInt();

        printPoemLine(number);
    }
    input.close();
}
}