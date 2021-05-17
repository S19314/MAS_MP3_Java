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
public class Village extends Locality {
    
    private LocalDate dateBecomingVillage;
    private ArrayList<String> schools = new ArrayList<>();
    
    public Village(String name, long population, LocalDate CreationTime, String[] schools) {
        super(name, population, CreationTime);
        setDateBecomingVillage(LocalDate.now());
        addSchools(schools);
    }

    public Village(Locality prevLocality, String[] schools){
        super(prevLocality.getName(), prevLocality.getPopulation(), prevLocality.getCreationTime());
        setDateBecomingVillage(LocalDate.now());
        addSchools(schools);
    }
    
    public LocalDate getDateBecomingVillage() {
        return dateBecomingVillage;
    }

    private void setDateBecomingVillage(LocalDate dateBecomingVillage) {
        this.dateBecomingVillage = dateBecomingVillage;
    }

    public String[] getSchools() {
        return schools.toArray(new String[0]);
    }

    public void addSchools(String[] schools) {
        for(int i = 0; i < schools.length; i++){
            this.schools.add(schools[i]);
        }
    }
    
    @Override
    public int countLifeLevel() {
        int schoolMark = 3;
        return schoolMark * schools.size();
    }

    @Override
    public String toString() {
        return "Village{" + "dateBecomingVillage=" + dateBecomingVillage + ", schools=" + schools + '}'
                + "LifeLevel " + countLifeLevel();
    }
    
    
}
