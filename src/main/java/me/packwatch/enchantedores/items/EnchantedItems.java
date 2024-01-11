package me.packwatch.enchantedores.items;

import me.packwatch.enchantedores.utils.Utils;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class EnchantedItems {

    public static ItemStack getEnchCoal(){
        ItemStack i = new ItemStack(Material.COAL);

        ItemMeta m = i.getItemMeta();

        assert m != null;
        m.addEnchant(Enchantment.ARROW_INFINITE, 1, true);
        m.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        m.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

        i.setItemMeta(m);
        m.setDisplayName(Utils.chat("&aEnchanted Coal"));

        return i;
    }

    public static ItemStack getEnchIron(){
        ItemStack i = new ItemStack(Material.IRON_INGOT);

        ItemMeta m = i.getItemMeta();

        assert m != null;
        m.addEnchant(Enchantment.ARROW_INFINITE, 1, true);
        m.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        m.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

        i.setItemMeta(m);
        m.setDisplayName(Utils.chat("&aEnchanted Iron Ingot"));

        return i;
    }

    public static ItemStack getEnchGold(){
        ItemStack i = new ItemStack(Material.GOLD_INGOT);

        ItemMeta m = i.getItemMeta();

        assert m != null;
        m.addEnchant(Enchantment.ARROW_INFINITE, 1, true);
        m.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        m.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

        i.setItemMeta(m);
        m.setDisplayName(Utils.chat("&aEnchanted Gold Ingot"));

        return i;
    }

    public static ItemStack getEnchRedstone(){
        ItemStack i = new ItemStack(Material.REDSTONE);

        ItemMeta m = i.getItemMeta();

        assert m != null;
        m.addEnchant(Enchantment.ARROW_INFINITE, 1, true);
        m.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        m.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

        i.setItemMeta(m);
        m.setDisplayName(Utils.chat("&aEnchanted Redstone"));

        return i;
    }

    public static ItemStack getEnchDiamond(){
        ItemStack i = new ItemStack(Material.DIAMOND);

        ItemMeta m = i.getItemMeta();

        assert m != null;
        m.addEnchant(Enchantment.ARROW_INFINITE, 1, true);
        m.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        m.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

        i.setItemMeta(m);
        m.setDisplayName(Utils.chat("&aEnchanted Diamond"));

        return i;
    }

    public static ItemStack getEnchAmethyst(){
        ItemStack i = new ItemStack(Material.AMETHYST_SHARD);

        ItemMeta m = i.getItemMeta();

        assert m != null;
        m.addEnchant(Enchantment.ARROW_INFINITE, 1, true);
        m.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        m.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

        i.setItemMeta(m);
        m.setDisplayName(Utils.chat("&aEnchanted Amethyst"));

        return i;
    }
}
