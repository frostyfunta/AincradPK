package io.github.frostyfunta.aincradpk;

import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.UUID;
import java.time.*;

public class PlayerHash {
    private static HashMap<UUID, String> remainingDays = new HashMap<UUID, String>();

    public HashMap<UUID, String> getRemainingDays(){
        return remainingDays;
    }
    /*
    public static int updateStatus(UUID player, int amountAdded, char timeUnit){
        LocalDateTime playerTime = LocalDateTime.parse(remainingDays.get(player));
        if(playerTime.isBefore(LocalDateTime.now())){ //if player has no PVP penalty => playerTime has to be set to current Time before adding penalty
            playerTime = LocalDateTime.now();
        }
        switch(timeUnit){
            case 'd':

                break;
            case 't':

                break;
        }
        return 1;
    }
    */

    public static void updateStatus(UUID player){
        LocalDateTime playerTime = LocalDateTime.parse(remainingDays.get(player));
        if(playerTime.isBefore(LocalDateTime.now())){ //if player has no PVP penalty => playerTime has to be set to current Time before adding penalty
            playerTime = LocalDateTime.now();
        }
        playerTime.plusDays(1);

        /*Date convertedDate = Date.from(playerTime.atZone(ZoneId.systemDefault()).toInstant());
        Calendar c = Calendar.getInstance(); //increments PVP penalty timer by one day
        c.setTime(convertedDate);
        c.add(Calendar.DATE, 1);*/

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("uuuu/MM/dd HH:mm:ss");
        remainingDays.put(player, dtf.format(playerTime));
    }

}
