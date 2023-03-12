public class Lasagna {
    private static int ovenTime = 40;
  
    public static void Lasagna(){
    }

    // TODO: define the 'expectedMinutesInOven()' method
    public static int expectedMinutesInOven(){
        return ovenTime;
    }
    // TODO: define the 'remainingMinutesInOven()' method
    public static int remainingMinutesInOven(int elapsedTime){
        int remainingTime = ovenTime - elapsedTime;
        return remainingTime;
    }
    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int layers){
        int preparationTime = layers * 2;
        return preparationTime;
    }
    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int layers, int elapsedTime){
        int workedTime = preparationTimeInMinutes(layers) + elapsedTime;
        return workedTime;
    }
}
