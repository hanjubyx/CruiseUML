import java.util.ArrayList;
import java.util.List;

public class Destination {
    private String name;
    private List<Activity> activities;

    public Destination(String name) {
        this.name = name;
        this.activities = new ArrayList<>();
    }

    // returns the name of the destination
    public String getName() {
        return name;
    }

    // returns the list of activities available at the destination
    public List<Activity> getActivities() {
        return activities;
    }

    // adds an activity to the destination
    public void addActivity(Activity activity) {
        activities.add(activity);
    }

    // prints details of all activities at the destination
    public void printActivities() {
        for (Activity activity : activities) {
            activity.printDetails();
        }
    }

    // prints details of activities with available spaces
    public void printAvailableActivities() {
        for (Activity activity : activities) {
            if (activity.availableSpaces() > 0) {
                activity.printDetails();
            }
        }
    }
}