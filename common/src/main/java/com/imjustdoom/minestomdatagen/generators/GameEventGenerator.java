package com.imjustdoom.minestomdatagen.generators;

import com.google.gson.JsonObject;
import net.minecraft.core.registries.BuiltInRegistries;
import com.imjustdoom.minestomdatagen.DataGenerator;

public final class GameEventGenerator extends DataGenerator {
    @Override
    public JsonObject generate() {
        JsonObject gameEvents = new JsonObject();
        var registry = BuiltInRegistries.GAME_EVENT;
        for (var gameEvent : registry) {
            final var location = registry.getKey(gameEvent);
            JsonObject gameEventJson = new JsonObject();
            gameEventJson.addProperty("id", registry.getId(gameEvent));
            gameEventJson.addProperty("notificationRadius", gameEvent.notificationRadius());
            gameEvents.add(location.toString(), gameEventJson);
        }
        return gameEvents;
    }
}
