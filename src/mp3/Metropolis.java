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
public class Metropolis extends Locality {
    private LocalDate DateBecomingMetropolis;
    private ArrayList<String> schools = new ArrayList<>();
    private ArrayList<String> museums = new ArrayList<>();
    private ArrayList<String> shoppingCenters = new ArrayList<>();

    public Metropolis(String name, long population, LocalDate CreationTime, String[] schools, String[] museums, String[] shoppingCenters) {
        super(name, population, CreationTime);
        setDateBecomingMetropolis(LocalDate.now());
        addSchools(schools);
        addMuseums(museums);
    }
    public Metropolis(Locality prevLocality, String[] schools, String[] museums, String[] shoppingCenters){
        super(prevLocality.getName(), prevLocality.getPopulation(), prevLocality.getCreationTime());
        setDateBecomingMetropolis(LocalDate.now());
        addSchools(schools);
        addMuseums(museums);
    }
    
    public LocalDate getDateBecomingMetropolis() {
        return DateBecomingMetropolis;
    }

    private void setDateBecomingMetropolis(LocalDate DateBecomingMetropolis) {
        this.DateBecomingMetropolis = DateBecomingMetropolis;
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
            int schoolMark = 3, museumMark = 2, shoppingCenrter = 2;
        return schoolMark * schools.size() + museumMark*museums.size() + shoppingCenrter*museums.size();
    }

    
}
