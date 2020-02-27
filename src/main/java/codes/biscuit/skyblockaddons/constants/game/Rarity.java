package codes.biscuit.skyblockaddons.constants.game;

import lombok.Getter;

/**
 * Skyblock item rarity definitions
 */
@Getter
public enum Rarity {
    COMMON("§f§lCOMUM"),
    UNCOMMON("§a§lINCOMUM"),
    RARE("§9§lRARO"),
    EPIC("§5§lÉPICO"),
    LEGENDARY("§6§lLENDÁRIO"),
    SPECIAL("§d§lESPECIAL");

    private String tag;

    Rarity(String s) {
        this.tag = s;
    }
}
