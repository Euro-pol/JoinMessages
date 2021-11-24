package me.timof121.devplugin1;
import org.bukkit.plugin.java.JavaPlugin;

public class Class1 extends JavaPlugin {
    // Triggered when plugin is first enabled
    @Override
    public void onEnable() {
    	getServer().getPluginManager().registerEvents(new Listener1(), this);
    }
    // Triggered when plugin is disabled
    @Override
    public void onDisable() {

    }
}
