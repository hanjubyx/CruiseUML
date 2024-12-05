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

    public boolean signUp(Passenger passenger) {
        if (participants.size() < capacity) {
            participants.add(passenger);
            return true;
        }
        return false;
    }

    public int availableSpaces() {
        return capacity - participants.size();
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public abstract void printDetails();
}