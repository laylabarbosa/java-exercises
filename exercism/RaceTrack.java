public class RaceTrack {
    private int distance;
    
     public RaceTrack(int distance){
        this.distance= distance;
    }

    public boolean tryFinishTrack(NeedForSpeed car) {
        double driversPerDistance= (double)this.distance / (double)car.getSpeed();
        if (car.getBatteryDrain() * driversPerDistance <= car.batteryPercentage)return true;
        return false;
    } 
}
