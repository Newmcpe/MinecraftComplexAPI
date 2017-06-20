package com.newmcpe.MinecraftComplex;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by Newmcpe on 20.06.2017.
 */
public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        super.onEnable();
        getLogger().info("API Сервера включено!");
    }

    @Override
    public void onDisable() {
        super.onDisable();
        getLogger().info("API Сервера Выключено!");
    }

}
