package com.jyo.cf.demo.rest.domain;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Jyotsna R on 1/12/15.
 */
public class Person {

    private String firstName;
    private String lastName;
    private String address;
    private String title;

    public Person() {
    }

    public Person(String firstName, String lastName, String address, String title) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.title = title;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
