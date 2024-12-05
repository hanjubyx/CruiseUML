import java.util.ArrayList;
import java.util.List;

public class TheatreShow extends Activity {
    private List<Star> stars;

    public TheatreShow(String name, String description, double cost, int capacity) {
        super(name, description, cost, capacity);
        this.stars = new ArrayList<>();
    }

    public void addStar(Star star) {
        stars.add(star);
    }

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