public class Flight {

    private String destination;
    private String departure;
    private String departureTime;

    public Flight(String destination, String departure, String departureTime){
        this.destination = destination;
        this.departure = departure;
        this.departureTime = departureTime;
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

}
