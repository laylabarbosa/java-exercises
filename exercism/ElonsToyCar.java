public class ElonsToyCar {
    private int drivenMeters= 0;
    private int batteryPercentage = 100;
    
    public static ElonsToyCar buy() {
            return new ElonsToyCar();
    }

    public String distanceDisplay() {
        if (this.drivenMeters >= 2000) return "Driven 2000 meters";
        return "Driven " + this.drivenMeters + " meters";
    }

    public String batteryDisplay() {
        if (this.batteryPercentage <=0) return "Battery empty";
        return "Battery at " + this.batteryPercentage + "%";
    }

    public void drive() {
        if (this.drivenMeters <= 2000 || this.batteryPercentage >0){     
        this.drivenMeters += 20;
        this.batteryPercentage -= 1;
        }    
    }
}
