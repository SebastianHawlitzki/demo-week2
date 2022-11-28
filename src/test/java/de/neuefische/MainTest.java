package de.neuefische;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class MainTest {
    @Test
    void whenAudi1andAudiIsEqual_expectTrue(){
       //Given
        Car audi = new Car("Audi", 1997, "Limousine","Weiß", "A8");

        //When

        //Then
       Car expected = new Car("Audi", 1997, "Limousine","Weiß", "A8");
        Assertions.assertEquals(expected, audi);
    }




}