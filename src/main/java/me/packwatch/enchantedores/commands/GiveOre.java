package me.packwatch.enchantedores.commands;

import me.packwatch.enchantedores.items.EnchantedCoal;
import me.packwatch.enchantedores.items.EnchantedIron;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.Arrays;


public class GiveOre implements CommandExecutor {
    private ItemStack item;

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if(!(sender instanceof Player)){return true;}
        Player p = (Player) sender;

        if(!(p.hasPermission("enchantedores.give.ore"))){ return true;}
        if(args.length == 1){
            if (args[0].equalsIgnoreCase("coal")){
                p.getInventory().addItem(EnchantedCoal.getEnchCoal());
            } else if (args[0].equalsIgnoreCase("iron")){
                p.getInventory().addItem(EnchantedIron.getEnchIron());
            }

        }


        return true;
    }
}
