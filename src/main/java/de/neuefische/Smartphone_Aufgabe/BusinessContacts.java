package de.neuefische.Smartphone_Aufgabe;

public class BusinessContacts extends Contact{
    private String companyName;

    //Methods





//ToString
    @Override
    public String toString() {
        return "BusinessContacts{" +
                "companyName='" + companyName + '\'' +
                ", nameOfContact='" + getNameOfContact() +
                '}';
    }
//Getter/Setter
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
