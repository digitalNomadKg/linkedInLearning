package oop.encapsulation;

import java.util.ArrayList;

public class Arthropods {

    private String name, type;
    private int livingPeriod;

    public Arthropods(String name, String type, int livingPeriod) {
        this.name = name;
        this.type = type;
        this.livingPeriod = livingPeriod;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getLivingPeriod() {
        return livingPeriod;
    }

    public void setLivingPeriod(int livingPeriod) {
        this.livingPeriod = livingPeriod;
    }



}


