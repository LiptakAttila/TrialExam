package com.gfa.exam.Pirate;

import java.util.ArrayList;
import java.util.List;

public class Ship {

    protected List<Pirate> crew = new ArrayList<>();
    Captain captain = null;

    public boolean addPirate(Pirate pirate) {
        if (captain != null) {
            if (pirate == captain) {
                return false;
            }
            crew.add(captain);
            crew.add(pirate);
            return true;
        } else {
            crew.add(pirate);
            return true;
        }
    }

    public List<Pirate> getCrew() {
        return crew;
    }

    public int getCrewSize() {
        return crew.size();
    }

    public List<String> getPoorPirates() {
        List<String> nameOfPoorPirates = new ArrayList<>();
        for (Pirate pirate : crew) {
            if (pirate.isPoor()) {
                nameOfPoorPirates.add(pirate.getName());
            }
        }
        return nameOfPoorPirates;
    }

    public int getTotalGold() {
        int totalGoldOfPiratesOnShip = 0;
        for (Pirate pirate : crew) {
            totalGoldOfPiratesOnShip += pirate.getGoldAmount();
        }
        return totalGoldOfPiratesOnShip;
    }

    public void lastDayOnTheShip() {
        for (Pirate pirate : crew) {
            pirate.party();
        }
    }

    public void prepareForBattle() {
        for (Pirate pirate : crew) {
            for (int i = 0; i < 5; i++) {
                pirate.work();
            }
            lastDayOnTheShip();
        }
    }
}
