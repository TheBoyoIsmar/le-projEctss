/*
 i want this program to let my ask customers
 what type of natural cut fries they want
 from wendy's
 */

import java.util.Scanner;

public class WendysMenu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Taxes
        float taxes = 1.06f;

        //declarations
        int optionsOfFries = 4;

        String[] typesOfFries = {"Jr. Natural-Cut Fries", "Small-Natural Cut Fries", "Medium-Natural Cut Fries", "Large Natural-Cut Fries"};

        float[] priceOfFries = {1.99f, 2.39f, 2.89f, 3,29f};

        float totalPrice;
        
        int userSelection;

        int QUIT = 5;

        String customersSelection;

        String anotherSelection;

        String anotherCustomer = "si";

        //intruduction
        System.out.println("\nHello, welcome to this code" + 
        ".\nI am learning slowly and want to post all I can to show that I am learning" + 
        ".\nEven if most codes are pretty much the same. " + 
        "\nThank you for taking time out of your day for this.");

        //spacing out
        System.out.println("\n");

        //loop for other cutomers
        while (anotherCustomer.equals("si")) {
            
            System.out.println("Hello, welcome to Wendy's!");

            //shows menu
            System.out.println("Here are your options of fries for today.\n");
            for (int index = 0; index < optionsOfFries; index++) {
            System.out.println((index + 1) + "\t" + typesOfFries[index] + "   \t" + priceOfFries[index]);
            }

            //the option to quit
            System.out.println(QUIT + "\tQuit");

            //enter the number of the fries you want
            System.out.print("\nEnter the number of the fries that you want : ");

            //input validations
            userSelection = scanner.nextInt();
            while (userSelection < 1 || userSelection > 4) {
                System.out.print("\nI'm sorry, That wasnt and option");
                System.out.print("What would you like : ");
                userSelection = scanner.nextInt();
            }

            //loop to allow users to keep getting more fries
            while (userSelection != QUIT) {

                //add the cost of selected fries
                totalPrice = priceOfFries[userSelection - 1];
                
                //shows the menu again
                for (int index = 0; index < optionsOfFries; index++) {
                    System.out.println((index + 1) + "\t" + typesOfFries[index] + "   \t" + priceOfFries[index]);
                }
                System.out.print("\nEnter the fries you want again : ");
                userSelection = scanner.nextInt();

            }




        }
    }
}