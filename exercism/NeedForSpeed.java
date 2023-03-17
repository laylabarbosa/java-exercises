class NeedForSpeed {
    private int speed;
    private int batteryDrain;
    private int drivenMeters= 0;
    public int batteryPercentage = 100;
    
    public NeedForSpeed(int speed, int batteryDrain){
        this.speed= speed;
        this.batteryDrain= batteryDrain;
    }
   
    public NeedForSpeed(){
        this.speed= 0;
        this.batteryDrain= 0;
    }
    public int getBatteryDrain(){
        return this.batteryDrain;
    }
    public int getSpeed(){
        return this.speed;
    }

    public boolean batteryDrained() {
        return this.batteryPercentage <= 0;
    }

    public int distanceDriven() {
        return this.drivenMeters;
    }

    public void drive() {
        if(this.batteryPercentage >0){
            this.drivenMeters += this.speed;
            this.batteryPercentage -= this.batteryDrain;
        }  
    }

    public static NeedForSpeed nitro() {
        return  new NeedForSpeed(50, 4);
    }
}
