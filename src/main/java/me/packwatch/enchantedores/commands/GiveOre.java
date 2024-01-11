package me.packwatch.enchantedores.commands;

import me.packwatch.enchantedores.items.EnchantedItems;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;


public class GiveOre implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if(!(sender instanceof Player)){return true;}
        Player p = (Player) sender;

        if(!(p.hasPermission("enchantedores.give.ore"))){ return true;}
        if(args.length == 1){
            if (args[0].equalsIgnoreCase("coal")){
                p.getInventory().addItem(EnchantedItems.getEnchCoal());
            } else if (args[0].equalsIgnoreCase("iron")){
                p.getInventory().addItem(EnchantedItems.getEnchIron());
            } else if (args[0].equalsIgnoreCase("gold")){
                p.getInventory().addItem(EnchantedItems.getEnchGold());
            } else if (args[0].equalsIgnoreCase("redstone")){
                p.getInventory().addItem(EnchantedItems.getEnchRedstone());
            } else if (args[0].equalsIgnoreCase("diamond")){
                p.getInventory().addItem(EnchantedItems.getEnchDiamond());
            } else if (args[0].equalsIgnoreCase("amethyst")){
                p.getInventory().addItem(EnchantedItems.getEnchAmethyst());
            }

        }


        return true;
    }
}
