package org.jocker.gens.util;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import javax.annotation.Nullable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ItemCreator {

    public HashMap<String, ItemStack> Items = new HashMap<>();

    public void createItem(String name, String display, @Nullable String lore, Material material, Boolean glowing) {
        ItemStack item = new ItemStack(material);
        ItemMeta meta = item.getItemMeta();

        assert meta != null;
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        meta.setDisplayName(display);
        if(lore != null) {
            List<String> lore1 = Arrays.asList(lore.split("/"));
            meta.setLore(lore1);

        }

        if(glowing) {
            meta.addEnchant(Enchantment.LURE, 1, true);
        }

        item.setItemMeta(meta);
        Items.put(name, item);

    }

    public ItemStack getItem(String name) {
        return Items.get(name);
    }
}
