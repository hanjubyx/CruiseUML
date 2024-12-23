public class WalkingTour extends Activity {
    private double distance;

    public WalkingTour(String name, String description, double cost, int capacity, double distance) {
        super(name, description, cost, capacity);
        this.distance = distance;
    }

    // prints the details of the walking tour, including distance and available spaces
    @Override
    public void printDetails() {
        System.out.println("Walking Tour: " + name + ", Cost: " + cost + ", Capacity: " + capacity +
                ", Distance: " + distance + " km, Available Spaces: " + availableSpaces());
    }
}