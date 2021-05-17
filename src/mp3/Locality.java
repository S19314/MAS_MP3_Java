/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mp3;

import java.time.LocalDate;

/**
 *
 * @author admin
 */
public abstract class Locality {
    private String name;
    private long population;
    private LocalDate CreationTime;

    public Locality(String name, long population, LocalDate CreationTime) {
        this.name = name;
        this.population = population;
        this.CreationTime = CreationTime;
    }
    
    public abstract int countLifeLevel();

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{name=" + name + ", population=" + population + ", CreationTime=" + CreationTime + '}';
    }
    
    
}
