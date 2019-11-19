import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {
    private BusStop busStop;
    private Passenger person;

    @Before
    public void before(){
        busStop = new BusStop();
        person = new Passenger();
    }

    @Test
    public void queueStartsEmpty(){
        assertEquals(0, busStop.passengerCount());
    }

    @Test
    public void canAddPassenger(){
        busStop.addPassenger(person);
        assertEquals(1, busStop.passengerCount());
    }

    @Test
    public void canRemovePassenger(){
        busStop.addPassenger(person);
        Passenger pickUp = busStop.removePassenger();
        assertEquals(0, busStop.passengerCount());
        assertEquals(person, pickUp);
    }
}
