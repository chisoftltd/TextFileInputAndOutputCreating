/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg9.text.file.input.and.output.creating.graphs.pkgclass.inheritance;

/**
 *
 * @author 1609963
 */
public class ProductionData {
    int year;
    double dailyProduction;

    public ProductionData(int year, double dailyProduction) {
        this.year = year;
        this.dailyProduction = dailyProduction;
    }

    public int getYear() {
        return year;
    }

    public double getDailyProduction() {
        return dailyProduction;
    }

    @Override
    public String toString() {
        return "ProductionData{" + "year=" + year + ", dailyProduction=" + dailyProduction + '}';
    }
    
}
