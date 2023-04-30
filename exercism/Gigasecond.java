import java.time.LocalDate;
import java.time.LocalDateTime;
public class Gigasecond {
    private LocalDateTime gigasecondAfter;
    
    public Gigasecond(LocalDate moment) {
        LocalDateTime momentDateTime = moment.atStartOfDay();
        calculateGigasecond(momentDateTime);
    }

    public Gigasecond(LocalDateTime moment) {
        calculateGigasecond(moment);
        
    }
    private void calculateGigasecond(LocalDateTime moment){
         gigasecondAfter=moment.plusSeconds(1000000000);
    }

    public LocalDateTime getDateTime() {
        return gigasecondAfter;
    }
}
