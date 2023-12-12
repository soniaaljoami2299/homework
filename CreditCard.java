public class CreditCard {
    private String cardholderName;
    private String cardNumber;
    private String expirationDate;
    private double balance;
    private double penaltyAmount;

    public CreditCard(String cardholderName, String cardNumber, String expirationDate) {
        this.cardholderName = cardholderName;
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
        this.balance = 0.0;
        this.penaltyAmount = 5.0;
    }

    public String getCardholderName() {
        return cardholderName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public double getBalance() {
        return balance;
    }


    public boolean charge(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        } else if (amount > balance) {
            balance -= penaltyAmount;
            return false;
        }
        return false;
    }

    public void makePayment(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
}