
package com.dinnerbone.bukkit.sample;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class SamplePosCommand extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getLogger().info("[MBHV] Protection has been enabled!");
        getServer().getPluginManager().registerEvents(this, this);
    }

    @Override
    public void onDisable() {
        getLogger().info("[MBHV] Protection has been disabled!");
    }

    @EventHandler
    public void onPlayerMove(PlayerMoveEvent event) {
        if (event.getTo() != null) {
            double x = event.getTo().getX();
            double y = event.getTo().getY();
            double z = event.getTo().getZ();
            String playerName = event.getPlayer().getName();
            getLogger().info(playerName + " moved to X:" + x + ", Y:" + y + ", Z:" + z);
        }
    }
}

