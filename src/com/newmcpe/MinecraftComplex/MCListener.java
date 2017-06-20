package com.newmcpe.MinecraftComplex;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

/**
 * Created by Newmcpe on 20.06.2017.
 */
public class MCListener implements Listener {
    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        e.getPlayer().sendMessage("§aПривет, "+e.getPlayer().getDisplayName());
    }
}
