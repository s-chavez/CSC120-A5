public class Engine {
    private FuelType fuelType;
    double currentFuelLevel;
    double maxFuelLevel;
    /**
     * Constructor for engine that takes in initial values for attributes and sets them appropriately
     * @param fuelType The engine's fuel type
     * @param fuel The engine's fuel level
     */
    public Engine(FuelType fuelType, double fuel) {
      this.fuelType = fuelType;
      this.currentFuelLevel = fuel;
      this.maxFuelLevel = fuel;
    }
    /**
     * Accessor for engine's fuel type
     * @return The engine's fuel type
     */
    public FuelType getFuelType() {
      return this.fuelType;
    }
    /**
     * Refuels engine by setting the engine's current fuel to the maximum fuel level
     */
    public void refuel() {
      this.currentFuelLevel = this.maxFuelLevel;
    }
    /**
     * Decreases current fuel level and prints remaining fuel level provided fuel level is above 0; otherwise, throws RunTimeException
     */
    public void go() {
      if (this.currentFuelLevel > 0) {
        this.currentFuelLevel = currentFuelLevel - 10;
        System.out.println("The remaining fuel level is " + this.currentFuelLevel);
      } else {
        throw new RuntimeException("Please refuel.");
      }
    }
    /**
     * Demonstrates use of methods within Engine class
     * @param args The command line arguments
     */
    public static void main(String[] args) {
      Engine myEngine = new Engine(FuelType.ELECTRIC, 100.0);
      myEngine.go();
      myEngine.refuel();
      System.out.println(myEngine.currentFuelLevel);
      try {
        while (true) {
          myEngine.go();
        }
      } catch (Exception e) {
        System.err.println(e.getMessage()); // Out of fuel
      }
    }
}