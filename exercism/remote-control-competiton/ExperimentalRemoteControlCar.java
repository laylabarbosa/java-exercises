public class ExperimentalRemoteControlCar implements RemoteControlCar{
    private int speed= 20;
    private int drivenMeters= 0;

    public ExperimentalRemoteControlCar(){
    }
    
    @Override
    public void drive() {
       this.drivenMeters += speed;
    }
    @Override
    public int getDistanceTravelled() {
        return drivenMeters;
    }
}
