import java.util.ArrayList;
import java.util.List;

public class CruiseShip {
    private String name;
    private int passengerCapacity;
    private List<Destination> itinerary;
    private List<Passenger> passengers;

    public CruiseShip(String name, int passengerCapacity) {
        this.name = name;
        this.passengerCapacity = passengerCapacity;
        this.itinerary = new ArrayList<>();
        this.passengers = new ArrayList<>();
    }

    // returns the name of the cruise ship
    public String getName() {
        return name;
    }

    // returns the list of destinations in the itinerary
    public List<Destination> getItinerary() {
        return itinerary;
    }

    // returns the list of passengers on the cruise ship
    public List<Passenger> getPassengers() {
        return passengers;
    }

    // adds a destination to the cruise itinerary
    public void addDestination(Destination destination) {
        itinerary.add(destination);
    }

    // adds a passenger to the cruise if capacity allows
    public void addPassenger(Passenger passenger) {
        if (passengers.size() < passengerCapacity) {
            passengers.add(passenger);
        } else {
            System.out.println("Cannot add passenger: Cruise is at full capacity.");
        }
    }

    // prints the cruise itinerary along with activities at each destination
    public void printItinerary() {
        System.out.println("Cruise Ship: " + name);
        System.out.println("Itinerary:");
        for (Destination destination : itinerary) {
            System.out.println("- Destination: " + destination.getName());
            destination.printActivities();
        }
    }

    // prints the list of passengers on the cruise
    public void printPassengerList() {
        System.out.println("Cruise Ship: " + name);
        System.out.println("Passenger Capacity: " + passengerCapacity);
        System.out.println("Passengers on board:");
        for (Passenger passenger : passengers) {
            passenger.printDetails();
        }
    }

    // prints all available activities across the cruise's itinerary
    public void printAvailableActivities() {
        System.out.println("Available Activities on " + name + ":");
        for (Destination destination : itinerary) {
            System.out.println("- Destination: " + destination.getName());
            destination.printAvailableActivities();
        }
    }
}