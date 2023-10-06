package com.gfa.exam.Pirate;

public class Captain extends Pirate{
    public Captain(String name) {
        super(name);
    }

    @Override
    public void work() {
        super.work();
        goldAmount += 4;
        healthPoint -= 3;
    }

    @Override
    public void party() {
        healthPoint += 5;
    }
}
