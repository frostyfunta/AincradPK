package io.github.frostyfunta.aincradpk.commands;

import io.github.frostyfunta.aincradpk.AincradPK;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class AincradPKCommandExecutor implements CommandExecutor {
    private final AincradPK plugin;

    public AincradPKCommandExecutor(AincradPK plugin){
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){

        return false;
    }
}
