package de.neuefische.Smartphone_Aufgabe;

import lombok.Data;

import java.util.Arrays;

@Data
public class Smartphone implements Radio, GPS {

//Attribute
    private String nameOfModel;

    private String nameOfManufacturer;

    private Contact [] allContacts;

//Methods
    @Override
    public String getPosition() {
        return "Köln";
    }

    @Override
    public String startRadio() {
        return "Radio started";
    }

    @Override
    public String stopRadio() {
        return "Radio stopped";
    }
//Default-Constructor
    public Smartphone() {
    }

    //Constructor

    public Smartphone(String nameOfModel, String nameOfManufacturer, Contact[] allContacts) {
        this.nameOfModel = nameOfModel;
        this.nameOfManufacturer = nameOfManufacturer;
        this.allContacts = allContacts;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "nameOfModel='" + nameOfModel + '\'' +
                ", nameOfManufacturer='" + nameOfManufacturer + '\'' +
                ", allContacts=" + Arrays.toString(allContacts) +
                '}';
    }
}
