package org.jocker.gens.generator;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class Generator {

    private final String name;
    private final ItemStack block;
    private final Long sell;
    private final int upgarde;
    private final Material next;
    private final Material drop;

    public Generator(String name, ItemStack block, Long sell, int upgarde, Material next, Material drop) {
        this.name = name;
        this.block = block;
        this.sell = sell;
        this.upgarde = upgarde;
        this.next = next;
        this.drop = drop;
    }
}
