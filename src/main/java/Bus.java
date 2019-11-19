import java.util.ArrayList;

public class Bus {

    private ArrayList<Passenger> passngers;

    public Bus(){
        this.passngers = new ArrayList<Passenger>();
    }

    public int passengerCount() {
        return this.passngers.size();
    }
}
