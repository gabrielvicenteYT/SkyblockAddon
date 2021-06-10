package codes.sovacos.skyblockaddons.constants.game;

import lombok.Getter;

/**
 * Definir a raridade de itens
 */
@Getter
public enum Raridade {
    COMUM("COMUM"),
    INCOMUM("INCOMUM"),
    RARA("RARA"),
    EPICO("ÉPICO"),
    LENDARIO("LENDÁRIO"),
    ESPECIAL("ESPECIAL"),
    EXCLUSIVO("EXCLUSIVO");

    private String tag;

    Raridade(String s) {
        this.tag = s;
    }
}
