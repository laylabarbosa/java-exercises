class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return birdsPerDay;
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length -1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length -1] += 1;
    }

    public boolean hasDayWithoutBirds() {
        boolean noBird= false;
        for(int day:birdsPerDay) {
            if (day == 0){
                noBird= true;
            }
        }
        return noBird;   
    }

    public int getCountForFirstDays(int numberOfDays) {
        int birdCount = 0;
        if (birdsPerDay.length >= numberOfDays){            
            for(int i=0; i< numberOfDays; i++){
                birdCount += birdsPerDay[i];
            }
        }else{
            for(int i=0; i< birdsPerDay.length; i++){
                birdCount += birdsPerDay[i];
            }
        }
       return birdCount;
    }

    public int getBusyDays() {
        int busyDayCount = 0;
        for(int i=0; i < birdsPerDay.length; i++){
            if (birdsPerDay[i] >= 5)
            busyDayCount += 1;
        }
        return busyDayCount;
    }
}
