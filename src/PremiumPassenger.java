public class PremiumPassenger extends Passenger {
    public PremiumPassenger(String name, int passengerNumber) {
        super(name, passengerNumber);
    }

    // returns true since premium passengers can sign up for any activity without restrictions
    @Override
    public boolean canSignUp(Activity activity) {
        return true;
    }

    // premium passengers do not pay for activities, so this method is empty
    @Override
    public void deductCost(double cost) {}

    // prints the details of the premium passenger
    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Premium Passenger (No Balance Required)");
    }
}