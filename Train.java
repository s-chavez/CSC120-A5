import java.util.ArrayList;

public class Train {
  private final Engine engine;
  private ArrayList < Car > cars;
  /**
   * Constructor for 'Train' that takes in initial values for attributes and sets them appropriately
   * @param fuelType The type of fuel
   * @param fuelCapacity The capacity of the fuel
   * @param nCars The number of cars in the train
   * @param passengerCapacity The train's passenger capacity 
   */
  public Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity) {
    this.engine = new Engine(fuelType, fuelCapacity);
    this.cars = new ArrayList < Car > (nCars);
    for (int i = 0; i < nCars; i++) {
      Car car = new Car(passengerCapacity);
      cars.add(car);
    }
  }
  /**
   * Accesses the engine of the 'Train' 
   * @return The engine of the 'Train'
   */
  public Engine getEngine() {
    return this.engine;
  }
  /**
   * Finds a specific car of the 'Train' at a given index
   * @param i The index
   * @return The `i`th car
   */
  public Car getCar(int i) {
    return this.cars.get(i);
  }
  /**
   * Finds the train's maximum capacity
   * @return The maximum capacity across all 'Car's
   */
  public int MaxCapacity() {
    int totalCapacity = 0;
    for (int i = 0; i < cars.size(); i++) {
      totalCapacity += cars.get(i).getCapacity();
    }
    return totalCapacity;
  }
  /**
   * Calculates the total number of remaining seats in the Train
   * @return The number of seats remaining across all 'Car's
   */
  public int SeatsRemaining() {
    int totalSeatsRemaining = 0;
    for (int i = 0; i < cars.size(); i++) {
      totalSeatsRemaining += cars.get(i).seatsRemaining();
    }
    return totalSeatsRemaining;
  }
  /**
   * Prints a roster of all 'Passenger's onboard
   */
  public void printManifest() {
    for (int i = 0; i < cars.size(); i++) {
      cars.get(i).printManifest();
    }
  }
  /**
   * Demonstrates the methods in the 'Train' class
   * @param args The command line arguments
   */
  public static void main(String[] args) {
    Train train = new Train(FuelType.STEAM, 100, 3, 18);
    Car myCar = new Car(10);
    Car car1 = new Car(5);
    Car car2 = new Car(3);
    Passenger Jerry = new Passenger("Jerry");
    Passenger Tom = new Passenger("Tom");
    Passenger Carly = new Passenger("Carly");
    Passenger Pitbull = new Passenger("Pitbull");
    car1.addPassenger(Jerry);
    car2.addPassenger(Tom);
    myCar.addPassenger(Pitbull);
    myCar.addPassenger(Carly);
    myCar.printManifest();
    car1.printManifest();
    car2.printManifest();
    System.out.println(train);
  }
}