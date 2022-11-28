package de.neuefische;


public class OOPBasics {
    public static void main(String[] args) {
     Car bmw = new Car();
     bmw.brand = "BMW";
     bmw.year = 2015;
     bmw.type = "Sedan";
     bmw.color = "Schwarz";
     bmw.model = "3er";

     String bmwDescription = bmw.describeMe();
        System.out.println(bmwDescription);
        System.out.println("Baujahr: " + bmw.year);

        Car audi = new Car();
        audi.brand = "Audi";
        audi.year = 1997;
        audi.type = "Limousine";
        audi.color = "Weiß";
        audi.model = "A8";

        String audiDescription = audi.describeMe();
        System.out.println(audiDescription);
        System.out.println("Baujahr: " + audi.year);
        System.out.println("Fahrzeugtyp: " + audi.type);

    }

}
