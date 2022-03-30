package io.github.frostyfunta.aincradpk;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class LoginListener implements Listener {
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        event.setJoinMessage("Welcome, " + event.getPlayer().getName());
    }

    private int checkStatus(Player player){
        player.getName();
        return 0;
    }

    private int initializeStatus(Player player){
        return 0;
    }
}
