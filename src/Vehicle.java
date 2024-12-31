public abstract class Vehicle implements Printable, Repairable{
    protected final String kind; //model name
    double drivenDistance;
    double cumulativeCost;
    public Vehicle(String kind){
        this.kind = kind;
        drivenDistance = 0;
        cumulativeCost = 0;
    }
    public abstract double costPerKM();
    public void drive(double km) throws IllegalArgumentException{
        if(km < 0){
            throw new IllegalArgumentException("you can not drive negative");
        }
        drivenDistance += km;
        cumulativeCost += km*costPerKM();
    }
    @Override
    public void repair(double cost){
        cumulativeCost += cost;
    }
    @Override
    public void print(){
        StringBuilder sb = new StringBuilder();
        sb.append("Kind: [%s], drivenDistance: %.2fkm, cumulativeCost: %.2f Euro".formatted(kind,drivenDistance,cumulativeCost));
        Out.println((sb.toString()));
    }
}
