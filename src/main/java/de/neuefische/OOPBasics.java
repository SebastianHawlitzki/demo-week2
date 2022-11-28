package de.neuefische;


import de.neuefische.model.Student;

public class OOPBasics {
    public static void main(String[] args) {
    // Car-Object
        //Car 1
     Car bmw = new Car("BMW", 2015, "Sedan", "Schwarz","3er");

     String bmwDescription = bmw.describeMe();
        System.out.println(bmwDescription);
        System.out.println("Baujahr: " + bmw.getYear());

        //Car 2
        Car audi = new Car("Audi", 1997, "Limousine","Weiß", "A8");

        String audiDescription = audi.describeMe();
        System.out.println(audiDescription);
        System.out.println("Baujahr: " + audi.getYear());
        System.out.println("Fahrzeugtyp: " + audi.getType());

        // Student-Object
        // Student one
        Student one = new Student(28, "male", "David");

        String studentDescription = one.toString();
        System.out.println(studentDescription);
        System.out.println("Alter: " + one.getAge());
        System.out.println("Geschlecht: " + one.getGender());


    }

}
