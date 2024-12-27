package com.imjustdoom.minestomdatagen.generators;

import com.google.gson.JsonObject;
import net.minecraft.core.registries.BuiltInRegistries;
import com.imjustdoom.minestomdatagen.DataGenerator;

public final class PotionGenerator extends DataGenerator {
    @Override
    public JsonObject generate() {
        JsonObject potions = new JsonObject();
        var registry = BuiltInRegistries.POTION;
        for (var potion : registry) {
            final var location = registry.getKey(potion);
            JsonObject effect = new JsonObject();
            effect.addProperty("id", registry.getId(potion));
            // TODO add effects
            potions.add(location.toString(), effect);
        }
        return potions;
    }
}
