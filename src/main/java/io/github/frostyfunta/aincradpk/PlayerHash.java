package io.github.frostyfunta.aincradpk;

import java.util.HashMap;
import java.util.UUID;

public class PlayerHash {
    private static HashMap<UUID, Integer> remainingDays = new HashMap<UUID, Integer>();

    public HashMap<UUID, Integer> getRemainingDays(){
        return remainingDays;
    }

    public static int updateStatus(UUID player, int amountAdded, char timeUnit){
        int before = remainingDays.get(player);
        switch(timeUnit){
            case 'd':
                remainingDays.put(player, before + amountAdded);
        }
        return 1;
    }
}
