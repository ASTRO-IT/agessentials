package dev.astrogames.agessentials.listeners;

import dev.astrogames.agessentials.main;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import java.util.Collection;

public class JoinListener implements Listener {
    @EventHandler
    public void onJoin(PlayerJoinEvent event){
        Player player = event.getPlayer();
        long firstPlayed = player.getFirstPlayed();

        event.setJoinMessage("");
        player.sendMessage(main.prefix + "Willkommen zurück §b@" + player.getName() + "§7!");


    }
    @EventHandler
    public void onTeamJoin(PlayerJoinEvent event){
        Player player = event.getPlayer();

        if (player.hasPermission("agessentials.team.join"));
        player.sendMessage("");
        player.sendMessage(main.prefix + "§7Willkommen zurück!");
        player.sendMessage(main.prefix + "§cKeine Teameinträge wurden getätigt!");
        player.sendMessage(main.prefix + "§f§oStable agessentials version " + main.Version);
        player.sendMessage("");
        Bukkit.broadcastMessage(main.prefix + "Das Teammitglied §b" + player.getName() + "§7 ist nun §aOnline§7!");


    }
}
