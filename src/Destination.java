import java.util.ArrayList;
import java.util.List;

public class Destination {
    private String name;
    private List<Activity> activities;

    public Destination(String name) {
        this.name = name;
        this.activities = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Activity> getActivities() {
        return activities;
    }

    public void addActivity(Activity activity) {
        activities.add(activity);
    }

    public void printActivities() {
        for (Activity activity : activities) {
            activity.printDetails();
        }
    }

    public void printAvailableActivities() {
        for (Activity activity : activities) {
            if (activity.availableSpaces() > 0) {
                activity.printDetails();
            }
        }
    }
}