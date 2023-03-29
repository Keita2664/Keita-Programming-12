package com.keita.module2.assignment21;

public class Planet {
    private String designation;
    private double massKg;
    private double orbitEarthYears;
    private PlanetType type;

    public Planet(String designation, PlanetType type){
        this.designation = designation;
        this.type = type;
    }

    public Planet(String designation, double massKg, double orbitEarthYears, PlanetType type){
        this.designation = designation;
        this.massKg = massKg;
        this.orbitEarthYears = orbitEarthYears;
        this.type = type;
    }

    @Override
    public int hashCode() {
        return designation.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Planet){
            Planet other = (Planet) obj;
            if (designation == other.designation){
                return true;
            }
        }
        return false;
    }

    public String toString(){
        return "designation: " + designation + " type: " + type;
    }
}
