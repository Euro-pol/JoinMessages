package me.timof121.devplugin1;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class Listener1 implements Listener {
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event) {
		event.setJoinMessage("\247a (+) " + event.getPlayer().getName());
	}
	
	@EventHandler
    public void onPlayerQuir(PlayerQuitEvent event) {
        event.setQuitMessage("\247c (-) " + event.getPlayer().getName());
    }
}
