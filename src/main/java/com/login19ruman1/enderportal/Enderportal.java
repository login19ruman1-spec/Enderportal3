package com.login19ruman1.enderportal;

import org.bukkit.plugin.java.JavaPlugin;

public final class Enderportal extends JavaPlugin {

    @Override
    public void onEnable() {
        // Код при запуске плагина на сервере
        getLogger().info("Плагин Enderportal успешно загружен на Purpur 1.21.4!");
    }

    @Override
    public void onDisable() {
        // Код при выключении плагина
        getLogger().info("Плагин Enderportal выключен.");
    }
}
