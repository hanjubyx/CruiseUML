public class StandardPassenger extends Passenger {
    private double balance;

    public StandardPassenger(String name, int passengerNumber, double balance) {
        super(name, passengerNumber);
        this.balance = balance;
    }

    @Override
    public boolean canSignUp(Activity activity) {
        return balance >= activity.getCost();
    }

    @Override
    public void deductCost(double cost) {
        balance -= cost;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Balance: " + balance);
    }
}