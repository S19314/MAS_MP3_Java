/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mp3;

import java.time.LocalDate;
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

    
    
}
