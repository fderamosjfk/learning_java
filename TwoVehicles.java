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
        Vehicle minivan = new Vehicle(7, 16, 21);
        Vehicle sportscar = new Vehicle(2, 14, 12);
        
        System.out.println("Minivan can carry " + minivan.passengers + " passengers with a range of " + 
                           minivan.range() + " miles.");
        System.out.println("Sportscar can carry " + sportscar.passengers + " with a range of " + 
                           sportscar.range() + " miles.");
    }
}
