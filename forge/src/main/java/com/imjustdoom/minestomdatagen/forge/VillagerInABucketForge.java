package com.imjustdoom.minestomdatagen.forge;

import com.imjustdoom.minestomdatagen.VillagerInABucket;
import com.imjustdoom.minestomdatagen.item.custom.VillagerBucket;
import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import java.io.IOException;

@Mod(VillagerInABucket.MOD_ID)
public class VillagerInABucketForge {
    public VillagerInABucketForge() {

        IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();
        modBus.addListener((FMLCommonSetupEvent e) -> {
            try {
                VillagerInABucket.start();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(VillagerInABucket.MOD_ID, modBus);

        VillagerInABucket.init();
    }
}
