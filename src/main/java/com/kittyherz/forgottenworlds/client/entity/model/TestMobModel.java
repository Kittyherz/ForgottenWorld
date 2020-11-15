package com.kittyherz.forgottenworlds.client.entity.model;

// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


import com.kittyherz.forgottenworlds.entities.TestMob;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class TestMobModel<T extends TestMob> extends EntityModel<T> {
    private final ModelRenderer Body;
    private final ModelRenderer Legs;
    private final ModelRenderer Front;
    private final ModelRenderer FrontRight;
    private final ModelRenderer FrontLeft;
    private final ModelRenderer Back;
    private final ModelRenderer BackRight;
    private final ModelRenderer BackLeft;
    private final ModelRenderer Head;

    public TestMobModel() {
        textureWidth = 16;
        textureHeight = 16;

        Body = new ModelRenderer(this);
        Body.setRotationPoint(-2.0F, 20.0F, -1.25F);
        Body.setTextureOffset(0, 0).addBox(-3.0F, -8.0F, -3.75F, 10.0F, 1.0F, 10.0F, 0.0F, false);

        Legs = new ModelRenderer(this);
        Legs.setRotationPoint(2.0F, 4.0F, 1.25F);
        Body.addChild(Legs);


        Front = new ModelRenderer(this);
        Front.setRotationPoint(0.0F, 0.0F, 0.0F);
        Legs.addChild(Front);


        FrontRight = new ModelRenderer(this);
        FrontRight.setRotationPoint(0.0F, 0.0F, 0.0F);
        Front.addChild(FrontRight);
        FrontRight.setTextureOffset(0, 0).addBox(-5.0F, -11.0F, -5.0F, 1.0F, 11.0F, 1.0F, 0.0F, false);

        FrontLeft = new ModelRenderer(this);
        FrontLeft.setRotationPoint(0.0F, 0.0F, 0.0F);
        Front.addChild(FrontLeft);
        FrontLeft.setTextureOffset(0, 0).addBox(4.0F, -11.0F, -5.0F, 1.0F, 11.0F, 1.0F, 0.0F, false);

        Back = new ModelRenderer(this);
        Back.setRotationPoint(0.0F, 0.0F, 0.0F);
        Legs.addChild(Back);


        BackRight = new ModelRenderer(this);
        BackRight.setRotationPoint(0.0F, 0.0F, 0.0F);
        Back.addChild(BackRight);
        BackRight.setTextureOffset(0, 0).addBox(-5.0F, -11.0F, 4.0F, 1.0F, 11.0F, 1.0F, 0.0F, false);

        BackLeft = new ModelRenderer(this);
        BackLeft.setRotationPoint(0.0F, 0.0F, 0.0F);
        Back.addChild(BackLeft);
        BackLeft.setTextureOffset(0, 0).addBox(4.0F, -11.0F, 4.0F, 1.0F, 11.0F, 1.0F, 0.0F, false);

        Head = new ModelRenderer(this);
        Head.setRotationPoint(0.0F, 0.0F, 0.0F);
        Body.addChild(Head);
        Head.setTextureOffset(0, 0).addBox(0.0F, -7.0F, -3.75F, 4.0F, 1.0F, 3.0F, 0.0F, false);
    }

    @Override
    public void setRotationAngles(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        //previously the render function, render code was moved to a method below
    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        Body.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
