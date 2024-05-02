import java.util.ArrayList;

public class Coop {
    private String coopName;
    private ArrayList<Chicken> myChickens;
    private ArrayList<Device> devices;
    private double waterLevel;
    private double foodLevel;

    public Coop(String name) {
        this.coopName = name;
        this.waterLevel = 0;
        this.foodLevel = 0;

    }
    
}
