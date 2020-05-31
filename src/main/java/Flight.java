import java.util.ArrayList;

public class Flight {

    private ModelType model;
    private String destination;
    private String departure;
    private String departureTime;
    private String flightNumber;
    private ArrayList<Passenger> passengers;

    public Flight(String destination, String departure, String departureTime, String flightNumber, ModelType model){
        this.destination = destination;
        this.departure = departure;
        this.departureTime = departureTime;
        this.flightNumber = flightNumber;
        this.model = model;
        this.passengers = new ArrayList<Passenger>();
    }

    public String getDestination(){
        return this.destination;
    }

    public String getDeparture(){
        return this.departure;
    }

    public String getDepartureTime(){
        return this.departureTime;
    }

    public String getFlightNumber(){
        return this.flightNumber;
    }

    public ModelType getModel(){
        return model;
    }

    public int getNumberOfPassengers(){
        return this.passengers.size();
    }

    public void addPassenger(Passenger passenger){
        if ( this.passengers.size() < this.model.capacity) {
        this.passengers.add(passenger);}
    }

    public int getNumberOfEmptySeats(){
        return this.model.capacity - this.passengers.size();
    }

}
