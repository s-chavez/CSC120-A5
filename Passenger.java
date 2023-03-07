public class Passenger {
    private String name;
  
    /**
     * Constructor for 'Passenger' that takes in initial values for the name attribute and sets it appropriately
     * @param name The name of the 'Passenger'
     */
    public Passenger(String name) {
      this.name = name;
    }
    /**
     * Calls the addPassenger method from the 'Car' class to board a given 'Car'
     * @param c The 'Car' c
     */
    public void boardCar(Car c) {
      try {
        c.addPassenger(this);
      } catch (Exception e) {
        System.out.println(e);
      }
    }
    /**
     * Calls the removePassenger method from the 'Car' class to get off a given 'Car'
     * @param c The 'Car' c
     */
    public void getOffCar(Car c) {
      try {
        c.removePassenger(this);
      } catch (Exception e) {
        System.out.println(e);
      }
    }
    /**
     * Accesses the name of the 'Passenger'
     * @return The name of the 'Passenger'
     */
    public String getName() {
      return this.name;
    }
}