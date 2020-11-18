package com.kittyherz.forgottenworlds.init;

import com.kittyherz.forgottenworlds.client.entity.render.CorrasRender;
import com.kittyherz.forgottenworlds.client.entity.render.TestMobRender;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class ClientInit {


    public static void init() {
        RenderTypeLookup.setRenderLayer(BlockInit.LUMEOS_SAPLING.get(), RenderType.getCutout());

        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.CORRAS.get(), CorrasRender::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.TEST_MOB.get(), TestMobRender::new);

    }

}
