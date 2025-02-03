```` java[]
import java.util.*;

public class Main{
    public static void main(String[] args) {
        // Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Display the main menu options
        System.out.println("Welcome to CCD");
        System.out.println("Enter the first letter to select the main menu:");
        System.out.println("c - Coffee");
        System.out.println("t - Tea");
        System.out.println("s - Soups");
        System.out.println("b - Beverages");
        System.out.print("Your choice: ");
        
        char mainChoice = sc.next().charAt(0); // Take the first letter as input for main menu

        // Process the main menu choice
        switch (mainChoice) {
            case 'c': // Coffee menu
                System.out.println("1. Espresso Coffee");
                System.out.println("2. Cappuccino Coffee");
                System.out.println("3. Latte Coffee");
                System.out.print("Choose your coffee: ");
                int coffeeChoice = sc.nextInt();
                if (coffeeChoice == 1) {
                    System.out.println("Enjoy your Espresso Coffee!");
                } else if (coffeeChoice == 2) {
                    System.out.println("Enjoy your Cappuccino Coffee!");
                } else if (coffeeChoice == 3) {
                    System.out.println("Enjoy your Latte Coffee!");
                } else {
                    System.out.println("INVALID OUTPUT");
                }
                break;

            case 't': // Tea menu
                System.out.println("1. Plain Tea");
                System.out.println("2. Assam Tea");
                System.out.println("3. Ginger Tea");
                System.out.println("4. Cardamom Tea");
                System.out.println("5. Masala Tea");
                System.out.println("6. Lemon Tea");
                System.out.println("7. Green Tea");
                System.out.println("8. Organic Darjeeling Tea");
                System.out.print("Choose your tea: ");
                int teaChoice = sc.nextInt();
                if (teaChoice == 1) {
                    System.out.println("Enjoy your Plain Tea!");
                } else if (teaChoice == 2) {
                    System.out.println("Enjoy your Assam Tea!");
                } else if (teaChoice == 3) {
                    System.out.println("Enjoy your Ginger Tea!");
                } else if (teaChoice == 4) {
                    System.out.println("Enjoy your Cardamom Tea!");
                } else if (teaChoice == 5) {
                    System.out.println("Enjoy your Masala Tea!");
                } else if (teaChoice == 6) {
                    System.out.println("Enjoy your Lemon Tea!");
                } else if (teaChoice == 7) {
                    System.out.println("Enjoy your Green Tea!");
                } else if (teaChoice == 8) {
                    System.out.println("Enjoy your Organic Darjeeling Tea!");
                } else {
                    System.out.println("INVALID OUTPUT");
                }
                break;

            case 's': // Soups menu
                System.out.println("1. Hot and Sour Soup");
                System.out.println("2. Veg Corn Soup");
                System.out.println("3. Tomato Soup");
                System.out.println("4. Spicy Tomato Soup");
                System.out.print("Choose your soup: ");
                int soupChoice = sc.nextInt();
                if (soupChoice == 1) {
                    System.out.println("Enjoy your Hot and Sour Soup!");
                } else if (soupChoice == 2) {
                    System.out.println("Enjoy your Veg Corn Soup!");
                } else if (soupChoice == 3) {
                    System.out.println("Enjoy your Tomato Soup!");
                } else if (soupChoice == 4) {
                    System.out.println("Enjoy your Spicy Tomato Soup!");
                } else {
                    System.out.println("INVALID OUTPUT");
                }
                break;

            case 'b': // Beverages menu
                System.out.println("1. Hot Chocolate Drink");
                System.out.println("2. Badam Drink");
                System.out.println("3. Badam-Pista Drink");
                System.out.print("Choose your beverage: ");
                int beverageChoice = sc.nextInt();
                if (beverageChoice == 1) {
                    System.out.println("Enjoy your Hot Chocolate Drink!");
                } else if (beverageChoice == 2) {
                    System.out.println("Enjoy your Badam Drink!");
                } else if (beverageChoice == 3) {
                    System.out.println("Enjoy your Badam-Pista Drink!");
                } else {
                    System.out.println("INVALID OUTPUT");
                }
                break;

            default:
                System.out.println("INVALID OUTPUT");
                break;
        }

        // Close the scanner object to avoid resource leak
        sc.close();
    }
}
````
