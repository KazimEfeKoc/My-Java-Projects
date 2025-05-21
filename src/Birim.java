public class Birim {
    private currency currency;
    private double amount;

    public Birim(currency currency, double amount){
        this.currency = currency;
        this.amount = amount;
    }

    public Birim() {

    }
    
    public currency getCurrency() {
        return currency;
    }

    public void setCurrency(currency currency) {
        this.currency = currency;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
