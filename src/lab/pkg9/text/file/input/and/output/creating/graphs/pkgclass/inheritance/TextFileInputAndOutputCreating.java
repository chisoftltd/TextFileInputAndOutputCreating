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
public class TextFileInputAndOutputCreating {

    /**
     * @param args the command line arguments
     */
    static ArrayList<Integer> year = new ArrayList<>();
    static ArrayList<Double> production = new ArrayList<>();

    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 0; i < 10; i++) {
            year.add(Integer.parseInt(JOptionPane.showInputDialog("Enter year")));
            production.add(Double.parseDouble(JOptionPane.showInputDialog("Enter production:")));
        }

        File txtFile = new File("Inventory.txt");
        try {
            PrintWriter printTxtFile = new PrintWriter(txtFile);
            for (int i = 0; i < year.size(); i++) {
                printTxtFile.write(year.get(1));
                printTxtFile.print(production.get(i));

                System.out.println(printTxtFile.toString());
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TextFileInputAndOutputCreating.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
