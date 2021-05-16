package mp3;

import java.util.Date;
import java.util.EnumSet;

enum FactoryType {Factory, Bakery, BeverageFabricator};
public class Factory {
    /*
        Fields of Factory 
    */
    private Date creationDate;
    private String name;
    
    /*
        Fields of Bakery
    */
    private String[] breadTypes; // For Producing
    
    /*
        Fields of Beverage fabricator
    */
    private int maxProduceLitresDrinkPerDay;
    
    private EnumSet<FactoryType> factoryKind = EnumSet.of(FactoryType.Factory);

    /*
        Creates Bakery-Beverage fabricator.
    */
    public Factory(Date creationDate, String name, String[] breadTypes, int maxProduceLitresDrinkPerDay) {
        this.creationDate = creationDate;
        this.name = name;
        this.breadTypes = breadTypes;
        this.maxProduceLitresDrinkPerDay = maxProduceLitresDrinkPerDay;
    }

    public int getMaxProduceLitresDrinkPerDay() {
        return maxProduceLitresDrinkPerDay;
    }

    public void setMaxProduceLitresDrinkPerDay(int maxProduceLitresDrinkPerDay) {
        this.maxProduceLitresDrinkPerDay = maxProduceLitresDrinkPerDay;
    }
    
    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getBreadTypes() {
        return breadTypes;
    }

    public void setBreadTypes(String[] breadTypes) {
        this.breadTypes = breadTypes;
    }

    public EnumSet<FactoryType> getFactoryKind() {
        return factoryKind;
    }

    public void setFactoryKind(EnumSet<FactoryType> factoryKind) {
        this.factoryKind = factoryKind;
    }
    
    
}
