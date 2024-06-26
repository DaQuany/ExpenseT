public class wallet {

    private String date;
    private String description;
    private double amount;

    public wallet(String date, String description, double amount) {
        this.date = date;
        this.description = description;
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return date + " / " + description + " / " + amount;
    }
}
