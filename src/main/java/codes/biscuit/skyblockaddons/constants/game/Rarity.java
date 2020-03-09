package codes.biscuit.skyblockaddons.constants.game;

import lombok.Getter;

/**
 * Skyblock item rarity definitions
 */
@Getter
public enum Rarity {
    COMMON("COMUM"),
    UNCOMMON("INCOMUM"),
    RARE("RARA"),
    EPIC("ÉPICO"),
    LEGENDARY("LENDÁRIO"),
    SPECIAL("ESPECIAL");

    private String tag;

    Rarity(String s) {
        this.tag = s;
    }
}
