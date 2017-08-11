/**
 * Illustrates creation of class called Vehicle.
 */

class Vehicle {
    int passengers; // number of passengeers
    int fuelcap; // fuel capacity in gallons
    int mpg; // fuel consumption in mile per gallon
    
    public Vehicle(int passengers, int fuelcap, int mpg) {
        this.passengers = passengers;
        this.fuelcap = fuelcap;
        this.mpg = mpg;
    }
    
    // Display the range.
    int range() {
        return fuelcap * mpg;
    }
}

// This class declares an object of type Vehicle.
public class TwoVehicles {
    public static void main(String[] args) {
        Vehicle minivan1 = new Vehicle(7, 16, 21);
        Vehicle sportscar1 = new Vehicle(2, 14, 12);
        
        System.out.println("Minivan can carry " + minivan1.passengers + " passengers with a range of " + 
                           minivan1.range() + " miles.");
        System.out.println("Sportscar can carry " + sportscar1.passengers + " with a range of " + 
                           sportscar1.range() + " miles.");
    }
}
