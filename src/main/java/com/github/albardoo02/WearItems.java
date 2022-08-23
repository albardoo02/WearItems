package com.github.albardoo02;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class WearItems extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info(ChatColor.translateAlternateColorCodes('&',"&eプラグインが起動しました"));

        getCommand("wear").setExecutor(new WearCommandExecutor());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info(ChatColor.translateAlternateColorCodes('&',"&eプラグインが停止しました"));
    }
}
