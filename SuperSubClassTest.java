/**
 * Illustration on super and subclass.
 */

class Bicycle {
        
    // the Bicycle class has
    // three fields
    public int cadence;
    public int gear;
    public int speed;
        
    // the Bicycle class has
    // one constructor
    public Bicycle(int startCadence, int startSpeed, int startGear) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }
        
    // the Bicycle class has
    // four methods
    public void setCadence(int newValue) {
        cadence = newValue;
    }
        
    public void setGear(int newValue) {
        gear = newValue;
    }
        
    public void applyBrake(int decrement) {
        speed -= decrement;
    }
        
    public void speedUp(int increment) {
        speed += increment;
    }
        
}

class MountainBike extends Bicycle {
        
    // the MountainBike subclass has
    // one field
    public int seatHeight;

    // the MountainBike subclass has
    // one constructor
    public MountainBike(int startHeight, int startCadence,
                        int startSpeed, int startGear) {
        super(startCadence, startSpeed, startGear);
        seatHeight = startHeight;
    }   
        
    // the MountainBike subclass has
    // one method
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }   

}

public class SuperSubClassTest {
    public static void main(String[] args) {
        Bicycle bike1 = new Bicycle(5, 5, 5);  
        MountainBike mountainBike1 = new MountainBike(30, 6, 6, 6);
        System.out.println(String.format("Bike1: cadence = %d, gear = %d, speed = %d", 
                                         bike1.cadence, bike1.gear, bike1.speed));
        System.out.println(String.format("MountainBike1: cadence = %d, gear = %d, speed = %d, seatHeight = %d",
                                         mountainBike1.cadence, mountainBike1.gear, mountainBike1.speed,
                                         mountainBike1.seatHeight));
    }
}
