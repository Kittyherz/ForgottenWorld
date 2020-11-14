package com.kittyherz.forgottenworlds.blocks;

import com.kittyherz.forgottenworlds.util.RegistryHandler;
import net.minecraft.block.BushBlock;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.SaplingBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.trees.Tree;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;

public class LumeosSapling extends SaplingBlock{
    public LumeosSapling() {

        super(null, Properties.create(Material.LEAVES)
                .hardnessAndResistance(0.2f,0.2f)
                .sound(SoundType.PLANT)
                .notSolid()
                .doesNotBlockMovement()
                );


    }
}
