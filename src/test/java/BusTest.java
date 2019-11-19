import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {
    private Bus bus;
    private Passenger passenger;
    private BusStop busStop;


    @Before
    public void before(){
        this.bus = new Bus();
        this.passenger = new Passenger();
        this.busStop = new BusStop();
    }

    @Test
    public void busStartsEmpty(){
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void canAddPassengers(){
        bus.addPassenger(passenger);
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void canRemovePassengers(){
        bus.addPassenger(passenger);
        Passenger removedPassenger = bus.removePassenger();
        assertEquals(0, bus.passengerCount());
        assertEquals(passenger, removedPassenger);
    }

    @Test
    public void canPickUp(){
        busStop.addPassenger(passenger);

        Passenger removedPassenger = busStop.removePassenger();

        bus.addPassenger(removedPassenger);
        assertEquals(1, bus.passengerCount());
        assertEquals(0, busStop.passengerCount());
    }

}
