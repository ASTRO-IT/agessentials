package dev.astrogames.agessentials.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class DeathListener implements Listener {
    public void onDeath(PlayerDeathEvent event){
        event.setDeathMessage("");
        event.setKeepInventory(false);
    }
}
