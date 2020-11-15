package com.kittyherz.forgottenworlds.world.feature;

import com.kittyherz.forgottenworlds.util.RegistryHandler;
import net.minecraft.block.trees.Tree;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.foliageplacer.BlobFoliagePlacer;
import net.minecraftforge.common.IPlantable;

import java.util.Random;

public class LumeosTree extends Tree {

    public static final TreeFeatureConfig LUMEOS_TREE_CONFIG = (new TreeFeatureConfig.Builder(
                    new SimpleBlockStateProvider(RegistryHandler.LUMEOS_LOG.get().getDefaultState()),
                    new SimpleBlockStateProvider(RegistryHandler.LUMEOS_LEAVES.get().getDefaultState()),
                    new BlobFoliagePlacer(3, 0)))
                    .baseHeight(14).heightRandA(5).foliageHeight(9).ignoreVines()
                    .setSapling((IPlantable) RegistryHandler.LUMEOS_SAPLING.get()).build();

    @Override
    protected ConfiguredFeature<TreeFeatureConfig, ?> getTreeFeature(Random randomIn, boolean p_225546_2_) {
        return Feature.NORMAL_TREE.withConfiguration(LUMEOS_TREE_CONFIG);
    }
}
