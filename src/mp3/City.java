/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mp3;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class City extends Locality {
    
    private LocalDate dateBecomingCity;
    private ArrayList<String> schools = new ArrayList<>();
    private ArrayList<String> museums = new ArrayList<>();
     
    public City(String name, long population, LocalDate CreationTime, String[] schools, String[] museums) {
        super(name, population, CreationTime);
        setDateBecomingCity(LocalDate.now());
        addSchools(schools);
        addMuseums(museums);
    }
    public City(Locality prevLocality, String[] schools, String[] museums){
        super(prevLocality.getName(), prevLocality.getPopulation(), prevLocality.getCreationTime());
        setDateBecomingCity(LocalDate.now());
        addSchools(schools);
        addMuseums(museums);
    }
    
    public LocalDate getDateBecomingCity() {
        return dateBecomingCity;
    }

    private void setDateBecomingCity(LocalDate dateBecomingCity) {
        this.dateBecomingCity = dateBecomingCity;
    }
    
   
    public void addSchools(String[] schools) {
        for(int i = 0; i < schools.length; i++){
            this.schools.add(schools[i]);
        }
    }
    
    public void addMuseums(String[] museums) {
        for(int i = 0; i < museums.length; i++){
            this.museums.add(museums[i]);
        }
    }

    @Override
    public int countLifeLevel() {
        int schoolMark = 3, museumMark = 2;
        return schoolMark * schools.size() + museumMark*museums.size();
    }

    @Override
    public String toString() {
        return "City{" + "dateBecomingCity=" + dateBecomingCity + ", schools=" + schools + ", museums=" + museums + "} "
                + "LifeLevel " + countLifeLevel();
    }
    
    
    
}
