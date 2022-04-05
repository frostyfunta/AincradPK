package io.github.frostyfunta.aincradpk;

import java.util.HashMap;
import java.util.UUID;

public class PlayerHash {
    private static HashMap<UUID, Integer> remainingDays = new HashMap<UUID, Integer>();

    public HashMap<UUID, Integer> getRemainingDays(){
        return remainingDays;
    }
}
