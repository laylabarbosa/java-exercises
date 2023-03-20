class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar>{
    private int speed= 10;
    private int drivenMeters= 0;
    private int numberOfVictories =0;

  
    public ProductionRemoteControlCar(){
    }
    @Override
    public void drive() {
       this.drivenMeters += speed;
    }

    public int getDistanceTravelled() {
        return drivenMeters;
    }

    public int getNumberOfVictories() {
        return numberOfVictories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.numberOfVictories = numberOfVictories;
    }

    public int compareTo(ProductionRemoteControlCar pr){  
          
        if(this.numberOfVictories<=pr.numberOfVictories)  return -1;   
        return 1;  
    }  
}
  
