/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mp3;

import java.util.Random;

/**
 *
 * @author admin
 */
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
