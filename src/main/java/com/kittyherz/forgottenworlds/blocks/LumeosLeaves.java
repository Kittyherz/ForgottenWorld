package com.kittyherz.forgottenworlds.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.common.ToolType;
import net.minecraft.block.LeavesBlock;

public class LumeosLeaves extends LeavesBlock {
    public LumeosLeaves() {

        super(Properties.create(Material.LEAVES)
                .hardnessAndResistance(0.2f,0.2f)
                .sound(SoundType.PLANT)
                .notSolid()
                );
        RenderTypeLookup.setRenderLayer(this, RenderType.getCutout());
    }
}
