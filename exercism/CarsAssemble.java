public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        int hourlyProduction=221;
        if (speed >= 5 && speed <=8) return  speed * hourlyProduction * 0.9;
        else if (speed == 9) return  speed * hourlyProduction *0.8;
        else if (speed == 10) return speed * hourlyProduction *0.77;
        else return speed * hourlyProduction;
    }

    public int workingItemsPerMinute(int speed) {
        return (int)productionRatePerHour(speed) / 60;
    }
}
