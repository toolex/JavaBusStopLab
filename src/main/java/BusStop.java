import java.util.ArrayList;

public class BusStop {

    private String name;
    private ArrayList<Passenger> queue;

    public BusStop(){
        this.name = "Castle Street";
        this.queue = new ArrayList<Passenger>();
    }

    public int passengerCount() {
        return this.queue.size();
    }

    public void addPassenger(Passenger person) {
        this.queue.add(person);
    }

    public Passenger removePassenger() {
        return this.queue.remove(0);
    }
}
