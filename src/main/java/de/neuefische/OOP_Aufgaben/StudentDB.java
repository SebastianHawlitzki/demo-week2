package de.neuefische.OOP_Aufgaben;


import de.neuefische.OOP.Student;
import lombok.ToString;

@ToString
public class StudentDB {

private Student[] stundetsArray;

//Konstruktor
    public StudentDB(Student[] stundetsArray) {
        this.stundetsArray = stundetsArray;
    }
// Methoden

    public Student[] getAllStudents() {
        return this.stundetsArray;

    }
    public Student randomStudent(){
        int randomNum = (int) (Math.random() * this.stundetsArray.length);
            return this.stundetsArray[randomNum];
        }


    }


