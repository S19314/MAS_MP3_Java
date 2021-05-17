package mp3;

import java.time.LocalDate;
import java.time.LocalTime;

public class TidalPowerPlant extends PowerPlant {
    
    private LocalTime startTimeRushOfWater, // = LocalTime.of(21, 23),
            endTimeRushOfWater; //= LocalTime.of(05, 44);
    private boolean isStorageTankFilled = false;
    public TidalPowerPlant(
            String name,
            String address, 
            LocalDate createDate,
            int powerGeneratedElectricityPerDay,
            LocalTime startTimeRushOfWater,
            LocalTime endTimeRushOfWater
    ) throws Exception{
        super(name, address, createDate, powerGeneratedElectricityPerDay);
        validationEndAndStartTimeRushOfWater(
             endTimeRushOfWater, startTimeRushOfWater
        );
        this.endTimeRushOfWater = endTimeRushOfWater;
        this.startTimeRushOfWater = startTimeRushOfWater;
    }
    private void validationEndAndStartTimeRushOfWater(
            LocalTime endTimeRushOfWater, 
            LocalTime startTimeRushOfWater
    ) throws Exception{
        int endTimeRushOfWaterMinute = convertLocalTimeToMinutes(endTimeRushOfWater),
            startTimeRushOfWaterMinute = convertLocalTimeToMinutes(startTimeRushOfWater);
        if(startTimeRushOfWaterMinute < endTimeRushOfWaterMinute) {
            throw new Exception("startTimeRushOf must be less then endTimeRushOfWaterMinute");
        }
    }
    public LocalTime getStartTimeRushOfWater() {
        return startTimeRushOfWater;
    }

    public void setStartTimeRushOfWater(LocalTime startTimeRushOfWater) {
        this.startTimeRushOfWater = startTimeRushOfWater;
    }

    public LocalTime getEndTimeRushOfWater() {
        return endTimeRushOfWater;
    }

    public void setEndTimeRushOfWater(LocalTime endTimeRushOfWater) {
        this.endTimeRushOfWater = endTimeRushOfWater;
    }

    public boolean isStorageTankFilled() {
        return isStorageTankFilled;
    }

    public void setIsStorageTankFilled(boolean isStorageTankFilled) {
        this.isStorageTankFilled = isStorageTankFilled;
    }
    
    
    public void fillStorageTank(){
        System.out.println("Fill Storage Tank");
        setIsStorageTankFilled(true);
    }
    
    public void toEmptyStorageTank(){
        System.out.println("To empty Storage Tank");
        setIsStorageTankFilled(false);
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
