package io.github.frostyfunta.aincradpk.scrap;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class KillListener implements Listener{
    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent event){
        Player player = event.getEntity();
        Player killer = player.getKiller();
        //killer.updateStatus(player);
    }

    public void updateStatus(Player killed){

    }
}
