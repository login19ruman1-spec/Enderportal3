package com.example.plugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class Enderportal3 extends JavaPlugin {

    @Override
    public void onEnable() {
        // Этот код сработает, когда ваш сервер запустится
        getLogger().info("Привет! Плагин для Purpur 1.21.4 успешно запустился!");
    }

    @Override
    public void onDisable() {
        // Этот код сработает при выключении сервера
        getLogger().info("Пока! Плагин выключился.");
    }
}
