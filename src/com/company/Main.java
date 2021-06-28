package com.company;

public class Main {

    public static void main(String[] args) {
        // invoking the constructor that has two arguments (String, String)
        Person personOne = new Person("Paul", "Matthews");
        System.out.println(personOne.getFullName());
        System.out.println(personOne.getInitials());

        // invoking the constructor that has three arguments (String, String, String)
        Person personTwo = new Person("Paul", "David", "Matthews");
        System.out.println(personTwo.getFullName());
        System.out.println(personTwo.getInitials());

        // overloaded .roll() method
//        System.out.println(Dice.roll()); // a number between 1 & 6
//        System.out.println(Dice.roll(100)); // a number between 1 & 100
//        System.out.println(Dice.roll(5, 15)); // a number between 5 & 15
    }
}
