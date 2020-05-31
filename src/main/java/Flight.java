public class Flight {

    private String destination;
    private String departure;
    private String departureTime;
    private String flightNumber;

    public Flight(String destination, String departure, String departureTime, String flightNumber){
        this.destination = destination;
        this.departure = departure;
        this.departureTime = departureTime;
        this.flightNumber = flightNumber;
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

}
