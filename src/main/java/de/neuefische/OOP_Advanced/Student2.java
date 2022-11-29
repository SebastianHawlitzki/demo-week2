package de.neuefische.OOP_Advanced;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Objects;
@Data
@AllArgsConstructor
public abstract class Student2 {

    public String getAdress() {
        return "Adresse: Am Weg 8";
    }

    public int getIdentityCardNumber(){
        return 988;
    }


}
