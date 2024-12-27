package com.imjustdoom.minestomdatagen;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

import java.util.Set;

public interface BlockEntityTypeImpl {

    Set<Block> getValidBlocks();
}
