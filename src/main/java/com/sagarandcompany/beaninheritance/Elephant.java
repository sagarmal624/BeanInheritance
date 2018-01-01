package com.sagarandcompany.beaninheritance;

public class Elephant extends Animal {
    private String location;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Elephant{" +
                "location='" + location + '\'' + "Animal{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +

                '}';
    }
}