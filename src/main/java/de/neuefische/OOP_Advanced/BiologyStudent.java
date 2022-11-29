package de.neuefische.OOP_Advanced;

import java.util.Objects;

public class BiologyStudent implements Citizen {
    private String name;
    private int age;

    public BiologyStudent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String getAdress() {
        return "Am Weg 3";
    }

    @Override
    public int getIdentityCardNumber() {
        return 989;
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
        return "BiologyStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BiologyStudent that = (BiologyStudent) o;
        return age == that.age && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

}
