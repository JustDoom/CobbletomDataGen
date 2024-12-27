package com.imjustdoom.minestomdatagen.mixin;

import com.imjustdoom.minestomdatagen.FireBlockImpl;
import net.minecraft.world.level.block.FireBlock;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;

@Mixin(FireBlock.class)
public abstract class FireBlockMixin implements FireBlockImpl {

    @Shadow protected abstract int getIgniteOdds(BlockState blockState);

    @Unique
    public boolean isFlammable(BlockState blockState) {
        return this.getIgniteOdds(blockState) > 0;
    }
}
