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

    public String getName() {
        return name;
    }

    public List<Destination> getItinerary() {
        return itinerary;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void addDestination(Destination destination) {
        itinerary.add(destination);
    }

    public void addPassenger(Passenger passenger) {
        if (passengers.size() < passengerCapacity) {
            passengers.add(passenger);
        } else {
            System.out.println("Cannot add passenger: Cruise is at full capacity.");
        }
    }

    public void printItinerary() {
        System.out.println("Cruise Ship: " + name);
        System.out.println("Itinerary:");
        for (Destination destination : itinerary) {
            System.out.println("- Destination: " + destination.getName());
            destination.printActivities();
        }
    }

    public void printPassengerList() {
        System.out.println("Cruise Ship: " + name);
        System.out.println("Passenger Capacity: " + passengerCapacity);
        System.out.println("Passengers on board:");
        for (Passenger passenger : passengers) {
            passenger.printDetails();
        }
    }

    public void printAvailableActivities() {
        System.out.println("Available Activities on " + name + ":");
        for (Destination destination : itinerary) {
            System.out.println("- Destination: " + destination.getName());
            destination.printAvailableActivities();
        }
    }
}