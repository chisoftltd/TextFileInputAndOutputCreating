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
public class Country {

    private String name;
    private double reserve;
    private String resUnit = "Pa";
    private double supply;
    private String supUnit = "Psi";

    public Country(String name, double supply, double reserve) {
        this.name = name;
        this.reserve = reserve;
        this.supply = supply;
    }

    public String getName() {
        return name;
    }

    public double getReserve() {
        return reserve;
    }

    public String getResUnit() {
        return resUnit;
    }

    public double getSupply() {
        return supply;
    }

    public String getSupUnit() {
        return supUnit;
    }

    @Override
    public String toString() {
        return "Country{" + "name=" + name + ", reserve=" + reserve + ", resUnit=" + resUnit + ", supply=" + supply + ", supUnit=" + supUnit + '}';
    }

    public double calcTimeleft() {

        return getReserve() / getSupply();
    }
}
