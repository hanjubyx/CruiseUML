import java.util.ArrayList;
import java.util.List;

public class TheatreShow extends Activity {
    private List<Star> stars;

    // constructor to initialize a theatre show with its name, description, cost, and capacity
    public TheatreShow(String name, String description, double cost, int capacity) {
        super(name, description, cost, capacity);
        this.stars = new ArrayList<>();
    }

    // adds a star to the list of stars performing in the theatre show
    public void addStar(Star star) {
        stars.add(star);
    }

    // prints the details of the theatre show, including its stars and available spaces
    @Override
    public void printDetails() {
        System.out.println("Theatre Show: " + name + ", Cost: " + cost + ", Capacity: " + capacity +
                ", Available Spaces: " + availableSpaces());
        System.out.println("Stars:");
        for (Star star : stars) {
            System.out.println("  - " + star.getName() + " as " + star.getCharacter());
        }
    }
}