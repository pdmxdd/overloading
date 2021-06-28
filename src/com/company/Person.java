package com.company;

public class Person {

    private String firstName;
    private String middleName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public String getFullName() {
        if(this.middleName == null) {
            return this.firstName + " " + this.lastName;
        }
        return this.firstName + " " + this.middleName + " " + this.lastName;
    }

    public String getInitials() {
        return this.firstName.substring(0, 1) + "." + ((this.middleName != null) ? this.middleName.substring(0, 1) + "." : "") + this.lastName.substring(0, 1) + ".";
    }
}
