public class Payment {
    private String payerName;
    private double amount;
    private String description; 

    public Payment(String payerName, double amount, String description) {
        this.payerName = payerName;
        this.amount = amount;
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    public String getPayerName() {
        return payerName;
    }

    public String getDescription() {
        return description;
    }
}