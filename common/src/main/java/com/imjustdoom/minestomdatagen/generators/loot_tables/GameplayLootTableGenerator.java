package com.imjustdoom.minestomdatagen.generators.loot_tables;

import com.google.gson.JsonObject;
import com.imjustdoom.minestomdatagen.DataGenerator;

public final class GameplayLootTableGenerator extends DataGenerator {
    @Override
    public JsonObject generate() {
        return mergePath(LOOT_TABLES_FOLDER.resolve("gameplay"));
    }
}
