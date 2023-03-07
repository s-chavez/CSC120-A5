import java.util.ArrayList;

public class Car {
  private ArrayList < Passenger > passengersOnBoard;
  private int carMaxCapacity;

  /**
   * 'Car' Constructor which takes in an initial value for the `Car`s max capacity and initializes `ArrayList`
   * @param carMaxCapacity The 'Car's maximum capacity
   */
  public Car(int carMaxCapacity) {
    this.carMaxCapacity = carMaxCapacity;
    this.passengersOnBoard = new ArrayList < Passenger > ();
  }
  /**
   * Obtain the maximum capacity of the 'Car'
   * @return The 'Car's maximum capacity
   */
  public int getCapacity() {
    return this.carMaxCapacity;
  }
  /**
   * Calculates the number of seats remaining in the 'Car'
   * @return The 'Car's number of seats remaining 
   */
  public int seatsRemaining() {
    return this.carMaxCapacity - passengersOnBoard.size();
  }
  /**
   * Adds 'Passenger' to 'Car'; checks if there are seats available or if the 'Passenger' is already on board
   * @param p The 'Passenger' p
   */
  public void addPassenger(Passenger p) {
    if (seatsRemaining() > 0) {
      if (!this.passengersOnBoard.contains(p)) {
        passengersOnBoard.add(p);
        System.out.println("Passenger " + p.getName() + " has been added.");
      } else {
        throw new RuntimeException("Passenger " + p.getName() + " is already on board.");
      }
    } else {
      throw new RuntimeException("There are no seats available.");
    }
  }
  /**
   * Removes 'Passenger' from 'Car' and checks if the 'Passenger' is on board
   * @param p The 'Passenger' p
   */
  public void removePassenger(Passenger p) {
    if (this.passengersOnBoard.contains(p)) {
      passengersOnBoard.remove(p);
      System.out.println("Passenger " + p.getName() + " has been successfully removed from the car.");
    } else {
      throw new RuntimeException("Passenger " + p.getName() + " is not on board.");
    }
  }
  /**
   * Prints a list of all 'Passenger's aboard the 'Car' or "This car is EMPTY." if no one is on board
   */
  public void printManifest() {
    if (passengersOnBoard.size() > 0) {
      for (int i = 0; i < passengersOnBoard.size(); i++) {
        System.out.println(passengersOnBoard.get(i).getName());
      }
    } else {
      throw new RuntimeException("This car is EMPTY.");
    }
  }
  /**
   * Demonstrates use of methods in 'Car' class
   * @param args The command line arguments 
   */
  public static void main(String[] args) {
    Car myCar = new Car(10);
    Passenger Jerry = new Passenger("Jerry");
    Passenger Tom = new Passenger("Tom");
    myCar.addPassenger(Jerry);
    myCar.addPassenger(Tom);
    myCar.printManifest();
  }
}