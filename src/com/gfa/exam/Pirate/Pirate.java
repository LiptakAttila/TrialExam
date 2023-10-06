package com.gfa.exam.Pirate;

public class Pirate {
    private String name;
    private int goldAmount;
    private int healthPoint;
    Pirate captain = new Pirate("The Captain");

    public boolean hasWoodenLeg() {
        return true;
    }

    public Pirate(String name) {
        this.name = name;
        this.goldAmount = 0;
        this.healthPoint = 20;
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
