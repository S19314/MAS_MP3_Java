package mp3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.EnumSet;

enum FactoryType {Factory, Bakery, BeverageFabricator};

public class Factory {
    /*
        Fields of Factory 
    */
    private LocalDate creationDate;
    private String name;
    
    /*
        Fields of Bakery
    */
    enum BreadType {Wheat, Buckwheat, Grain, Bran};
    private ArrayList<String> historyProducedBread = new ArrayList<String>(); // For Analistic
    
    /*
        Fields of Beverage fabricator
    */
    private int maxProduceLitresDrinkPerOneCycle;
    // maxProduceLitresDrinkPerOneCycle
    
    private EnumSet<FactoryType> factoryKind = EnumSet.of(FactoryType.Factory);

    /*
        Creates Bakery-Beverage fabricator.
    */
    public Factory(LocalDate creationDate, String name, String[] historyProducedBread, int maxProduceLitresDrinkPerDay) {
        this.creationDate = creationDate;
        this.name = name;
        this.addHistoryProducedBread(historyProducedBread);
        this.maxProduceLitresDrinkPerOneCycle = maxProduceLitresDrinkPerDay;
        
        factoryKind.add(FactoryType.Bakery);
        factoryKind.add(FactoryType.BeverageFabricator);
    }

    public int getMaxProduceLitresDrinkPerOneCycle() {
        return maxProduceLitresDrinkPerOneCycle;
    }

    public void setMaxProduceLitresDrinkPerOneCycle(int maxProduceLitresDrinkPerOneCycle) {
        this.maxProduceLitresDrinkPerOneCycle = maxProduceLitresDrinkPerOneCycle;
    }
    
    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getHistoryProducedBread() { 
        return historyProducedBread.toArray(new String[0]);
    }

    public void addHistoryProducedBread(String[] historyProducedBread) {
        for(int i = 0; i < historyProducedBread.length; i++){
            this.historyProducedBread.add(historyProducedBread[i]);
        }
    }

    public EnumSet<FactoryType> getFactoryKind() {
        return factoryKind;
    }

    private void setFactoryKind(EnumSet<FactoryType> factoryKind) {
        this.factoryKind = factoryKind;
    }
    
    /*
         Methods of Bakery
    */
    
    private String produceBread(BreadType breadType) throws Exception{
        String producedBread = "FACTORY_DOESNT_HAVE_RECIPE_FOR_" + breadType;
        switch(breadType){
            case Bran:
                producedBread = "Bran bread"; 
            break;
            case Buckwheat: 
                producedBread = "Buckwheat bread";
            break;
            case Grain: 
                producedBread = "Grain bread";
            break;
            case Wheat: 
                producedBread = "Wheat bread";
            break;
            default:        
                throw new Exception("Enum BreadType, isn't implemented for " 
                + breadType + "In Factory, method produceBread()");
        }
        return producedBread;
    }
    public String[] produceBreads(int quantity, BreadType breadType) throws Exception{
        if(factoryKind.contains(FactoryType.Bakery)){
            String breads[] = new String[quantity];
            for(int i = 0; i < quantity; i++){
                breads[i] = produceBread(breadType);
            }
            addHistoryProducedBread(breads);
            return breads;
        }else{
            throw new Exception("The Factory is not a Bakery type.");
        }
    }
    
    /*
        Fields of Beverage fabricator
    */
    
    public String[] produceSpriteBottlesOneLitreVolume(int quantityLitres) throws Exception {
        if(factoryKind.contains(FactoryType.BeverageFabricator)){
            if(quantityLitres > getMaxProduceLitresDrinkPerOneCycle()){
                quantityLitres = getMaxProduceLitresDrinkPerOneCycle();
            }
            String bottles[] = new String[quantityLitres];
            for(int i = 0; i < quantityLitres; i++){
                bottles[i] = "One litre of bottle with Sprite.";
            }
            return bottles;
        }else{
            throw new Exception("The Factory is not a Beverage Fabricator type.");
        }
    }
}
