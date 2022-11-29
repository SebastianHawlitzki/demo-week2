package de.neuefische.Smartphone_Aufgabe;

public class BusinessContacts extends Contact{
    private String companyName;

    //Methods
    public String addContacts(){
return null;
    }

    @Override
    public String toString() {
        return "BusinessContacts{" +
                "companyName='" + companyName + '\'' + getNameOfContact() +
                '}';
    }
}
