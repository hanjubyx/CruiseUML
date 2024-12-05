public class StandardPassenger extends Passenger {
    private double balance;

    public StandardPassenger(String name, int passengerNumber, double balance) {
        super(name, passengerNumber);
        this.balance = balance;
    }

    // checks if the standard passenger can afford the activity
    @Override
    public boolean canSignUp(Activity activity) {
        return balance >= activity.getCost();
    }

    // deducts the full cost of the activity from the passenger's balance
    @Override
    public void deductCost(double cost) {
        balance -= cost;
    }

    // prints the details of the standard passenger, including their current balance
    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Balance: " + balance);
    }
}