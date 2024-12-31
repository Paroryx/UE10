public class VehicleApp {
  public static void main(String[] args) {
    Vehicle[] vehicles = new Vehicle[5];
    vehicles[0] = new DieselCar("Audi SQ5 TDI", 7.1);
    vehicles[1] = new DieselCar("BMW 335d xDrive", 5.7);
    vehicles[2] = new GasolineCar("Porsche 911 GT3", 13);
    vehicles[3] = new GasolineCar("2017 Dodge Viper Vooodoo II", 15.6);
    vehicles[4] = new Bike();
    
    Out.println("=== Print all vehicles ===");
    printAll(vehicles);

    Out.println("=== Drive all vehicles 5,000.50 km ===");
    driveAll(63, vehicles);

    Out.println("=== Print all vehicles ===");
    printAll(vehicles);

    Out.println("=== Service all vehicles ===");
    serviceAll(vehicles);

    Out.println("=== Print all vehicles ===");
    printAll(vehicles);

    Out.println("=== Repair all vehicles for 100 Euro ===");
    repairAll(325, vehicles);

    Out.println("=== Print all vehicles ===");
    printAll(vehicles);
  }

  public static void driveAll(double km, Vehicle... vehicles) {
    for (Vehicle vehicle : vehicles) {
      vehicle.drive(km);
    }
  }

  public static void printAll(Printable... printables) {
    for (Printable printable : printables) {
      printable.print();
    }
  }

  public static void serviceAll(Repairable... repairables) {
    for (Repairable repairable : repairables) {
      repairable.performDefaultService();
    }
  }

  public static void repairAll(double cost, Repairable... repairables) {
    for (Repairable repairable : repairables) {
      repairable.repair(cost);
    }
  }
}