import java.util.List;
import java.util.ArrayList;

public class TestTrack {

    public static void race(RemoteControlCar car) {
        car.drive();
    }

    public static List<ProductionRemoteControlCar> getRankedCars(ProductionRemoteControlCar prc1,
                                                                 ProductionRemoteControlCar prc2) {
        List<ProductionRemoteControlCar> prcCompared = new ArrayList<ProductionRemoteControlCar>();
        if (prc1.compareTo(prc2) == 1) {
             prcCompared.add(prc2);
             prcCompared.add(prc1);
            }
        else if (prc1.compareTo(prc2) == -1) {
             prcCompared.add(prc1);
             prcCompared.add(prc2);
            }
        return prcCompared;
    }
}
