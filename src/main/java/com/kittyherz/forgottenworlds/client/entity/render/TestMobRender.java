package com.kittyherz.forgottenworlds.client.entity.render;

import com.kittyherz.forgottenworlds.ForgottenWorlds;
import com.kittyherz.forgottenworlds.client.entity.model.TestMobModel;
import com.kittyherz.forgottenworlds.entities.TestMob;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class TestMobRender extends MobRenderer<TestMob,TestMobModel<TestMob>> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(ForgottenWorlds.MOD_ID,"textures/entity/test.png");

    public TestMobRender(EntityRendererManager rendererManagerIn) {
        super(rendererManagerIn,new TestMobModel<TestMob>(),0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(TestMob entity) {
        return TEXTURE;
    }


}
