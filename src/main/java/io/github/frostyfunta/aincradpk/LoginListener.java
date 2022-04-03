package io.github.frostyfunta.aincradpk;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class LoginListener implements Listener {
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        event.setJoinMessage("Welcome, " + event.getPlayer().getName());
        checkStatus(event.getPlayer());

    }

    private int checkStatus(Player player){
        String Playername = player.getName();
        String PlayerID = player.getUniqueId().toString();
        Bukkit.getServer().getLogger().info(("playername: " + Playername + "PlayerID: " + PlayerID));
        return 0;
    }

    private int initializeStatus(Player player){
        return 0;
    }
}
