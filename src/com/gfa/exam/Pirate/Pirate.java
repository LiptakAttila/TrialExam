package com.gfa.exam.Pirate;

public class Pirate {
    private String name;
    protected int goldAmount;
    protected int healthPoint;
    private boolean hasWoodenLeg;

    public Pirate(String name) {
        this.name = name;
        this.goldAmount = 0;
        this.healthPoint = 20;
        this.hasWoodenLeg = false;
    }

    public Pirate() {

    }

    public void work() {
        goldAmount += 1;
        healthPoint -= 1;
    }

    public void party() {
        healthPoint += 1;
    }

    public String toString() {
        if (hasWoodenLeg == true) {
            return "Hello, I am " + getName() + ". I have a wooden leg and " + getGoldAmount() + " amount of gold.";
        }
        return "Hello, I am " + getName() + ". I still have my real legs and " + getGoldAmount() + " amount of gold.";
    }

    public boolean isPoor() {
        if (hasWoodenLeg == true && getGoldAmount() < 15) {
            return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public int getGoldAmount() {
        return goldAmount;
    }

    public int getHealthPoint() {
        return healthPoint;
    }
}
