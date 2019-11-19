import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {
    private Bus bus;
    private Passenger passenger;


    @Before
    public void before(){
        this.bus = new Bus();
        this.passenger = new Passenger();
    }

    @Test
    public void busStartsEmpty(){
        assertEquals(0, bus.passengerCount());
    }
}
