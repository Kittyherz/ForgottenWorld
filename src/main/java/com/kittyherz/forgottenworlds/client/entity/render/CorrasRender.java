package com.kittyherz.forgottenworlds.client.entity.render;

import com.kittyherz.forgottenworlds.ForgottenWorlds;
import com.kittyherz.forgottenworlds.client.entity.model.CorrasModel;
import com.kittyherz.forgottenworlds.client.entity.model.TestMobModel;

import com.kittyherz.forgottenworlds.entities.Corras;
import com.kittyherz.forgottenworlds.entities.TestMob;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class CorrasRender extends MobRenderer<Corras, CorrasModel<Corras>> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(ForgottenWorlds.MOD_ID,"textures/entity/corras.png");

    public CorrasRender(EntityRendererManager rendererManagerIn) {
        super(rendererManagerIn,new CorrasModel<Corras>(),0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(Corras entity) {
        return TEXTURE;
    }


}
