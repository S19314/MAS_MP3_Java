package mp3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class PowerPlant { // abstract?
    private String name;
    private String address;
    private LocalDate createDate;
    private int powerGeneratedElectricityPerDay;

    private List<ImpactOnEnvironment> impactOnEnvironments = new ArrayList<>();
    
    public PowerPlant(String name, String address, LocalDate createDate, int powerGeneratedElectricityPerDay) {
        this.name = name;
        this.address = address;
        this.createDate = createDate;
        this.powerGeneratedElectricityPerDay = powerGeneratedElectricityPerDay;
    }
    public abstract void showMonthElectricictyGeneration();
    
    public ImpactOnEnvironment createNotEnvironmentallyFriendly(String fuelName, int fuelAmount) {
        ImpactOnEnvironment impactOnEnvironment = new NotEnvironmentallyFriendly(fuelName,  fuelAmount);
        impactOnEnvironments.add(impactOnEnvironment);
        return impactOnEnvironment;
    }
    
    public ImpactOnEnvironment createEnvironmentallyFriendly(int lastAverageWorkingTime) {
        ImpactOnEnvironment impactOnEnvironment = new EcologicalyFriendly(lastAverageWorkingTime);
        impactOnEnvironments.add(impactOnEnvironment);
        return impactOnEnvironment;
    }
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public int getPowerGeneratedElectricityPerDay() {
        return powerGeneratedElectricityPerDay;
    }

    public void setPowerGeneratedElectricityPerDay(int powerGeneratedElectricityPerDay) {
        this.powerGeneratedElectricityPerDay = powerGeneratedElectricityPerDay;
    }
    
    
    public class ImpactOnEnvironment{
        
    }
    
    public class NotEnvironmentallyFriendly extends PowerPlant.ImpactOnEnvironment {
    private String fuelName;
    private int fuelAmount;

    public NotEnvironmentallyFriendly(String fuelName, int fuelAmount) {
        this.fuelName = fuelName;
        this.fuelAmount = fuelAmount;
    }

    public String getFuelName() {
        return fuelName;
    }

    public void setFuelName(String fuelName) {
        this.fuelName = fuelName;
    }

    public int getFuelAmount() {
        return fuelAmount;
    }

    public void setFuelAmount(int fuelAmount) {
        this.fuelAmount = fuelAmount;
    }
    
    public double countUsedFullToday(){
        Random random = new Random();
        return random.nextInt(getFuelAmount());
    }
}
    
    public class EcologicalyFriendly extends PowerPlant.ImpactOnEnvironment {
    private int lastAverageWorkingTime;
    private String typeOfTime = "hours";

    public EcologicalyFriendly(int lastAverageWorkingTime) {
        this.lastAverageWorkingTime = lastAverageWorkingTime;
    }

    public int getLastAverageWorkingTime() {
        return lastAverageWorkingTime;
    }

    public void setLastAverageWorkingTime(int lastAverageWorkingTime) {
        this.lastAverageWorkingTime = lastAverageWorkingTime;
    }

    public String getTypeOfTime() {
        return typeOfTime;
    }

    public void setTypeOfTime(String typeOfTime) {
        this.typeOfTime = typeOfTime;
    }
    public int countAverageWorkingTime(){
        int workHours = (int)(Math.random()*10);
        setLastAverageWorkingTime(workHours);
        return workHours;
    }
}
}
