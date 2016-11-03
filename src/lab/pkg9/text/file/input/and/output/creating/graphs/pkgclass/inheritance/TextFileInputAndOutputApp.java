/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg9.text.file.input.and.output.creating.graphs.pkgclass.inheritance;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author 1609963
 */
public class TextFileInputAndOutputApp {

    /**
     * @param args the command line arguments
     */
    static ArrayList<ProductionData> productionData = new ArrayList<>();
    //static ArrayList<Double> production = new ArrayList<>();
    private static int year;
    private static double production;

    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 0; i < 5; i++) {
            year = Integer.parseInt(JOptionPane.showInputDialog("Enter year"));
            production = Double.parseDouble(JOptionPane.showInputDialog("Enter production:"));
            productionData.add(new ProductionData(year, production));
        }

        File txtFile = new File("Inventory.txt");

        try {
            try (PrintWriter printTxtFile = new PrintWriter(txtFile)) {
                for (int i = 0; i < productionData.size(); i++) {
                    printTxtFile.print(productionData.get(i).getYear() + " ");
                    printTxtFile.println(productionData.get(i).getDailyProduction());
                    
                    printTxtFile.println(productionData.get(i).toString());
                    
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TextFileInputAndOutputApp.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
