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
    private String breadType;
            
    /*
        Fields of Beverage fabricator
    */
    
    private EnumSet<FactoryType> factoryKind = EnumSet.of(FactoryType.Factory);
    
}
