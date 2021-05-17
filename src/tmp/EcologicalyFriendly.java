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
public class EcologicalyFriendly {
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
