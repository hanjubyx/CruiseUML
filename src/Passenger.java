import java.util.List;
import java.util.ArrayList;

public abstract class Passenger {
    protected String name;
    protected int passengerNumber;
    protected List<Activity> signedUpActivities;

    public Passenger(String name, int passengerNumber) {
        this.name = name;
        this.passengerNumber = passengerNumber;
        this.signedUpActivities = new ArrayList<>();
    }

    // abstract method to check if the passenger can sign up for an activity
    public abstract boolean canSignUp(Activity activity);

    // abstract method to deduct the cost of an activity from the passenger's balance
    public abstract void deductCost(double cost);

    // signs the passenger up for an activity at a specific destination, if possible
    public void signUpForActivity(Activity activity, Destination destination) {
        if (signedUpActivities.contains(activity)) {
            return; // Passenger is already signed up for this activity
        }

        if (!canSignUp(activity)) {
            System.out.println(name + " cannot sign up for " + activity.getName() + " due to insufficient balance.");
            return;
        }

        if (activity.availableSpaces() <= 0) {
            System.out.println(name + " cannot sign up for " + activity.getName() + " because it is full.");
            return;
        }

        activity.signUp(this);
        signedUpActivities.add(activity);
        deductCost(activity.getCost());
        System.out.println(name + " successfully signed up for " + activity.getName() + " at " + destination.getName());
    }

    // prints the details of the passenger, including their signed-up activities
    public void printDetails() {
        System.out.println("Passenger: " + name + ", Number: " + passengerNumber);
        System.out.println("Signed Up Activities:");
        for (Activity activity : signedUpActivities) {
            System.out.println("- " + activity.getName() + " (Cost: " + activity.getCost() + ")");
        }
    }
}