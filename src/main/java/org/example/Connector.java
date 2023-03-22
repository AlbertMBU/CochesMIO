package org.example;

import java.util.ArrayList;
import java.util.List;


public class Connector {
    //fields
    private String name;
    private int type;
    private int id;
    private String country;
    private int CodePostal;
    private String city;
    private String street;
    private int streetNumber;

    //constructor
    public Connector(String name, int type, int id, String country, int CodePostal, String city, String street, int streetNumber) {
        this.name = name;
        this.type = type;
        this.id = id;
        this.country = country;
        this.CodePostal = CodePostal;
        this.city = city;
        this.street = street;
        this.streetNumber = streetNumber;
    }
    //methods
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getType() {
        return type;
    }
    public void setType(int type) {
        this.type = type;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public int getCodePostal() {
        return CodePostal;
    }
    public void setCodePostal(int codePostal) {
        CodePostal = codePostal;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public int getStreetNumber() {
        return streetNumber;
    }
    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }
    public static void main(String[] args) {
        System.out.println("Type connector");
    }
}
