class Bicycle {
        
    private int cadence;
    private int gear;
    private int speed;
        
    private int id;
    
    private static int numberOfBicycles = 0;

        
    public Bicycle(int startCadence,
                   int startSpeed,
                   int startGear) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;

        id = ++numberOfBicycles;
    }

    public int getID() {
        return id;
    }

    public static int getNumberOfBicycles() {
        return numberOfBicycles;
    }

    public int getCadence() {
        return cadence;
    }
        
    public void setCadence(int newValue) {
        cadence = newValue;
    }
        
    public int getGear(){
        return gear;
    }
        
    public void setGear(int newValue) {
        gear = newValue;
    }
        
    public int getSpeed() {
        return speed;
    }

    public void applyBrake(int decrement) {
        speed -= decrement;
    }
        
    public void speedUp(int increment) {
        speed += increment;
    }
}

public class BicycleClassAllInstanceVariablesPrivateTest {
    public static void main(String[] args) {
        Bicycle bicycle1 = new Bicycle(5, 6, 7);
        Bicycle bicycle2 = new Bicycle(15, 16, 17);
        Bicycle bicycle3 = new Bicycle(25, 26, 27);
        System.out.printf("bicycle1 id: %d\nbicycle2 id: %d\nbicycle3 id: %d\n",
                          bicycle1.getID(), bicycle2.getID(), bicycle3.getID());
    }
}
