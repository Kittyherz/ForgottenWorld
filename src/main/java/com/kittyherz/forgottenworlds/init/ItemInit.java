package com.kittyherz.forgottenworlds.init;

import com.kittyherz.forgottenworlds.ForgottenWorlds;
import com.kittyherz.forgottenworlds.base.BlockItemBase;
import com.kittyherz.forgottenworlds.base.ItemBase;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<Item>(ForgeRegistries.ITEMS, ForgottenWorlds.MOD_ID);

    public static final RegistryObject<Item> SCRAP_METAL_ITEM = ITEMS.register( "scrap_metal", ItemBase::new);
    public static final RegistryObject<Item> SCRAP_METAL_BLOCK_ITEM = ITEMS.register("scrap_metal_block", () -> new BlockItemBase(BlockInit.SCRAP_METAL_BLOCK.get()));
    public static final RegistryObject<Item> LUMEOS_LOG_ITEM = ITEMS.register("lumeos_log", () -> new BlockItemBase(BlockInit.LUMEOS_LOG.get()));
    public static final RegistryObject<Item> LUMEOS_LEAVES_ITEM = ITEMS.register("lumeos_leaves", () -> new BlockItemBase(BlockInit.LUMEOS_LEAVES.get()));
    public static final RegistryObject<Item> LUMEOS_SAPLING_ITEM = ITEMS.register("lumeos_sapling", () -> new BlockItemBase(BlockInit.LUMEOS_SAPLING.get()));
}
