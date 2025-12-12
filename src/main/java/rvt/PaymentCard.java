public class PaymentCard {
    private double balance;

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }

    public String toString() {
        return "This card balance is " + this.balance + " euros";
    }

    public void eatAffordably() {
        this.balance -= 2.60;
    }

    public void eatHeartily() {
        while (this.balance - 4.6 >= 0) {
            this.balance -= 4.60;
            break;
        }
    }

    public void addMoney(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
        if (this.balance > 150) {
            this.balance = 150;
        }
    }

}