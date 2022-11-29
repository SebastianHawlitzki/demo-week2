package de.neuefische.Smartphone_Aufgabe;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class Friend extends Contact {
    //Attribute

    private int phoneNumber;

    //Methods
    @Override
    public String getName() {
        return super.getName();
    }
//Empty Constructor

    public Friend() {
    }

    // Constructor

    public Friend(String nameOfContact, int phoneNumber) {
        this.setNameOfContact(nameOfContact);
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Friend{" +
                "phoneNumber=" + phoneNumber  + '\'' +
                ", nameOfContact='" + getNameOfContact() +
                '}';
    }
}

