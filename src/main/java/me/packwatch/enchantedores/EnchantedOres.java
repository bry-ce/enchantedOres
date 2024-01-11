package me.packwatch.enchantedores;

import me.packwatch.enchantedores.commands.GiveOre;
import org.bukkit.plugin.java.JavaPlugin;

public final class EnchantedOres extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("giveore").setExecutor(new GiveOre());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
