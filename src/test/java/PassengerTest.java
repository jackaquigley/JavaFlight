import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void setUp(){
        passenger = new Passenger("Jet", 2);
    }

    @Test
    public void passengerHasName(){
        assertEquals("Jet", passenger.getName());
    }

    @Test
    public void passengerHasBags(){
        assertEquals(2, passenger.getNumberOfBags());
    }

}
