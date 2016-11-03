/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg9.text.file.input.and.output.creating.graphs.pkgclass.inheritance;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 1609963
 */
public class ProvenOilReservesAndSupply2015 {
    public static void main(String[] args) {
        ArrayList<String> country = new ArrayList<>();
        ArrayList<Double> barrel = new ArrayList<>();
        ArrayList<Double> production = new ArrayList<>();
        
        File file = new File("ProvenOilReservesAndSupply2015.txt");
        try {
            Scanner input = new Scanner(file);
            while (input.hasNext()) {
                country.add(input.next());
                barrel.add(input.nextDouble());
                production.add(input.nextDouble());
                
            }
        } catch (Exception e) {
        }
    }
   
}
