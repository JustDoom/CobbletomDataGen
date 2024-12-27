package com.imjustdoom.minestomdatagen.mixin;

import com.imjustdoom.minestomdatagen.BlockEntityTypeImpl;
import com.imjustdoom.minestomdatagen.FireBlockImpl;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FireBlock;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;

import java.util.Set;

@Mixin(BlockEntityType.class)
public abstract class BlockEntityTypeMixin implements BlockEntityTypeImpl {

    @Shadow @Final private Set<Block> validBlocks;

    @Override
    public Set<Block> getValidBlocks() {
        return this.validBlocks;
    }
}
