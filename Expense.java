import java.util.Date;

public class Expense {
    private String category; 
    private double amount;
    private Date date;
    private String description;

    public Expense(String category, double amount, Date date, String description) {
        this.category = category;
        this.amount = amount;
        this.date = date;
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    public String getCategory() {
        return category;
    }

    public Date getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }
}