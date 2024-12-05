import java.util.ArrayList;
import java.util.List;

public abstract class Activity {
    protected String name;
    protected String description;
    protected double cost;
    protected int capacity;
    protected List<Passenger> participants;

    public Activity(String name, String description, double cost, int capacity) {
        this.name = name;
        this.description = description;
        this.cost = cost;
        this.capacity = capacity;
        this.participants = new ArrayList<>();
    }

    // signs up a passenger for the activity if space is available
    public boolean signUp(Passenger passenger) {
        if (participants.size() < capacity) {
            participants.add(passenger);
            return true;
        }
        return false;
    }

    // returns the number of available spaces for the activity
    public int availableSpaces() {
        return capacity - participants.size();
    }

    // returns the name of the activity
    public String getName() {
        return name;
    }

    // returns the cost of the activity
    public double getCost() {
        return cost;
    }

    // abstract method to print the details of the activity (implemented in subclasses)
    public abstract void printDetails();
}