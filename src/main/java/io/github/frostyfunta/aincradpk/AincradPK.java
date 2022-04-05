package io.github.frostyfunta.aincradpk;

import io.github.frostyfunta.aincradpk.scrap.KillListener;
import org.bukkit.plugin.java.JavaPlugin;

public class AincradPK extends JavaPlugin {


    @Override
    public void onEnable(){
        getLogger().info("onEnable is called !");
        getServer().getPluginManager().registerEvents(new KillListener(), this);

    }
    @Override
    public void onDisable() {
        getLogger().info("onDisable is called!");
    }

}


