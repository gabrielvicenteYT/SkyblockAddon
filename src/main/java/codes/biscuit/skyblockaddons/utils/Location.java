package codes.biscuit.skyblockaddons.utils;

import lombok.Getter;

/**
 * Contains all of the Skyblock locations (I hope).
 */
@Getter
public enum Location {
    ISLAND("Sua ilha"),

    // Hub
    AUCTION_HOUSE("Casa de Leilões"),
    BANK("Banco"),
    CANVAS_ROOM("Canvas Room"),
    COAL_MINE("Mina de Carvão"),
    COLOSSEUM("Arena"),
    RANCH("Rancho"),
    FASHION_SHOP("Fashion Shop"),
    FISHERMANS_HUT("Fisherman's Hut"),
    FLOWER_HOUSE("Flower House"),
    FOREST("Floresta"),
    GRAVEYARD("Cemitério"),
    HIGH_LEVEL("High Level"),
    LIBRARY("Livraria"),
    MOUNTAIN("Mountain"),
    RUINS("Ruins"),
    TAVERN("Tavern"),
    VILLAGE("Vilarejo"),
    WILDERNESS("Wilderness"),
    WIZARD_TOWER("Wizard Tower"),

    // The Park
    BIRCH_PARK("Birch Park"),
    SPRUCE_WOODS("Spruce Woods"),
    SAVANNA_WOODLAND("Savanna Woodland"),
    DARK_THICKET("Dark Thicket"),
    JUNGLE_ISLAND("Jungle Island"),

    // Deep Caverns
    MINE("A Grande Mina"),
    GOLD_MINE("Mina de Ouro"),
    LAPIS_MINE("Mina de Lápis"),
    REDSTONE_MINE("Mina de Redstone"),
    EMERALD_MINE("Mina de Esmeralda"),
    DIAMOND_MINE("Mina de Diamante"),
    OBSIDIAN_MINE("Mina de Obsidian"),

    FARM("Fazenda"),

    CANYON("Cânion"),

    SPIDERS_DEN("Covil das Aranhas"),

    NETHER("Nether"),

    // The End
    THE_END("The End"),
    DRAGONS_NEST("Dragon's Nest"),

    // Jerry's workshop
    JERRY_POND("Jerry Pond"),
    JERRYS_WORKSHOP("Jerry's Workshop"),

    NONE("Nenhum");

    /**
     * The name of this location as shown on the in-game scoreboard.
     */
    private String scoreboardName;

    Location(String scoreboardName) {
        this.scoreboardName = scoreboardName;
    }
}
