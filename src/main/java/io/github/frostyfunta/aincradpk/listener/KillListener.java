package io.github.frostyfunta.aincradpk.listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class KillListener implements Listener {
    @EventHandler
    public void playerKilledPlayer(PlayerDeathEvent event){
        Player player = event.getEntity();
        if(player.getKiller()== null){
            return;
        } else {
            Player killer = player.getKiller();
            killer.updateStatus();
        }
    }
}
