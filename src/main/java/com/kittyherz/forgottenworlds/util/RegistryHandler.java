package com.kittyherz.forgottenworlds.util;

import com.kittyherz.forgottenworlds.ForgottenWorlds;
import com.kittyherz.forgottenworlds.blocks.*;
import com.kittyherz.forgottenworlds.client.entity.render.TestMobRender;
import com.kittyherz.forgottenworlds.init.ModEntityTypes;
import com.kittyherz.forgottenworlds.items.ItemBase;
import com.kittyherz.forgottenworlds.world.feature.LumeosTree;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, ForgottenWorlds.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, ForgottenWorlds.MOD_ID);

    public static void init() {

        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.TEST_MOB.get(), TestMobRender::new);
    }

    //Items
    public static final RegistryObject<Item> SCRAP_METAL = ITEMS.register( "scrap_metal", ItemBase::new);

    //Blocks
    public static final RegistryObject<Block> SCRAP_METAL_BLOCK = BLOCKS.register("scrap_metal_block", ScrapMetalBlock::new);
    public static final RegistryObject<Block> LUMEOS_LOG = BLOCKS.register("lumeos_log", LumeosLog::new);
    public static final RegistryObject<Block> LUMEOS_LEAVES = BLOCKS.register("lumeos_leaves", LumeosLeaves::new);
    public static final RegistryObject<Block> LUMEOS_SAPLING = BLOCKS.register("lumeos_sapling", () -> new LumeosSapling(() -> new LumeosTree(), Block.Properties.from(Blocks.OAK_SAPLING)));

    //Block Items
    public static final RegistryObject<Item> SCRAP_METAL_BLOCK_ITEM = ITEMS.register("scrap_metal_block", () -> new BlockItemBase(SCRAP_METAL_BLOCK.get()));
    public static final RegistryObject<Item> LUMEOS_LOG_ITEM = ITEMS.register("lumeos_log", () -> new BlockItemBase(LUMEOS_LOG.get()));
    public static final RegistryObject<Item> LUMEOS_LEAVES_ITEM = ITEMS.register("lumeos_leaves", () -> new BlockItemBase(LUMEOS_LEAVES.get()));
    public static final RegistryObject<Item> LUMEOS_SAPLING_ITEM = ITEMS.register("lumeos_sapling", () -> new BlockItemBase(LUMEOS_SAPLING.get()));
}
