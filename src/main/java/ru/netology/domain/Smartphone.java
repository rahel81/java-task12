package ru.netology.domain;

import java.util.Objects;

public class Smartphone extends Product{
    private String maker;
    /*private int version;
    private int manufactureYear;*/

    public Smartphone() {
        super();
    }
    public Smartphone(int id, String name, int price, String maker) {
        super(id, name, price);
        this.maker = maker;
       /* this.version = version;
        this.manufactureYear = manufactureYear;*/
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    /*public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }*/

    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Smartphone smartphone = (Smartphone) o;
        return version == smartphone.version &&
                manufactureYear == smartphone.manufactureYear &&
                Objects.equals(maker, smartphone.maker);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), maker, version, manufactureYear);
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "maker='" + maker + '\'' +
                ", version=" + version +
                ", manufacture=" +  +
                '}';
    }*/
    @Override

    public boolean matches(String search) {
        return super.matches(search) || maker.equalsIgnoreCase(search);
    }
}
