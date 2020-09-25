package com.epam.upskills.base;

import java.io.IOException;

public class Person extends Object {
    private String personId;
    private String lastName;
    public static String faculty;

    public Person() {
        super();
    }

    public Person(String personId1, String lastName) {
        this.personId = personId1;
        this.lastName = lastName;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        if(personId == null){
            System.out.println("Wrong input");;
        }
        this.personId = personId;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public static String getFaculty() {
        return faculty;
    }

    public static void setFaculty(String faculty) {
        Person.faculty = faculty;
    }

    //@Override
    public String toString() {
        return "Person{" +
                "personId='" + personId + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
