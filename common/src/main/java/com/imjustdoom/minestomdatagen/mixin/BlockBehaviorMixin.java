package com.imjustdoom.minestomdatagen.mixin;

import net.minecraft.world.level.block.state.BlockBehaviour;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(BlockBehaviour.class)
public interface BlockBehaviorMixin {

    @Invoker("getMaxHorizontalOffset")
    float getMaxHorizontalOffset2();

    @Invoker("getMaxVerticalOffset")
    float getMaxVerticalOffset2();
}
