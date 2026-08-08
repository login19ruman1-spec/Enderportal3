package com.example.plugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class Enderportal3 extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Плагин Enderportal3 успешно запущен на Purpur 1.21.4!");
    }

    @Override
    public void onDisable() {
        getLogger().info("Плагин Enderportal3 выключен.");
    }
}
