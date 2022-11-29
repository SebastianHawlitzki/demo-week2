package de.neuefische.Smartphone_Aufgabe;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Objects;

@Data
public abstract class Contact {

    private String nameOfContact;

//Methods
public String getName(){
    return getName();
}

public String addContact(Contact contact){


    return null;
}

    @Override
    public String toString() {
        return "Contact{" +
                "nameOfContact='" + nameOfContact + '\'' +
                '}';
    }
}
