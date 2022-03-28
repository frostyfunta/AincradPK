package io.github.frostyfunta.aincradpk;

import org.bukkit.plugin.java.JavaPlugin;

public class AincradPK extends JavaPlugin {
    @Override
    public void onEnable(){
        getLogger().info("onEnable is called !");
        getServer().getPluginManager().registerEvents(new LoginListener(), this);
    }
    @Override
    public void onDisable() {
        getLogger().info("onDisable is called!");
    }

}


