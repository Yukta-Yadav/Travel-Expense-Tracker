public class Budget {
    private double totalBudget;
    private double flightBudget;
    private double accommodationBudget;
    private double mealsBudget;
    private double transportationBudget;

    public Budget(double totalBudget, double flightBudget, double accommodationBudget,
                  double mealsBudget, double transportationBudget) {
        this.totalBudget = totalBudget;
        this.flightBudget = flightBudget;
        this.accommodationBudget = accommodationBudget;
        this.mealsBudget = mealsBudget;
        this.transportationBudget = transportationBudget;
    }

    public double getTotalBudget() {
        return totalBudget;
    }

    public double getFlightBudget() {
        return flightBudget;
    }

    public double getAccommodationBudget() {
        return accommodationBudget;
    }

    public double getMealsBudget() {
        return mealsBudget;
    }

    public double getTransportationBudget() {
        return transportationBudget;
    }
}