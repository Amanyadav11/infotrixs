import java.util.ArrayList;
import java.util.Scanner;

/**
 * A simple currency converter program that allows users to add favorite currencies,
 * view their favorite currencies, and perform currency conversions.
 */
public class CurrencyConverterClass
{
    // ArrayList to store favorite currencies
    public static ArrayList<String> Currency = new ArrayList<>();

    /**
     * Main method that provides a menu-driven interface for users to interact with the program.
     * @param args The command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Options:");
            System.out.println("1. Add currency to favorites");
            System.out.println("2. View favorite currencies");
            System.out.println("3. Convert currency");
            System.out.println("4. Exit");
            System.out.print("Select an option: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    // Calls the addCurrency() method to add a currency to favorites
                    addCurrency();
                    break;
                case 2:
                    // Calls the viewCurrency() method to view favorite currencies
                    viewCurrency();
                    break;
                case 3:
                    // Calls the currencyConversion() method to perform currency conversion
                    currencyConversion();
                    break;
                case 4:
                    running = false;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option. Please choose a valid option.");
            }
        }
    }

    /**
     * Method to perform currency conversion based on user's choice.
     */
    public static void currencyConversion() {
        System.out.println("1 Ruppe");
        System.out.println("2 Dollar");
        System.out.println("3 Euro");

        Scanner sc = new Scanner(System.in);
        System.out.println("Choose the currency");
        int choice = sc.nextInt();
        System.out.println("Enter the amount");
        double amount = sc.nextDouble();

        switch (choice) {
            case 1:
                // Calls the rupeeToOther() method to convert Rupees to other currencies
                rupeeToOther(amount);
                break;
            case 2:
                // Calls the dollarToOther() method to convert Dollars to other currencies
                dollarToOther(amount);
                break;
            case 3:
                // Calls the euroToOther() method to convert Euros to other currencies
                euroToOther(amount);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }

    /**
     * Method to add a currency to the favorites list.
     */
    public static void addCurrency() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the currency");
        String choice = sc.next();
        Currency.add(choice);
        System.out.println(choice + " added to favorites.");
    }

    /**
     * Method to view favorite currencies.
     */
    public static void viewCurrency() {
        if (Currency.isEmpty()) {
            System.out.println("You haven't added any favorite currencies yet.");
        } else {
            System.out.println("Favorite currencies:");
            for (String currency : Currency) {
                System.out.println(currency);
            }
        }
    }

    /**
     * Method to convert Rupees to other currencies.
     */
    public static void rupeeToOther(double amt) {
        System.out.println("1 Ruppe = 0.013 Dollar");
        System.out.println();
        System.out.println(amt + " Ruppe = " + (amt * 0.013) + " Dollar");
        System.out.println();
        System.out.println("1 Ruppe = 0.012 Euro");
        System.out.println();
        System.out.println(amt + " Ruppe = " + (amt * 0.012) + " Euro");
        System.out.println();
    }

    /**
     * Method to convert Dollars to other currencies.
     */
    public static void dollarToOther(double amt) {
        System.out.println("1 Dollar = 79.37 Ruppe");
        System.out.println();
        System.out.println(amt + " Dollar = " + (amt * 79.37) + " Ruppe");
        System.out.println();
        System.out.println("1 Dollar = 0.98 Euro");
        System.out.println();
        System.out.println(amt + " Dollar = " + (amt * 0.98) + " Euro");
    }

    /**
     * Method to convert Euros to other currencies.
     */
    public static void euroToOther(double amt) {
        System.out.println("1 Euro = 80.85 Ruppe");
        System.out.println();
        System.out.println(amt + " Euro = " + (amt * 80.85) + "  Ruppe");
        System.out.println();
        System.out.println("1 Euro = 1.02 Dollar");
        
        System.out.println();
        System.out.println(amt + " Euro = " + (amt * 1.02) + "  Dollar");
    
    }
}
