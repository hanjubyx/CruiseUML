import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        CruiseShip orientalOdyssey = new CruiseShip("Oriental Odyssey", 100);
        addOrientalOdysseyItinerary(orientalOdyssey);

        List<Passenger> passengerBank = createPassengerBank(10);
        assignPassengersToCruise(orientalOdyssey, passengerBank, 5);

        for (Destination destination : orientalOdyssey.getItinerary()) {
            System.out.println("\n--- Activities at " + destination.getName() + " ---");
            for (Activity activity : destination.getActivities()) {
                System.out.println("Activity: " + activity.getName());
                System.out.println("Participants:");
                for (Passenger passenger : orientalOdyssey.getPassengers()) {
                    passenger.signUpForActivity(activity, destination);
                }
            }
        }

        orientalOdyssey.printItinerary();
        orientalOdyssey.printPassengerList();
    }

    // adds a predefined itinerary to the specified cruise ship
    public static void addOrientalOdysseyItinerary(CruiseShip cruise) {
        cruise.addDestination(createHomePort());
        cruise.addDestination(createDestination("Taipei (Keelung)", "Taipei 101", "Shilin Night Market", "National Palace Museum"));
        cruise.addDestination(createDestination("Okinawa", "Shurijo Castle", "Kokusai Street", "Okinawa Churaumi Aquarium"));
        cruise.addDestination(createDestination("Nagasaki", "Peace Park", "Glover Garden", "Huis Ten Bosch"));
        cruise.addDestination(createDestination("Jeju", "Hallasan National Park", "Jeju Folk Village", "Seongsan Ilchulbong"));
        cruise.addDestination(createDestination("Shanghai", "The Bund", "Yu Garden", "Shanghai Tower"));
        cruise.addDestination(createHomePort());
    }

    // creates and returns the home port destination
    public static Destination createHomePort() {
        return new Destination("Hong Kong");
    }

    // creates and returns a destination with a given name and three activities
    public static Destination createDestination(String name, String stop1, String stop2, String stop3) {
        Destination destination = new Destination(name);
        destination.addActivity(new WalkingTour(name + " Walking Tour", "Explore " + name + " including " + stop1 + ", " + stop2 + ", and " + stop3, 50.0, 15, 5.0));
        destination.addActivity(new TheatreShow(name + " Cultural Show", "Experience the rich traditions and performances of " + name, 80.0, 20));
        return destination;
    }

    // creates and returns a list of passengers with random types and attributes
    public static List<Passenger> createPassengerBank(int count) {
        List<Passenger> passengerBank = new ArrayList<>();
        String[] firstNames = {"Alice", "Bob", "Charlie", "Diana", "Evelyn"};
        String[] lastNames = {"Smith", "Johnson", "Williams", "Brown", "Jones"};
        Random random = new Random();

        for (int i = 0; i < count; i++) {
            String firstName = firstNames[random.nextInt(firstNames.length)];
            String lastName = lastNames[random.nextInt(lastNames.length)];
            int type = random.nextInt(3);
            Passenger passenger;
            if (type == 0) {
                passenger = new StandardPassenger(firstName + " " + lastName, i + 1, 100 + random.nextInt(100));
            } else if (type == 1) {
                passenger = new SeniorPassenger(firstName + " " + lastName, i + 1, 100 + random.nextInt(100));
            } else {
                passenger = new PremiumPassenger(firstName + " " + lastName, i + 1);
            }
            passengerBank.add(passenger);
        }
        return passengerBank;
    }

    // randomly assigns a specified number of passengers from the bank to the cruise
    public static void assignPassengersToCruise(CruiseShip cruise, List<Passenger> passengerBank, int count) {
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            cruise.addPassenger(passengerBank.get(random.nextInt(passengerBank.size())));
        }
    }
}