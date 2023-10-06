package com.gfa.exam.Pirate;

import java.util.ArrayList;
import java.util.List;

public class Ship {

    List<Pirate> crew = new ArrayList<>();
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
}
