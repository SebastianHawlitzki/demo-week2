package de.neuefische.OOP_Advanced;

import java.util.Objects;


public class ComputerScienenceStuden2 extends Student2{

    private String name;
    private int age;

    public ComputerScienenceStuden2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String getAdress() {
        return super.getAdress();

    }
    @Override
    public int getIdentityCardNumber() {
        return super.getIdentityCardNumber();
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
        return "ComputerScienenceStuden2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComputerScienenceStuden2 that = (ComputerScienenceStuden2) o;
        return age == that.age && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

