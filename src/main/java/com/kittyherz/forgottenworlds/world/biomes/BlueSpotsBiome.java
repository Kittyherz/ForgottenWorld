package com.kittyherz.forgottenworlds.world.biomes;

import com.kittyherz.forgottenworlds.world.feature.LumeosTree;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.carver.WorldCarver;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.ProbabilityConfig;
import net.minecraft.world.gen.placement.AtSurfaceWithExtraConfig;
import net.minecraft.world.gen.placement.Placement;

public class BlueSpotsBiome extends Biome {

    public BlueSpotsBiome(Builder biomeBuilder){
        super(biomeBuilder);
        this.addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.CAT, 20, 2, 10));
        this.addCarver(GenerationStage.Carving.AIR,
                    Biome.createCarver(WorldCarver.HELL_CAVE, new ProbabilityConfig(0.02f)));
        this.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.NORMAL_TREE.withConfiguration(LumeosTree.LUMEOS_TREE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(5, 0.1f,1))));
    }
}
