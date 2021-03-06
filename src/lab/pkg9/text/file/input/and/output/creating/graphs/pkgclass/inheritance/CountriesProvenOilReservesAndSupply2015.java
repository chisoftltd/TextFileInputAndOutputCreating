/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg9.text.file.input.and.output.creating.graphs.pkgclass.inheritance;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author 1609963
 */
public class CountriesProvenOilReservesAndSupply2015 {
    public static void main(String[] args) {
        
            ArrayList<Country> country = new ArrayList<>();
            /*ArrayList<String> country = new ArrayList<>();
            ArrayList<Double> barrel = new ArrayList<>();
            ArrayList<Double> production = new ArrayList<>();
*/
            
            File file = new File("ProvenOilReservesAndSupply2015.txt");
        try {    
            Scanner input = new Scanner(file);
            while (input.hasNext()) {
                country.add(new Country(input.next(), input.nextDouble(), input.nextDouble()));
            }
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error : " + ex);
        }
        
                DefaultCategoryDataset datasetCountryReserve = new DefaultCategoryDataset();

        for (int i = 0; i < country.size(); i++) {
            datasetCountryReserve.addValue((double)country.get(i).getReserve(), country.get(i).getName(), country.get(i).getSupUnit());
        }

        JFreeChart barChartCountryReserve = ChartFactory.createBarChart3D(" Country and Proven Reserves Chart", "Country", "Reserve", datasetCountryReserve);

        ChartFrame frameCountryReserve = new ChartFrame("Bat Chart using JFreeChart - Country and Proven Reserves Chart", barChartCountryReserve);
        frameCountryReserve.pack();
        frameCountryReserve.setVisible(true);
        
         try {
            ChartUtilities.saveChartAsJPEG(new File("H:"
                    + "\\NetBeansProjects\\Lab 9 Text File Input "
                    + "and output Creating Graphs Class Inheritance"
                    + "\\Country and Proven Reserves Chart.jpg"),
                    barChartCountryReserve, 900, 900);
        } catch (Exception ex) {
            System.out.print("Problem saving jpg file");
        }
         
         DefaultCategoryDataset datasetCountryProduction = new DefaultCategoryDataset();

        for (int i = 0; i < country.size(); i++) {
            datasetCountryProduction.addValue(country.get(i).getSupply(), country.get(i).getName(), country.get(i).getResUnit());
        }

        JFreeChart barChartCountryProduction = ChartFactory.createBarChart3D("Country and Daily Production Chart", "Country", "Production", datasetCountryProduction);
        ChartFrame frameCountryProduction = new ChartFrame("Bat Chart using JFreeChart - Country and Daily Production Chart", barChartCountryProduction);
        frameCountryProduction.pack();
        frameCountryProduction.setVisible(true);

        try {
            ChartUtilities.saveChartAsJPEG(new File("H:"
                    + "\\NetBeansProjects\\Lab 9 Text File Input "
                    + "and output Creating Graphs Class Inheritance"
                    + "\\Country and Production Chart.jpg"),
                    barChartCountryProduction, 900, 900);
        } catch (Exception ex) {
            System.out.print("Problem saving jpg file");
        }

        DefaultCategoryDataset datasetCountryProductionYear = new DefaultCategoryDataset();

        for (int i = 0; i < country.size(); i++) {
            datasetCountryProductionYear.addValue((country.get(i).getReserve() / country.get(i).getSupply()), country.get(i).getName(), country.get(i).getResUnit());
        }

        JFreeChart barChartCountryProductionYear = ChartFactory.createBarChart3D("Country and Production Year Chart", "Country", "Production Year", datasetCountryProductionYear);
        ChartFrame frameCountryProductionYear = new ChartFrame("Bat Chart using JFreeChart - Country and Production Year Chart", barChartCountryProductionYear);
        frameCountryProductionYear.pack();
        frameCountryProductionYear.setVisible(true);

        try {
            ChartUtilities.saveChartAsJPEG(new File("H:"
                    + "\\NetBeansProjects\\Lab 9 Text File Input "
                    + "and output Creating Graphs Class Inheritance"
                    + "\\Country and Production Year Chart.jpg"),
                    barChartCountryProductionYear, 900, 900);
        } catch (Exception ex) {
            System.out.print("Problem saving jpg file");
        }

        DefaultPieDataset dataPie = new DefaultPieDataset();

        for (int i = 0; i < 12; i++) {
            dataPie.setValue(country.get(i).getName(), country.get(i).getReserve());
        }

        JFreeChart pieChart = ChartFactory.createPieChart("12 Countries and Oil Reserves", dataPie);

        ChartFrame frame = new ChartFrame("Pie Chart using JFreeFrame", pieChart);
        frame.pack();
        frame.setVisible(true);

        try {
            ChartUtilities.saveChartAsJPEG(new File("H:"
                    + "\\NetBeansProjects\\Lab 9 Text File Input "
                    + "and output Creating Graphs Class Inheritance"
                    + "\\12 Countries and Reserves Chart.jpg"),
                    pieChart, 900, 900);
        } catch (Exception ex) {
            System.out.print("Problem saving jpg file");
        }
    }
}
