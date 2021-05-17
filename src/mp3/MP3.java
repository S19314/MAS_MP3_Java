/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mp3;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.Date;

/**
 *
 * @author admin
 */
public class MP3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        overlapping();
        testDisjointPolymorphic();
    }
    
    public static void showArrayValues(String[] elements){
        for(int i = 0; i < elements.length; i++){
            System.out.println(elements[i]);
        }
    }
    
    public static void overlapping() {
        Factory factory = new Factory(
                LocalDate.of(2004, 3, 4),
                "Tesla food producer",
                new String[0],
                1000);
        try {
            String[] breads = factory.produceBreads(5, Factory.BreadType.Wheat);
            String[] bottles = factory.produceSpriteBottlesOneLitreVolume(3);
            showArrayValues(breads);
            showArrayValues(bottles);
        } catch (Exception e) {
                e.printStackTrace();
        }
    }
    
    public static void testDisjointPolymorphic() {
     PowerPlant powerPlant1 =
             new NuclerPowerPlant(
                     "South-Ukrainian nuclear power plant", 
                     "Mykolaiv Oblast", 
                     LocalDate.of(1982, Month.MARCH, 14),
                     3000, 
                     4
             );
            PowerPlant powerPlant2 = new HydroelectricPowerPlant(
                    "Wisla Entertaiment",
                    "Black",
                    LocalDate.of(1995, 10, 18),
                    1212,
                    200
            );

            powerPlant1.showMonthElectricictyGeneration();
            powerPlant2.showMonthElectricictyGeneration();
            
    }
    
    
    public static void multipleInheritance() {
        try {
        ComplexHydroElectricalTidalPowerPlant complexHydroElectricalTidalPowerPlant
                = new ComplexHydroElectricalTidalPowerPlant(
                        "UDA Kilo",
                        "city Verdask", 
                        LocalDate.of(1993, 5, 22),
                        350,
                        LocalTime.of(21, 23),
                        LocalTime.of(05, 44),
                        1
                );
            System.out.println(complexHydroElectricalTidalPowerPlant);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

    
}
