package de.neuefische.aufgaben;


import de.neuefische.model.Student;
import lombok.ToString;

@ToString
public class StudentDB {
private Student[] stundetsArray;

    public StudentDB(Student[] stundetsArray) {
        this.stundetsArray = stundetsArray;
    }


    public Student[] getAllStudents() {
        return this.stundetsArray;

    }
    public Student randomStudent(){
        int randomNum = (int) (Math.random() * this.stundetsArray.length);
            return this.stundetsArray[randomNum];
        }


    }


