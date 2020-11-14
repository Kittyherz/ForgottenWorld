package com.kittyherz.forgottenworlds.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class ScrapMetalBlock extends Block {
    public ScrapMetalBlock() {

        super(Block.Properties.create(Material.IRON)
                .hardnessAndResistance(4.0f,4.0f)
                .sound(SoundType.METAL)
                .harvestLevel(1)
                .harvestTool(ToolType.PICKAXE));
    }
}
