package com.kittyherz.forgottenworlds.init;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;

public class ClientInit {


    public static void init() {
        RenderTypeLookup.setRenderLayer(BlockInit.LUMEOS_SAPLING.get(), RenderType.getCutout());
    }

}
