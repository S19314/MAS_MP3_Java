package mp3;

import java.time.LocalDate;
import java.time.LocalTime;

public class TidalPowerPlant extends PowerPlant {
    
    private LocalTime startTimeRushOfWater = LocalTime.of(21, 23),
            endTimeRushOfWater = LocalTime.of(05, 44);

    public TidalPowerPlant(String name, String address, LocalDate createDate, int powerGeneratedElectricityPerDay) {
        super(name, address, createDate, powerGeneratedElectricityPerDay);
    }

    @Override
    public void showMonthElectricictyGeneration() {
        String message =
                "Electricicty generated in 30 days by Tidal Power Plant: " + 
                (
                30
                *
                this.getPowerGeneratedElectricityPerDay()
                )
                + ";";
        System.out.println(message);
    }
    
    private int convertLocalTimeToMinutes(LocalTime localTime){
        return localTime.getMinute() + localTime.getHour()*60;
    }
    public void countTimeToEndRushOfWater(){
        int nowMinutes =  convertLocalTimeToMinutes(LocalTime.now()),
            startTimeRush = convertLocalTimeToMinutes(startTimeRushOfWater),
            endTimeRush = convertLocalTimeToMinutes(endTimeRushOfWater);
        String message = "";
    if(nowMinutes > endTimeRush && nowMinutes < startTimeRush){
         message  = "Rush of water dosen\'t start yet. Minutes till start "
                + (startTimeRush-nowMinutes) +";";
    }else{
        int twentyFourHours = convertLocalTimeToMinutes(LocalTime.MAX);
        int minutesToEnd = (twentyFourHours + endTimeRush) - nowMinutes;
         message = "Rush of water will end in minutes " + minutesToEnd +";";
    }
        System.out.println(message);
    
    }
    
}
