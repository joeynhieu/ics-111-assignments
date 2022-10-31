package ch_6;

import java.util.Scanner;

public class SimpleCalculator {
    /**
     * This method will add the two numbers and will not return a result
     * 
     * @param num1 first number to be added
     * @param num2 second number to be added
     */
    public static void add(double num1, double num2){
// dsfdf
    }
    
    /***
     * This method will subtract the two numbers and will not return a result
     * 
     * @param num1 first number to be subtracted
     * @param num2 second number to be subtracted
     */
    public static void subtract(double num1, double num2){

    }

    /**
     * This method will multiply the two numbers and will return a double value
     * 
     * @param num1 first number to be multiplied
     * @param num2 second number to be multiplied
     * @return
     */
    public static double multiply(double num1, double num2){

        
    }

    /**
     * This method will divide the two numbers and will return a double
     * 
     * @param num1 first number to be multiplied
     * @param num2 second number to be multiplied
     * @return
     */
    public static double divide(double num1, double num2){
    


    }


    public static void main(String[] args) {
        boolean calcGo = true;
        Scanner input = new Scanner(System.in);
        System.out.println("Calculator Choices: \n1. Add \n2. Subtract \n3. Multiply \n4. Divide");
        
        // while calcGo --> makes it run in a loop forever
        while(calcGo){
            System.out.println("Select Choice:");
            int calcChoice = input.nextInt();

            if (calcChoice > 0 && calcChoice < 5){
                System.out.println("Enter first number:");
                double firstNum = input.nextDouble();

                System.out.println("Enter second number:");
                double secNum = input.nextDouble();


            }

        }
    
    }
}
