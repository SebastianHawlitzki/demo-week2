package de.neuefische.OOP_Advanced;


public class MainOOPAdvanced {
    public static void main(String[] args) {

        //Aufgabe 1

        ComputerScienceStudent andre = new ComputerScienceStudent("Andre", 30);
        ComputerScienceStudent luisa = new ComputerScienceStudent("Luisa", 24);
        BiologyStudent greta = new BiologyStudent("Greta", 22);
        BiologyStudent lukas = new BiologyStudent("Lukas", 28);

        Citizen[] citizenArray = {andre, luisa, greta, lukas};

        // Aufgabe 2, instanziere einen Comp-Student

        Student2 alfons = new ComputerScienenceStuden2("Alfons", 24);
        System.out.println(alfons.getAdress());
    }
}
