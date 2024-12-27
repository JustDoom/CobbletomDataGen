package com.imjustdoom.minestomdatagen.generators;

import com.google.gson.JsonObject;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.registries.BuiltInRegistries;
import com.imjustdoom.minestomdatagen.DataGenerator;

public final class ParticleGenerator extends DataGenerator {
    @Override
    public JsonObject generate() {
        JsonObject particles = new JsonObject();
        var registry = BuiltInRegistries.PARTICLE_TYPE;
        for (var particleType : registry) {
            final var location = registry.getKey(particleType);
            JsonObject particle = new JsonObject();
            particle.addProperty("id", registry.getId(particleType));
            particle.addProperty("hasData", !(particleType instanceof SimpleParticleType));
            particles.add(location.toString(), particle);
        }
        return particles;
    }
}
