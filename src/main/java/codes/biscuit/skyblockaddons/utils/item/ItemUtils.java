package codes.sovacos.skyblockaddons.utils.item;

import codes.sovacos.skyblockaddons.constants.game.Raridade;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraftforge.common.util.Constants;

import java.util.EnumSet;

/**
 * Utility methods for Skyblock Items
 */
public class ItemUtils {

    /**
     * Returns the rarity of a given Skyblock item
     *
     * @param item the Skyblock item to check
     * @return the rarity of the item if a valid rarity is found, {@code INVALID} if no rarity is found, {@code null} if item is {@code null}
     */
    public static Raridade getRaridade(ItemStack item) {
        if (item == null || !item.hasTagCompound()) {
            return null;
        }

        NBTTagCompound display = item.getSubCompound("display", false);

        if (display == null || !display.hasKey("Lore")) {
            return null;
        }

        NBTTagList lore = display.getTagList("Lore", Constants.NBT.TAG_STRING);

        // Determina a raridade do item.
        for (int i = 0; i < lore.tagCount(); i++) {
            String currentLine = lore.getStringTagAt(i);

            for (Raridade raridade : EnumSet.allOf(Raridade.class)) {
                if (currentLine.contains(raridade.getTag())) {
                    return raridade;
                }
            }
        }

        // Se o item não tiver uma raridade invalida, INVALID
        return null;
    }

    /**
     * Returns the Skyblock Item ID of a given Skyblock item
     *
     * @param item the Skyblock item to check
     * @return the Skyblock Item ID of this item
     */
    public static String getSkyBlockItemID(final ItemStack item) {
        if (item == null) return null;
        if (item.hasTagCompound()) {
            NBTTagCompound skyBlockData = item.getTagCompound();
            return skyBlockData.getString("CONSTANT_ITEM_ID");
        }
        return null;
    }

}
