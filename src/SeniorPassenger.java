public class SeniorPassenger extends Passenger {
    private double balance;

    public SeniorPassenger(String name, int passengerNumber, double balance) {
        super(name, passengerNumber);
        this.balance = balance;
    }

    // checks if the senior passenger can afford the activity (with a 10% discount)
    @Override
    public boolean canSignUp(Activity activity) {
        return balance >= (activity.getCost() * 0.9);
    }

    // deducts the cost of the activity (with a 10% discount) from the passenger's balance
    @Override
    public void deductCost(double cost) {
        balance -= cost * 0.9;
    }

    // prints the details of the senior passenger, including their current balance
    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Balance: " + balance);
    }
}