import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserManager userManager = new UserManager();

        userManager.registerUser("shreya", "sh@123", "shreya03@gmail.com");
        userManager.registerUser("yash", "ya*2004", "yash04@gmail.com");

        Scanner scanner = new Scanner(System.in);

        System.out.println(">>>>>>>>>>>>>>>> Welcome to TripMate your travel expense tracker! <<<<<<<<<<<<<<<<<");
        System.out.println("Do you have an account? (yes/no)");
        String choice = scanner.nextLine();

        
        if (choice.equalsIgnoreCase("no")) {
            System.out.println("Enter a new username:");
            String newUsername = scanner.nextLine();
            System.out.println("Enter a new password:");
            String newPassword = scanner.nextLine();
            System.out.println("Enter your email:");
            String newEmail = scanner.nextLine();

            boolean registrationSuccess = userManager.registerUser(newUsername, newPassword, newEmail);

            if (registrationSuccess) {
                System.out.println("Registration successful!");
                if (userManager.authenticateUser(newUsername, newPassword)) {
                    System.out.println("Login successful!");
                    proceedWithTrip(scanner);
                } else {
                    System.out.println("Login failed after registration.");
                }
            } else {
                System.out.println("Username already exists. Please try a different one.");
            }

        } else if (choice.equalsIgnoreCase("yes")) {
            System.out.println("Enter username:");
            String username = scanner.nextLine();
            System.out.println("Enter password:");
            String password = scanner.nextLine();

            if (userManager.authenticateUser(username, password)) {
                System.out.println("Login successful!");
                proceedWithTrip(scanner);
            } else {
                System.out.println("Login failed. Please try again.");
            }
        } else {
            System.out.println("Invalid choice.");
        }

        scanner.close();
    }

    public static void proceedWithTrip(Scanner scanner) {
        System.out.println("Enter destination city:");
        String city = scanner.nextLine();
        System.out.println("Enter destination country:");
        String country = scanner.nextLine();
        Destination destination = new Destination(city, country);

        System.out.println("Enter total budget for the trip:");
        double totalBudget = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter flight budget:");
        double flightBudget = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter accommodation budget:");
        double accommodationBudget = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter meals budget:");
        double mealsBudget = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter transportation budget:");
        double transportationBudget = Double.parseDouble(scanner.nextLine());

        Budget budget = new Budget(totalBudget, flightBudget, accommodationBudget, mealsBudget, transportationBudget);

        Trip trip = new Trip("My Trip", destination, budget);

        System.out.println("Enter expense category (flight, accommodation, meal, transportation):");
        String category = scanner.nextLine();
        System.out.println("Enter expense amount:");
        double amount = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter expense description:");
        String description = scanner.nextLine();
        trip.addExpense(new Expense(category, amount, new Date(), description));

        trip.printSummary();
        trip.compareBudget();
    }
}
