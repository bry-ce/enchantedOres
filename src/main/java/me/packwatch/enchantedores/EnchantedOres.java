package me.packwatch.enchantedores;

import me.packwatch.enchantedores.commands.GiveOre;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;


public final class EnchantedOres extends JavaPlugin {

    @Override
    public void onEnable() {
        Objects.requireNonNull(getCommand("giveore")).setExecutor(new GiveOre());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
