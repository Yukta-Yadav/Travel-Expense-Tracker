import java.util.ArrayList;

public class Trip {
    private String tripName;
    private Destination destination;
    private ArrayList<Expense> expenses;
    private Budget budget;
    private ArrayList<Payment> payments;

    public Trip(String tripName, Destination destination, Budget budget) {
        this.tripName = tripName;
        this.destination = destination;
        this.budget = budget;
        this.expenses = new ArrayList<>();
        this.payments = new ArrayList<>();
    }

    public void addExpense(Expense expense) {
        expenses.add(expense);
    }

    public void addPayment(Payment payment) {
        payments.add(payment);
    }

    public double getTotalExpenses() {
        double total = 0;
        for (Expense expense : expenses) {
            total += expense.getAmount();
        }
        return total;
    }

    public void printSummary() {
        System.out.println("Trip: " + tripName);
        System.out.println("Destination: " + destination.getCity() + ", " + destination.getCountry());
        System.out.println("Total Expenses: " + getTotalExpenses());
        System.out.println("Budget: " + budget.getTotalBudget());
        System.out.println("Remaining Budget: " + (budget.getTotalBudget() - getTotalExpenses()));
    }

    public void compareBudget() {
        if (getTotalExpenses() > budget.getTotalBudget()) {
            System.out.println("You have exceeded the budget!");
        } else {
            System.out.println("You are within your budget.");
        }
    }
}