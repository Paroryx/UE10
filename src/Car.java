public abstract class Car extends Vehicle {
    protected double fuelPer100km;
    public Car(String kind, double fuelPer100km){
        super(kind);
        this.fuelPer100km = fuelPer100km;
    }
    public abstract double costPerLiter();
    @Override
    public double costPerKM(){
        return (fuelPer100km/100)*costPerLiter();
    }
}
