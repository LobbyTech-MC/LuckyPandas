package dev.j3fftw.luckypanda.surprise;

import dev.j3fftw.luckypanda.Utils;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.block.Block;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;

import javax.annotation.Nonnull;

public class PandaBootsSurprise implements Surprise {

    @Nonnull
    @Override
    public NamespacedKey getId() {
        return Utils.getKey("panda_boots");
    }

    @Override
    public void process(@Nonnull Player player, @Nonnull Block block) {
        final ItemStack boots = new ItemStack(Material.LEATHER_BOOTS);
        final ItemMeta itemMeta = boots.getItemMeta();
        final LeatherArmorMeta leatherArmorMeta = (LeatherArmorMeta) itemMeta;
        itemMeta.setDisplayName(ChatColor.BLUE + "Panda boots");
        leatherArmorMeta.setColor(Color.fromRGB(0, 0, 0));
        itemMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 5, true);
        itemMeta.addEnchant(Enchantment.DURABILITY, 10, true);
        itemMeta.addEnchant(Enchantment.MENDING, 1, true);
        itemMeta.addEnchant(Enchantment.SOUL_SPEED, 3, true);
        itemMeta.addEnchant(Enchantment.DEPTH_STRIDER, 3, true);
        itemMeta.addEnchant(Enchantment.PROTECTION_FALL, 5, true);
        Utils.dropItem(player, boots);
    }
}
