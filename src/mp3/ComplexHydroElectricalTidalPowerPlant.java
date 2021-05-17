/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mp3;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author admin
 */
public class ComplexHydroElectricalTidalPowerPlant extends TidalPowerPlant implements IHydroelectricPowerPlant{
    
    private String stateClosed = "Closed", stateOpened = "Opened";
    private double damLength;
    private String damGatesState = stateClosed;

    public ComplexHydroElectricalTidalPowerPlant(
            String name, 
            String address, 
            LocalDate createDate, 
            int powerGeneratedElectricityPerDay,
            LocalTime startTimeRushOfWater, 
            LocalTime endTimeRushOfWater, 
            int damLength,
            int lastAverageWorkingTime
    ) throws Exception {
        super(name, address, createDate, powerGeneratedElectricityPerDay, startTimeRushOfWater, endTimeRushOfWater, lastAverageWorkingTime);
        this.damLength = damLength;
    }
    
    public double getDamLength() {
        return damLength;
    }

    public void setDamLength(double damLength) {
        this.damLength = damLength;
    }

    public String getDamGatesState() {
        return damGatesState;
    }

    private void setDamGatesState(String damGatesState) {
        this.damGatesState = damGatesState;
    }
    
    @Override
    public void openDamGates(){
        System.out.println("Open Dam Gates");
        this.setDamGatesState(stateOpened);
        if(super.isStorageTankFilled()){
            super.toEmptyStorageTank();
        }else{
            this.fillStorageTank();
        }
    }

    @Override
    public void closedDamGates(){
        System.out.println("Close Dam Gates");
        this.setDamGatesState(stateClosed);
    }

    @Override
    public void showDamGatesState(){
        System.out.println("Dam Gates State is " + getDamGatesState());
    }

    @Override
    public String toString() {
        return "ComplexHydroElectricalTidalPowerPlant{" + "stateClosed=" + stateClosed + ", stateOpened=" + stateOpened + ", damLength=" + damLength + ", damGatesState=" + damGatesState + '}';
    }
    
    
}
