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
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author 1609963
 */
public class BrentCrude2000To2015 {

    static ArrayList<Double> list1 = new ArrayList<>();
    static ArrayList<Double> list2 = new ArrayList<>();

    public static void main(String[] args) {
        File file = new File("BrentCrude2000-2015.txt");
        Scanner input;
        try {
            input = new Scanner(file);
            while (input.hasNext()) {
                list1.add(input.nextDouble());
                list2.add(input.nextDouble());
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BrentCrude2000To2015.class.getName()).log(Level.SEVERE, null, ex);
        }
        XYSeries series = new XYSeries("BrentCrude");
        for (int i = 0; i < list1.size(); i++) {
            series.add(list1.get(i), list2.get(i));
        }

        XYSeriesCollection data = new XYSeriesCollection();
        data.addSeries(series);
        JFreeChart chart = ChartFactory.createXYLineChart("Line Chart", "X", "Y", data);
        ChartFrame frame = new ChartFrame("XY graph using JFreeFrame", chart);
        frame.pack();
        frame.setVisible(true);
    }
}
