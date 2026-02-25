package Module3;

public class Bank {

    private String acc;
    private double bal;

    public Bank(String a, double b) {
        acc = a;
        bal = b;
    }

    public void deposit(double amt) {
        bal += amt;
    }

    public void withdraw(double amt) {
        if (amt <= bal)
            bal -= amt;
    }

    public double getBal() {
        return bal;
    }

    public static void main(String[] args) {
        Bank b = new Bank("101", 1000);
        b.deposit(500);
        b.withdraw(200);
        System.out.println("Balance: " + b.getBal());
    }
}
