package com.kittyherz.forgottenworlds.init;

import com.kittyherz.forgottenworlds.ForgottenWorlds;
import com.kittyherz.forgottenworlds.blocks.LumeosLeaves;
import com.kittyherz.forgottenworlds.blocks.LumeosLog;
import com.kittyherz.forgottenworlds.blocks.LumeosSapling;
import com.kittyherz.forgottenworlds.blocks.ScrapMetalBlock;
import com.kittyherz.forgottenworlds.util.RegistryHandler;
import com.kittyherz.forgottenworlds.world.feature.LumeosTree;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.material.Material;
import net.minecraft.block.trees.Tree;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(modid = ForgottenWorlds.MOD_ID,bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(ForgottenWorlds.MOD_ID)
public class BlockInitOld {

    /*
    public static final Block lumeos_leaves = null;
    public static final Block lumeos_log = null;
    public static final Block lumeos_sapling = null;
    public static final Block scrap_metal_block = null;



    @SubscribeEvent
    public static void registerBlocks(final RegistryEvent.Register<Block> event) {

        event.getRegistry().register(new ScrapMetalBlock().setRegistryName("scrap_metal_block"));
        event.getRegistry().register(new LumeosLeaves().setRegistryName("lumeos_leaves"));
        event.getRegistry().register(new LumeosLog().setRegistryName("lumeos_log"));

        //SPECIAL BLOCKS
        //Block sap = new LumeosSapling(() -> new LumeosTree(), Block.Properties.from(Blocks.OAK_SAPLING)).setRegistryName("lumeos_sapling");


    /*
        Block sap = new LumeosSapling(new LumeosTree(), Block.Properties.from(Blocks.OAK_SAPLING)).setRegistryName("lumeos_sapling");
        event.getRegistry().register(sap);
        RenderTypeLookup.setRenderLayer(sap, RenderType.getCutout());


    }



    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> event) {
       //event.getRegistry().register(new Block(new Block.Properties.create()).setRegistryName("test_item"));
        //event.getRegistry().register(new ScrapMetalBlock());
        event.getRegistry().register(new BlockItem(scrap_metal_block,new Item.Properties().group(ForgottenWorlds.TAB)).setRegistryName("scrap_metal_block"));
        event.getRegistry().register(new BlockItem(lumeos_leaves,new Item.Properties().group(ForgottenWorlds.TAB)).setRegistryName("lumeos_leaves"));
        event.getRegistry().register(new BlockItem(lumeos_log,new Item.Properties().group(ForgottenWorlds.TAB)).setRegistryName("lumeos_log"));



        //SPECIAL BLOCK ITEMS

        event.getRegistry().register(new BlockItem(lumeos_sapling,new Item.Properties().group(ForgottenWorlds.TAB)).setRegistryName("lumeos_sapling"));

    }
*/

}