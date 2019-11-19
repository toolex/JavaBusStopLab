import java.util.ArrayList;

public class Bus {

    private ArrayList<Passenger> passengers;
    private String destination;

    public Bus(){
        this.passengers = new ArrayList<Passenger>();
    }

    public int passengerCount() {
        return this.passengers.size();
    }

    public void addPassenger(Passenger passenger) {
        Integer capacity = 20;
        if (this.passengerCount() <= capacity){
            this.passengers.add(passenger);
        }
    }


    public Passenger removePassenger() {
        return this.passengers.remove(0);
    }
}
