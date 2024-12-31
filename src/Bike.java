public class Bike extends Vehicle{
    public Bike(){
        super("Bike");
    }
    @Override
    public double costPerKM() {
        return 0;
    }
    @Override
    public void drive(double km) throws IllegalArgumentException{
        super.drive(km);
        cumulativeCost += 0.8;
    }
    @Override
    public void performDefaultService(){
        repair(75);
    }
}
