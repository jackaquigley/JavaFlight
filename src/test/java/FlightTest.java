import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Passenger passenger;

    @Before
    public void setUp(){
        flight = new Flight("GLA", "LHR", "23:45", "FR756", ModelType.BOEING747);
        passenger = new Passenger("Jack", 2);
    }

    @Test
    public void flightHasDestination(){
        assertEquals("GLA", flight.getDestination());
    }

    @Test
    public void flightHasDeparture(){
        assertEquals("LHR", flight.getDeparture());
    }

    @Test
    public void flightHasDepartureTime(){
        assertEquals("23:45", flight.getDepartureTime());
    }

    @Test
    public void flightHasFlightNumber(){
        assertEquals("FR756", flight.getFlightNumber());
    }

    @Test
    public void flightHasModel(){
        assertEquals(ModelType.BOEING747, flight.getModel());
    }

    @Test
    public void flightHasEmptyPassengers(){
        assertEquals(0, flight.getNumberOfPassengers());
    }

    @Test
    public void flightCanAddPassengers(){
        flight.addPassenger(passenger);
        assertEquals(1, flight.getNumberOfPassengers());
    }
}
