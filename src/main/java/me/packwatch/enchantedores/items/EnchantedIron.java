package me.packwatch.enchantedores.items;

import me.packwatch.enchantedores.utils.Utils;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class EnchantedIron {
    public static ItemStack getEnchIron(){
        ItemStack i = new ItemStack(Material.IRON_INGOT);

        ItemMeta m = i.getItemMeta();

        m.addEnchant(Enchantment.ARROW_INFINITE, 1, true);
        m.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        m.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

        i.setItemMeta(m);
        m.setDisplayName(Utils.chat("&aEnchanted Iron"));

        return i;
    }
}
