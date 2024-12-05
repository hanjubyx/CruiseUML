public class PremiumPassenger extends Passenger {
    public PremiumPassenger(String name, int passengerNumber) {
        super(name, passengerNumber);
    }

    @Override
    public boolean canSignUp(Activity activity) {
        return true; // Premium passengers can always sign up
    }

    @Override
    public void deductCost(double cost) {
        // Premium passengers do not pay for activities
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Premium Passenger (No Balance Required)");
    }
}