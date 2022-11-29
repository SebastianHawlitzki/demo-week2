package de.neuefische.OOP_Advanced;

import java.util.Objects;

public class  ComputerScienceStudent implements Citizen {
    private String name;
    private int age;

    public ComputerScienceStudent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String getAdress() {
        return "Am Weg 19A";
    }

    @Override
    public int getIdentityCardNumber() {
        return 647;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "ComputerScienceStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComputerScienceStudent that = (ComputerScienceStudent) o;
        return age == that.age && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }


}
