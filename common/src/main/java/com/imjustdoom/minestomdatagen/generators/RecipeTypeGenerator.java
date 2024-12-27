package com.imjustdoom.minestomdatagen.generators;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.crafting.RecipeSerializer;
import com.imjustdoom.minestomdatagen.DataGenerator;

public final class RecipeTypeGenerator extends DataGenerator {
    @Override
    public JsonArray generate() {
        JsonArray recipeTypes = new JsonArray();

        Registry<RecipeSerializer<?>> registry = BuiltInRegistries.RECIPE_SERIALIZER;
        for (RecipeSerializer<?> recipeSerializer : registry) {
            JsonObject recipeType = new JsonObject();
            recipeType.addProperty("id", registry.getId(recipeSerializer));
            recipeType.addProperty("name", registry.getKey(recipeSerializer).toString());
            recipeTypes.add(recipeType);
        }
        return recipeTypes;
    }
}
