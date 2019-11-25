class Porsche extends Vehicle {
    
    public Porsche(double hp, double w, double sp){
        super(hp,sp,w);
 
    }
    
    public String getName(){
        return "Mercedes";
    
    }
   
    public double acceleration()
    {
        return(100/getHorsepower())*(getSpeed()/2)*(getWeight()/100);
    }
}