package dev.astrogames.agessentials.listeners;

import dev.astrogames.agessentials.main;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class QuitListener implements Listener {
    @EventHandler
    public void onQuit(PlayerQuitEvent event){
        Player player = event.getPlayer();

        event.setQuitMessage("");


    }
    @EventHandler
    public void onTeamQuit(PlayerQuitEvent event){

        Player player = event.getPlayer();
        if (player.hasPermission("agessentials.team.quit"));

        Bukkit.broadcastMessage(main.prefix + "Das Teammitglied §b" + player.getName() + "§7 ist nun §cOffline§7!");

    }

}
