public class GasolineCar extends Car {
    public GasolineCar(String kind, double fuelPer100km){
        super(kind,fuelPer100km);
    }

    @Override
    public double costPerLiter() {
        return 1.6;
    }

    @Override
    public void performDefaultService(){
        repair(400);
    }
}
