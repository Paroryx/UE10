public class DieselCar extends Car {
    public DieselCar(String kind, double fuelPer100km){
        super(kind,fuelPer100km);
    }
    @Override
    public double costPerLiter(){
         return 1.7;
    }
    @Override
    public void performDefaultService(){
        repair(500);
    }
}
