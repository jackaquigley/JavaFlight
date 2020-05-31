import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;

    @Before
    public void setUp(){
        flight = new Flight("GLA", "LHR", "23:45");
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
}
