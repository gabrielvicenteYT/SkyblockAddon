package codes.sovacos.skyblockaddons.constants.game;

import lombok.Getter;

/**
 * Skyblock item rarity definitions
 */
@Getter
public enum Rarity {
    COMUM("COMUM"),
    INCOMUM("INCOMUM"),
    RARA("RARA"),
    EPICO("ÉPICO"),
    LENDARIO("LENDÁRIO"),
    ESPECIAL("ESPECIAL"),
    EXCLUSIVO("EXCLUSIVO");

    private String tag;

    Rarity(String s) {
        this.tag = s;
    }
}
