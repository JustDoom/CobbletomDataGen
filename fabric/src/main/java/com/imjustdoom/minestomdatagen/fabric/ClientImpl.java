package com.imjustdoom.minestomdatagen.fabric;

import com.imjustdoom.minestomdatagen.VillagerInABucket;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.networking.v1.ClientLoginConnectionEvents;

import java.io.IOException;

public class ClientImpl implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
//        ClientLoginConnectionEvents.INIT.register((packet, player) -> {
            try {
                VillagerInABucket.start();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
//        });


    }
}