public class SeniorPassenger extends Passenger {
    private double balance;

    public SeniorPassenger(String name, int passengerNumber, double balance) {
        super(name, passengerNumber);
        this.balance = balance;
    }

    @Override
    public boolean canSignUp(Activity activity) {
        return balance >= (activity.getCost() * 0.9); // Seniors get a 10% discount
    }

    @Override
    public void deductCost(double cost) {
        balance -= cost * 0.9;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Balance: " + balance);
    }
}