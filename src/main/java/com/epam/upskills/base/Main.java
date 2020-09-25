package com.epam.upskills.base;

public class Main {
    public static void main(String[] args) {
        Person person;
        person = new Person();
        Person.faculty = "MMF";
        Person person1 = new Person("123PB2","Brodau");
        System.out.println(person1.toString());
    }
}

