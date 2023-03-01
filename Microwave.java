import java.util.Scanner;
/**
* The program is about cooking food.
*
* @author Titwech Wal
* @version 1.0
* @since   2023-02-27
*/

public final class Microwave {

    /**
    * This is a private constructor used to satisfy
    * the style checker.
    *
    * @exception IllegalStateException Utility class.
    * @see IllegalStateException
    */
    private Microwave() {
        throw new IllegalStateException("Utility class");
    }

    /**
    * This is the main method.
    *
    * @param args Unused.
    */
    public static void main(String[] args) {

        // Constants
        final String FOOD_1 = "pizza";
        final String FOOD_2 = "sub";
        final String FOOD_3 = "soup";
        final float AVG_PIZ_TIME = 45;
        final float AVG_SUB_TIME = 60;
        final float AVG_SOUP_TIME = 105;
        final float DOUB_TIME = 1f / 2f;
        final String ERROR_MES = "Sorry but you can "
            + "only select 0,1,2 or 3";

        // initialize number of food items
        String numOfItems = "";
        int numOfItemsInt = 0;
        float time = 0f;
        String userFood = "";

        // Using Scanner for getting input from user
        final Scanner scanner = new Scanner(System.in);

        // Ask the user for food
        System.out.println("Are you heating sub, pizza, or soup?: ");
        userFood = scanner.nextLine();

        if (userFood.equals(FOOD_1)) {
            // Gets number of food being heated
            System.out.println("How many pizza(s) are you cooking?(max:3): ");
            numOfItems = scanner.nextLine();

            // Detects string input.
            try {
                // Convert string to integer
                numOfItemsInt = Integer.parseInt(numOfItems);

                if (numOfItemsInt == 0) {
                    // Calculates time
                    time = 0;
                    System.out.println("The total cook time is: " + time + "s");
                } else if (numOfItemsInt == 1) {
                    // Calculates time
                    time = AVG_PIZ_TIME;
                    System.out.println("The total cook time is: " + time + "s");
                } else if (numOfItemsInt == 2) {
                    // Calculates time
                    time = (AVG_PIZ_TIME * DOUB_TIME) + AVG_PIZ_TIME;
                    System.out.println("The total cook time is: " + time + "s");
                } else if (numOfItemsInt == 3) {
                    // Calculates time
                    time = AVG_PIZ_TIME + AVG_PIZ_TIME;
                    System.out.println("The total cook time is: " + time + "s");
                } else {
                    System.out.println(ERROR_MES);
                }
            } catch (NumberFormatException error) {
                // Displays error to user.
                System.out.print("Please enter valid input."
                    + error.getMessage());
            }
        } else if (userFood.equals(FOOD_2)) {
            // Gets number of food being heated
            System.out.println("How many sub(s) are you cooking?(max:3): ");
            numOfItems = scanner.nextLine();

            // Detects string input.
            try {
                // Convert string to Integer
                numOfItemsInt = Integer.parseInt(numOfItems);

                if (numOfItemsInt == 0) {
                    // Calculates time
                    time = 0;
                    System.out.println("The total cook time is: " + time + "s");
                } else if (numOfItemsInt == 1) {
                    // Calculates Time
                    time = AVG_SUB_TIME;
                    System.out.println("The total cook time is: " + time + "s");
                } else if (numOfItemsInt == 2) {
                    // Calculates Time
                    time = (AVG_SUB_TIME * DOUB_TIME) + AVG_SUB_TIME;
                    System.out.println("The total cook time is: " + time + "s");
                    // Calculates Time
                    time = AVG_SUB_TIME + AVG_SUB_TIME;
                    System.out.println("The total cook time is: " + time + "s");
                } else {
                    System.out.println(ERROR_MES);
                }
            } catch (NumberFormatException error) {
                // Displays error to user.
                System.out.print("Please enter valid input."
                    + error.getMessage());
            }
        } else if (userFood.equals(FOOD_3)) {
            // Gets number of food being heated
            System.out.println("How many soup(s) are you cooking?(max:3): ");
            numOfItems = scanner.nextLine();

            // Detects string input.
            try {
                // Convert string to Integer
                numOfItemsInt = Integer.parseInt(numOfItems);

                if (numOfItemsInt == 0) {
                    // Calculates Time
                    time = 0;
                    System.out.println("The total cook time is: " + time + "s");
                } else if (numOfItemsInt == 1) {
                    // Calculates Time
                    time = AVG_SOUP_TIME;
                    System.out.println("The total cook time is: " + time + "s");
                } else if (numOfItemsInt == 2) {
                    // Calculates Time
                    time = (AVG_SOUP_TIME * DOUB_TIME) + AVG_SOUP_TIME;
                    System.out.println("The total cook time is: " + time + "s");
                } else if (numOfItemsInt == 3) {
                    // Calculates Time
                    time = AVG_SOUP_TIME + AVG_SOUP_TIME;
                    System.out.println("The total cook time is: " + time + "s");
                } else {
                    System.out.println(ERROR_MES);
                }
            } catch (NumberFormatException error) {
                // Displays error to user.
                System.out.print("Please enter valid input."
                    + error.getMessage());
            }
        } else {
            System.out.println("Sorry but '" + userFood
                + "' is not one of the options.");
        }
        // Closes scanner
        scanner.close();
    }
}
