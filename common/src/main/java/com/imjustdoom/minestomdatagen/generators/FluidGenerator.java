package com.imjustdoom.minestomdatagen.generators;

import com.google.gson.JsonObject;
import net.minecraft.core.registries.BuiltInRegistries;
import com.imjustdoom.minestomdatagen.DataGenerator;

public final class FluidGenerator extends DataGenerator {
    @Override
    public JsonObject generate() {
        JsonObject fluids = new JsonObject();
        var registry = BuiltInRegistries.FLUID;
        var itemRegistry = BuiltInRegistries.ITEM;
        for (var fluid : registry) {
            final var location = registry.getKey(fluid);
            JsonObject fluidJson = new JsonObject();
            fluidJson.addProperty("bucketId", itemRegistry.getKey(fluid.getBucket()).toString());
            fluids.add(location.toString(), fluidJson);
        }
        return fluids;
    }
}
