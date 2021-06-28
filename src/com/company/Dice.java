package com.company;

public class Dice {

    // achieving abstraction via encapsulation -- the end user of the Dice class doesn't need to know how we calculate a random Int between two values.
    // also to protect our getRandomInt method it is hidden using a private method -- we don't want any user accessing this method it's just for us
    private static int getRandomInt(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    // overloaded roll() method that takes no arguments
    public static int roll() {
        // random number between 1 - 6 (rolling a single D6)
        return getRandomInt(1, 6);
    }

    // overloaded roll() method that takes 1 int argument
    public static int roll(int ceiling) {
        // random number between 1 - ceiling
        return getRandomInt(1, ceiling);
    }

    // overloaded roll() method that takes 2 int arguments
    public static int roll(int floor, int ceiling) {
        // random number between floor - ceiling
        return getRandomInt(floor, ceiling);
    }
}
