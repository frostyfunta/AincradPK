package io.github.frostyfunta.aincradpk.listener;

import io.github.frostyfunta.aincradpk.PlayerHash;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import java.util.HashMap;
import java.util.UUID;

public class LoginListener implements Listener {
    PlayerHash map = new PlayerHash();
    HashMap<UUID, Integer> remainingDays = map.getRemainingDays();

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        if(!remainingDays.containsKey(event.getPlayer().getUniqueId())) {
            UUID playerID = event.getPlayer().getUniqueId();
            remainingDays.put(playerID, 0);
            Bukkit.getServer().getLogger().info(event.getPlayer().getName() + " has been added to the Hashmap.");
        } else {
            Bukkit.getServer().getLogger().info(event.getPlayer().getName() + " was already added to the Hashmap.");
        }
    }
/*
    public int checkStatus(Player player){
        if(!remainingDays.containsKey(player.getUniqueId())){
            Bukkit.getServer().getLogger().info("This player does not have a PVP-Status");
            return 0;
        } else {
            int dayCycles = remainingDays.get(player.getUniqueId());
            if(dayCycles == 0) {
                Bukkit.getServer().getLogger().info("This player is green");
                return 1;
            }else if(dayCycles <= 72){
                Bukkit.getServer().getLogger().info("This player is orange");
                return 2;
            }else if(dayCycles > 72){
                Bukkit.getServer().getLogger().info("This player is red");
                return 3;
            }
        }
        return 0;
    }
*/

}
