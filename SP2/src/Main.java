public class Main {
    public static void main(String[] args) {
        FleetOfCars fleetOfCars = new FleetOfCars();
        fleetOfCars.addCar(new GasolineCar("1456110", "McLaren", "Senna", 2 ,9));
        fleetOfCars.addCar(new DieselCar("M196334", "Audi", "A4 Avant 3.0 TDI Quattro 2016", 5 ,18, true));
        fleetOfCars.addCar(new ElectricCar("CT6N319", "Tesla", "S", 5 ,100, 600));
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("----------------------------------------------------------------  LIST OF CARS  ----------------------------------------------------------------"+"\n");
        System.out.println(fleetOfCars);
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------"+"\n");
        System.out.println("TOTAL REGISTRATION FEE: "+fleetOfCars.getTotalRegistrationFeeForFleet());

    }
}
