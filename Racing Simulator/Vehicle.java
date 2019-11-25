public class Vehicle {
    
    private double speed;
    private double weight;
    private double horsepower;
    private double accel;
    private String name;
    
    public Vehicle(double hp, double sp, double w){
        horsepower = hp;
        speed = sp;
        weight = w;
        name = "name";
    }
    
    public double getHorsepower()
    {
        return horsepower;
    }
   
    public double getSpeed()
    {
        return speed;
    }
    
    public double getWeight()
    {
        return weight;
    }
    
    public String getName()
    {
        return name;
    }
    
    public double acceleration()
    {
        accel = (100/horsepower)*(getSpeed())*(getWeight()/100);
        return accel;
    }
    
    
}