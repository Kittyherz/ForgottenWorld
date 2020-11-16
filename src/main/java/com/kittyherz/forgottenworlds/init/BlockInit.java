package com.kittyherz.forgottenworlds.init;

import com.kittyherz.forgottenworlds.ForgottenWorlds;
import com.kittyherz.forgottenworlds.base.BlockItemBase;
import com.kittyherz.forgottenworlds.base.ItemBase;
import com.kittyherz.forgottenworlds.blocks.LumeosLeaves;
import com.kittyherz.forgottenworlds.blocks.LumeosLog;
import com.kittyherz.forgottenworlds.blocks.LumeosSapling;
import com.kittyherz.forgottenworlds.blocks.ScrapMetalBlock;
import com.kittyherz.forgottenworlds.world.feature.LumeosTree;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {


    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<Block>(ForgeRegistries.BLOCKS, ForgottenWorlds.MOD_ID);

    public static final RegistryObject<Block> SCRAP_METAL_BLOCK = BLOCKS.register("scrap_metal_block", ScrapMetalBlock::new);
    public static final RegistryObject<Block> LUMEOS_LOG = BLOCKS.register("lumeos_log", LumeosLog::new);
    public static final RegistryObject<Block> LUMEOS_LEAVES = BLOCKS.register("lumeos_leaves", LumeosLeaves::new);
    public static final RegistryObject<Block> LUMEOS_SAPLING = BLOCKS.register("lumeos_sapling", () -> new LumeosSapling(() -> new LumeosTree(), Block.Properties.from(Blocks.OAK_SAPLING)));


}
