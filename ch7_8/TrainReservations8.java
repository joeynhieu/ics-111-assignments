package ch7_8;

import java.util.Scanner;

public class TrainReservations8 {

    public static void main(String[] args) {
        //input from the user
        Scanner keyboard = new Scanner(System.in); 
        //Declare the variables for menu selection and row selection
        int menuSelection, rowSelection; 
        //Declare the variable for seat option 
        char seatOption;
        //Use a two dimensional char array to store the three seats for each row. 
        //We have five one dimensional arrays (5 rows) in this two dimensional array. 
        //Each one dimensional array is initialized to the seat letter ('A', 'B', 'C'). 
        char[][] seatArray = {{'A', 'B', 'C'}, {'A', 'B', 'C'}, {'A', 'B', 'C'}, {'A', 'B', 'C'}, {'A', 'B', 'C'}};
        
        //Use a loop to print out a menu and perform the appropriate task:  
        while (true)
        {
            // Prompts user with menu options
            System.out.println("\nMenu");
            System.out.println("1. Print Seating Chart");
            System.out.println("2. Select Seat");
            System.out.println("3. Exit");
            
            //Ask the user to enter the choice
            System.out.print("Choice: ");
            //Store user input in variable menu selection
            menuSelection = keyboard.nextInt(); 
            
            //If user input (menu selection) is 1, display seating chart
            if (menuSelection == 1) 
            {
                System.out.println("\nSeating Chart");
                //Display seating chart
                for(int i = 0; i < 5; i++)
                {   System.out.print("Row " + (i + 1) + ": ");
                    for(int k = 0; k < 3; k++) 
                    {
                        System.out.print(seatArray[i][k] + " ");
                    }//Close inner for loop
                    System.out.println();
                }//Close outer for loop
            }//Close menu selection 1
            
            //If user input (menu selection) is 2, ask the user to select a 
            //seat by entering its corresponding row number and seat option 
            //and replace the corresponding entry in seat chart to 'X' to 
            //indicate that that seat is not available
            else if(menuSelection == 2) 
            {
                //Ask the user to select the row
                System.out.print("Select row (1, 2, 3, 4, 5): ");
                //Read row from the user
                rowSelection = keyboard.nextInt();
                
                //If selected row is invalid
                if(rowSelection < 1 || rowSelection > 5)
                {
                    //Print "Sorry, invalid row selection"
                    System.out.println("Sorry, invalid row selection"); 
                }
                //If selected row is valid
                else
                {
                    //Ask the user to enter a seat option
	                System.out.print("Select seat (A, B, C): ");
                    //Read seat option from the user
                    seatOption = keyboard.next().charAt(0);
                    //If seat option is 'A'
                    if (seatOption == 'A')
                    {
                        //Set the first column in the selected row to 'X'
                        seatArray[rowSelection - 1][0] = 'X';
                    }
                    //If seat option is 'B'
                    else if (seatOption == 'B')
                    {
                    //Set the second column in the selected row to 'X'
                        seatArray[rowSelection - 1][1] = 'X';
                    }
                    //If seat option is 'C'
                    else if (seatOption == 'C')
                    {
                    //Set the third column in the selected row to 'X'
                        seatArray[rowSelection - 1][2] = 'X';
                    }
                    //If user selects an invalid seat option
                    else
                    {
                        //Print "Sorry, invalid seat selection"
                        System.out.println("Sorry, invalid seat selection");
                    }
                }
            }//Close menu selection 2

            //If menu selection is 3, exit the program
            else if (menuSelection == 3)  
            {
                //Print "Thank you for using Train Reservation System"
                System.out.println("\nThank you for using Train Reservation System!");
                //Exit the program
                System.exit(0);
            } // Close menu selection 3
            
            //If user selects invalid choice (other than 1 or 2 or 3)
            else
            {
                //Print "Sorry, invalid option"
                System.out.println("Sorry, invalid option");
            }
        } //Close while
    } // Close main
}

