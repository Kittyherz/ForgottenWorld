package com.kittyherz.forgottenworlds.init;

import com.kittyherz.forgottenworlds.ForgottenWorlds;
import com.kittyherz.forgottenworlds.entities.TestMob;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEntityTypes {

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = new DeferredRegister<EntityType<?>>(ForgeRegistries.ENTITIES, ForgottenWorlds.MOD_ID);

    public static final RegistryObject<EntityType<TestMob>> TEST_MOB = ENTITY_TYPES.register("testmob", () -> EntityType.Builder.<TestMob>create(TestMob::new, EntityClassification.CREATURE).size(0.9F, 1.3F).build(new ResourceLocation(ForgottenWorlds.MOD_ID, "test_mob").toString()));
}
