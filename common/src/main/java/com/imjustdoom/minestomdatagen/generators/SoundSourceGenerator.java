package com.imjustdoom.minestomdatagen.generators;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import net.minecraft.sounds.SoundSource;
import com.imjustdoom.minestomdatagen.DataGenerator;

public final class SoundSourceGenerator extends DataGenerator {
    @Override
    public JsonArray generate() {
        JsonArray sounds = new JsonArray();
        for (SoundSource ss : SoundSource.values()) {
            JsonObject soundSource = new JsonObject();
            soundSource.addProperty("id", ss.ordinal());
            soundSource.addProperty("type", ss.getName());
            sounds.add(soundSource);
        }
        return sounds;
    }
}
