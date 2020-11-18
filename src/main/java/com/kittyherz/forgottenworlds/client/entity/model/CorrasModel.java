package com.kittyherz.forgottenworlds.client.entity.model;

import com.kittyherz.forgottenworlds.entities.Corras;
import com.kittyherz.forgottenworlds.entities.TestMob;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.projectile.SmallFireballEntity;
import net.minecraft.util.math.Vec3d;

public class CorrasModel<T extends Corras>  extends EntityModel<T>{


        private final ModelRenderer bb_main;
        private final ModelRenderer armL;
        private final ModelRenderer armL_r31;
        private final ModelRenderer armL_r32;
        private final ModelRenderer armL_r33;
        private final ModelRenderer armL_r34;
        private final ModelRenderer armL_r35;
        private final ModelRenderer armL_r36;
        private final ModelRenderer armL_r1;
        private final ModelRenderer armL_r2;
        private final ModelRenderer armL_r3;
        private final ModelRenderer armL_r4;
        private final ModelRenderer armL_r5;
        private final ModelRenderer armL_r6;
        private final ModelRenderer armL_r7;
        private final ModelRenderer armL_r8;
        private final ModelRenderer armL_r8_r1;
        private final ModelRenderer armL_r9;
        private final ModelRenderer armL_r10;
        private final ModelRenderer armL_r10_r1;
        private final ModelRenderer armL_r11;
        private final ModelRenderer armL_r11_r1;
        private final ModelRenderer armL_r12;
        private final ModelRenderer armL_r12_r1;
        private final ModelRenderer armL_r13;
        private final ModelRenderer armL_r14;
        private final ModelRenderer armL_r14_r1;
        private final ModelRenderer armL_r15;
        private final ModelRenderer armL_r15_r1;
        private final ModelRenderer armR;
        private final ModelRenderer armR_r1;
        private final ModelRenderer armR_r2;
        private final ModelRenderer armL_r16;
        private final ModelRenderer armL_r17;
        private final ModelRenderer armL_r18;
        private final ModelRenderer armL_r19;
        private final ModelRenderer armL_r20;
        private final ModelRenderer armL_r21;
        private final ModelRenderer armL_r22;
        private final ModelRenderer armL_r23;
        private final ModelRenderer armL_r24;
        private final ModelRenderer armL_r25;
        private final ModelRenderer armL_r26;
        private final ModelRenderer armL_r27;
        private final ModelRenderer armL_r28;
        private final ModelRenderer armL_r29;
        private final ModelRenderer armL_r30;

        public CorrasModel() {
            textureWidth = 32;
            textureHeight = 16;

            bb_main = new ModelRenderer(this);
            bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
            bb_main.setTextureOffset(0, 0).addBox(-2.0F, -16.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
            bb_main.setTextureOffset(17, 5).addBox(-1.0F, -15.0F, -2.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);

            armL = new ModelRenderer(this);
            armL.setRotationPoint(0.0F, -14.0F, 0.0F);
            bb_main.addChild(armL);
            armL.setTextureOffset(22, 10).addBox(2.0F, -3.0F, -1.5F, 2.0F, 1.0F, 3.0F, 0.0F, false);
            armL.setTextureOffset(22, 10).addBox(2.0F, 2.0F, -1.5F, 2.0F, 1.0F, 3.0F, 0.0F, false);
            armL.setTextureOffset(13, 14).addBox(2.0F, -3.5F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
            armL.setTextureOffset(0, 14).addBox(4.5F, -0.5F, 4.5F, 5.0F, 1.0F, 1.0F, 0.0F, false);
            armL.setTextureOffset(13, 14).addBox(2.0F, -0.5F, 2.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
            armL.setTextureOffset(24, 0).addBox(3.5F, -1.0F, 3.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
            armL.setTextureOffset(13, 14).addBox(2.0F, 2.5F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
            armL.setTextureOffset(13, 14).addBox(2.0F, -0.5F, -3.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);

            armL_r31 = new ModelRenderer(this);
            armL_r31.setRotationPoint(4.5F, 0.0F, -4.0F);
            armL.addChild(armL_r31);
            setRotationAngle(armL_r31, 3.1416F, 0.0F, 0.0F);
            armL_r31.setTextureOffset(24, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

            armL_r32 = new ModelRenderer(this);
            armL_r32.setRotationPoint(4.5F, 4.0F, 0.0F);
            armL.addChild(armL_r32);
            setRotationAngle(armL_r32, -1.5708F, 0.0F, 0.0F);
            armL_r32.setTextureOffset(24, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

            armL_r33 = new ModelRenderer(this);
            armL_r33.setRotationPoint(7.0F, 5.0F, 0.0F);
            armL.addChild(armL_r33);
            setRotationAngle(armL_r33, -1.5708F, 0.0F, 0.0F);
            armL_r33.setTextureOffset(0, 14).addBox(-2.5F, -0.5F, -0.5F, 5.0F, 1.0F, 1.0F, 0.0F, false);

            armL_r34 = new ModelRenderer(this);
            armL_r34.setRotationPoint(7.0F, 0.0F, -5.0F);
            armL.addChild(armL_r34);
            setRotationAngle(armL_r34, 3.1416F, 0.0F, 0.0F);
            armL_r34.setTextureOffset(0, 14).addBox(-2.5F, -0.5F, -0.5F, 5.0F, 1.0F, 1.0F, 0.0F, false);

            armL_r35 = new ModelRenderer(this);
            armL_r35.setRotationPoint(7.0F, -5.0F, 0.0F);
            armL.addChild(armL_r35);
            setRotationAngle(armL_r35, 1.5708F, 0.0F, 0.0F);
            armL_r35.setTextureOffset(0, 14).addBox(-2.5F, -0.5F, -0.5F, 5.0F, 1.0F, 1.0F, 0.0F, false);

            armL_r36 = new ModelRenderer(this);
            armL_r36.setRotationPoint(4.5F, -4.0F, 0.0F);
            armL.addChild(armL_r36);
            setRotationAngle(armL_r36, 1.5708F, 0.0F, 0.0F);
            armL_r36.setTextureOffset(24, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

            armL_r1 = new ModelRenderer(this);
            armL_r1.setRotationPoint(12.5858F, 0.0F, 0.0F);
            armL.addChild(armL_r1);
            setRotationAngle(armL_r1, 0.0F, -0.7854F, 0.0F);
            armL_r1.setTextureOffset(24, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

            armL_r2 = new ModelRenderer(this);
            armL_r2.setRotationPoint(0.0F, 8.1672F, 11.0815F);
            armL.addChild(armL_r2);
            setRotationAngle(armL_r2, 0.7854F, 0.0F, 0.0F);
            armL_r2.setTextureOffset(24, 4).addBox(2.0F, -16.7929F, -3.05F, 2.0F, 1.0F, 2.0F, 0.0F, false);

            armL_r3 = new ModelRenderer(this);
            armL_r3.setRotationPoint(0.0F, -2.5001F, -11.5F);
            armL.addChild(armL_r3);
            setRotationAngle(armL_r3, -1.5708F, 0.0F, 0.0F);
            armL_r3.setTextureOffset(22, 10).addBox(2.0F, -14.5F, 1.0F, 2.0F, 1.0F, 3.0F, 0.0F, false);

            armL_r4 = new ModelRenderer(this);
            armL_r4.setRotationPoint(0.0F, -2.5001F, 11.5F);
            armL.addChild(armL_r4);
            setRotationAngle(armL_r4, 1.5708F, 0.0F, 0.0F);
            armL_r4.setTextureOffset(22, 10).addBox(2.0F, -14.5F, -4.0F, 2.0F, 1.0F, 3.0F, 0.0F, false);

            armL_r5 = new ModelRenderer(this);
            armL_r5.setRotationPoint(0.0F, 7.8752F, -10.3865F);
            armL.addChild(armL_r5);
            setRotationAngle(armL_r5, -0.7854F, 0.0F, 0.0F);
            armL_r5.setTextureOffset(24, 4).addBox(2.0F, -16.1F, 0.78F, 2.0F, 1.0F, 2.0F, 0.0F, false);

            armL_r6 = new ModelRenderer(this);
            armL_r6.setRotationPoint(0.0F, 11.9652F, 9.5125F);
            armL.addChild(armL_r6);
            setRotationAngle(armL_r6, 0.7854F, 0.0F, 0.0F);
            armL_r6.setTextureOffset(24, 4).addBox(2.0F, -13.0F, 0.75F, 2.0F, 1.0F, 2.0F, 0.0F, false);

            armL_r7 = new ModelRenderer(this);
            armL_r7.setRotationPoint(3.0F, 1.8536F, -1.9393F);
            armL.addChild(armL_r7);
            setRotationAngle(armL_r7, -0.7854F, 0.0F, 0.0F);
            armL_r7.setTextureOffset(24, 4).addBox(-1.0F, -0.5F, -0.9207F, 2.0F, 1.0F, 2.0F, 0.0F, false);

            armL_r8 = new ModelRenderer(this);
            armL_r8.setRotationPoint(11.337F, 1.955F, 0.0F);
            armL.addChild(armL_r8);
            setRotationAngle(armL_r8, 0.0F, 0.0F, -0.576F);


            armL_r8_r1 = new ModelRenderer(this);
            armL_r8_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
            armL_r8.addChild(armL_r8_r1);
            setRotationAngle(armL_r8_r1, -1.5708F, 0.0F, 0.0F);
            armL_r8_r1.setTextureOffset(13, 9).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);

            armL_r9 = new ModelRenderer(this);
            armL_r9.setRotationPoint(11.337F, 0.0F, 1.955F);
            armL.addChild(armL_r9);
            setRotationAngle(armL_r9, 0.0F, 0.576F, 0.0F);
            armL_r9.setTextureOffset(13, 9).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);

            armL_r10 = new ModelRenderer(this);
            armL_r10.setRotationPoint(11.337F, 0.0F, -1.955F);
            armL.addChild(armL_r10);
            setRotationAngle(armL_r10, 0.0F, -0.576F, 0.0F);


            armL_r10_r1 = new ModelRenderer(this);
            armL_r10_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
            armL_r10.addChild(armL_r10_r1);
            setRotationAngle(armL_r10_r1, 3.1416F, 0.0F, 0.0F);
            armL_r10_r1.setTextureOffset(16, 0).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);

            armL_r11 = new ModelRenderer(this);
            armL_r11.setRotationPoint(11.337F, -1.955F, 0.0F);
            armL.addChild(armL_r11);
            setRotationAngle(armL_r11, 0.0F, 0.0F, 0.576F);


            armL_r11_r1 = new ModelRenderer(this);
            armL_r11_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
            armL_r11.addChild(armL_r11_r1);
            setRotationAngle(armL_r11_r1, 1.5708F, 0.0F, 0.0F);
            armL_r11_r1.setTextureOffset(16, 0).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);

            armL_r12 = new ModelRenderer(this);
            armL_r12.setRotationPoint(9.2466F, 4.8399F, 0.0F);
            armL.addChild(armL_r12);
            setRotationAngle(armL_r12, 0.0F, 0.0F, -1.1519F);


            armL_r12_r1 = new ModelRenderer(this);
            armL_r12_r1.setRotationPoint(1.0F, 0.0F, 0.0F);
            armL_r12.addChild(armL_r12_r1);
            setRotationAngle(armL_r12_r1, -1.5708F, 0.0F, 0.0F);
            armL_r12_r1.setTextureOffset(16, 0).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);

            armL_r13 = new ModelRenderer(this);
            armL_r13.setRotationPoint(9.6533F, 0.0F, 3.9263F);
            armL.addChild(armL_r13);
            setRotationAngle(armL_r13, 0.0F, 1.1519F, 0.0F);
            armL_r13.setTextureOffset(16, 0).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);

            armL_r14 = new ModelRenderer(this);
            armL_r14.setRotationPoint(9.6533F, 0.0F, -3.9263F);
            armL.addChild(armL_r14);
            setRotationAngle(armL_r14, 0.0F, -1.1519F, 0.0F);


            armL_r14_r1 = new ModelRenderer(this);
            armL_r14_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
            armL_r14.addChild(armL_r14_r1);
            setRotationAngle(armL_r14_r1, 3.1416F, 0.0F, 0.0F);
            armL_r14_r1.setTextureOffset(13, 9).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);

            armL_r15 = new ModelRenderer(this);
            armL_r15.setRotationPoint(9.2466F, -4.8399F, 0.0F);
            armL.addChild(armL_r15);
            setRotationAngle(armL_r15, 0.0F, 0.0F, 1.1519F);


            armL_r15_r1 = new ModelRenderer(this);
            armL_r15_r1.setRotationPoint(1.0F, 0.0F, 0.0F);
            armL_r15.addChild(armL_r15_r1);
            setRotationAngle(armL_r15_r1, 1.5708F, 0.0F, 0.0F);
            armL_r15_r1.setTextureOffset(13, 9).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);

            armR = new ModelRenderer(this);
            armR.setRotationPoint(0.0F, -14.0F, 0.0F);
            bb_main.addChild(armR);
            setRotationAngle(armR, 0.0F, 3.1416F, 0.0F);
            armR.setTextureOffset(22, 10).addBox(2.0F, -3.0F, -1.5F, 2.0F, 1.0F, 3.0F, 0.0F, false);
            armR.setTextureOffset(22, 10).addBox(2.0F, 2.0F, -1.5F, 2.0F, 1.0F, 3.0F, 0.0F, false);
            armR.setTextureOffset(13, 14).addBox(2.0F, -3.5F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
            armR.setTextureOffset(0, 14).addBox(4.5F, -5.5F, -0.5F, 5.0F, 1.0F, 1.0F, 0.0F, false);
            armR.setTextureOffset(0, 14).addBox(4.5F, -0.5F, 4.5F, 5.0F, 1.0F, 1.0F, 0.0F, false);
            armR.setTextureOffset(0, 14).addBox(4.5F, -0.5F, -5.5F, 5.0F, 1.0F, 1.0F, 0.0F, false);
            armR.setTextureOffset(0, 14).addBox(4.5F, 4.5F, -0.5F, 5.0F, 1.0F, 1.0F, 0.0F, false);
            armR.setTextureOffset(13, 14).addBox(2.0F, -0.5F, 2.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
            armR.setTextureOffset(13, 14).addBox(2.0F, 2.5F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
            armR.setTextureOffset(24, 0).addBox(3.5F, 3.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
            armR.setTextureOffset(13, 14).addBox(2.0F, -0.5F, -3.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
            armR.setTextureOffset(24, 0).addBox(3.5F, -1.0F, -5.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

            armR_r1 = new ModelRenderer(this);
            armR_r1.setRotationPoint(4.5F, 0.0F, 4.0F);
            armR.addChild(armR_r1);
            setRotationAngle(armR_r1, 3.1416F, 0.0F, 0.0F);
            armR_r1.setTextureOffset(24, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

            armR_r2 = new ModelRenderer(this);
            armR_r2.setRotationPoint(4.5F, -4.0F, 0.0F);
            armR.addChild(armR_r2);
            setRotationAngle(armR_r2, 1.5708F, 0.0F, 0.0F);
            armR_r2.setTextureOffset(24, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

            armL_r16 = new ModelRenderer(this);
            armL_r16.setRotationPoint(12.5858F, 0.0F, 0.0F);
            armR.addChild(armL_r16);
            setRotationAngle(armL_r16, 0.0F, -0.7854F, 0.0F);
            armL_r16.setTextureOffset(13, 9).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

            armL_r17 = new ModelRenderer(this);
            armL_r17.setRotationPoint(0.0F, 8.1672F, 11.0815F);
            armR.addChild(armL_r17);
            setRotationAngle(armL_r17, 0.7854F, 0.0F, 0.0F);
            armL_r17.setTextureOffset(24, 4).addBox(2.0F, -16.7929F, -3.05F, 2.0F, 1.0F, 2.0F, 0.0F, false);

            armL_r18 = new ModelRenderer(this);
            armL_r18.setRotationPoint(0.0F, -2.5001F, -11.5F);
            armR.addChild(armL_r18);
            setRotationAngle(armL_r18, -1.5708F, 0.0F, 0.0F);
            armL_r18.setTextureOffset(22, 10).addBox(2.0F, -14.5F, 1.0F, 2.0F, 1.0F, 3.0F, 0.0F, false);

            armL_r19 = new ModelRenderer(this);
            armL_r19.setRotationPoint(0.0F, -2.5001F, 11.5F);
            armR.addChild(armL_r19);
            setRotationAngle(armL_r19, 1.5708F, 0.0F, 0.0F);
            armL_r19.setTextureOffset(22, 10).addBox(2.0F, -14.5F, -4.0F, 2.0F, 1.0F, 3.0F, 0.0F, false);

            armL_r20 = new ModelRenderer(this);
            armL_r20.setRotationPoint(0.0F, 7.8752F, -10.3865F);
            armR.addChild(armL_r20);
            setRotationAngle(armL_r20, -0.7854F, 0.0F, 0.0F);
            armL_r20.setTextureOffset(24, 4).addBox(2.0F, -16.1F, 0.78F, 2.0F, 1.0F, 2.0F, 0.0F, false);

            armL_r21 = new ModelRenderer(this);
            armL_r21.setRotationPoint(0.0F, 11.9652F, 9.5125F);
            armR.addChild(armL_r21);
            setRotationAngle(armL_r21, 0.7854F, 0.0F, 0.0F);
            armL_r21.setTextureOffset(24, 4).addBox(2.0F, -13.0F, 0.75F, 2.0F, 1.0F, 2.0F, 0.0F, false);

            armL_r22 = new ModelRenderer(this);
            armL_r22.setRotationPoint(3.0F, 1.8536F, -1.9393F);
            armR.addChild(armL_r22);
            setRotationAngle(armL_r22, -0.7854F, 0.0F, 0.0F);
            armL_r22.setTextureOffset(24, 4).addBox(-1.0F, -0.5F, -0.9407F, 2.0F, 1.0F, 2.0F, 0.0F, false);

            armL_r23 = new ModelRenderer(this);
            armL_r23.setRotationPoint(11.337F, 1.955F, 0.0F);
            armR.addChild(armL_r23);
            setRotationAngle(armL_r23, 0.0F, 0.0F, -0.576F);
            armL_r23.setTextureOffset(13, 9).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);

            armL_r24 = new ModelRenderer(this);
            armL_r24.setRotationPoint(11.337F, 0.0F, 1.955F);
            armR.addChild(armL_r24);
            setRotationAngle(armL_r24, 0.0F, 0.576F, 0.0F);
            armL_r24.setTextureOffset(13, 9).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);

            armL_r25 = new ModelRenderer(this);
            armL_r25.setRotationPoint(11.337F, 0.0F, -1.955F);
            armR.addChild(armL_r25);
            setRotationAngle(armL_r25, 0.0F, -0.576F, 0.0F);
            armL_r25.setTextureOffset(13, 9).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);

            armL_r26 = new ModelRenderer(this);
            armL_r26.setRotationPoint(11.337F, -1.955F, 0.0F);
            armR.addChild(armL_r26);
            setRotationAngle(armL_r26, 0.0F, 0.0F, 0.576F);
            armL_r26.setTextureOffset(13, 9).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);

            armL_r27 = new ModelRenderer(this);
            armL_r27.setRotationPoint(9.2466F, 4.8399F, 0.0F);
            armR.addChild(armL_r27);
            setRotationAngle(armL_r27, 0.0F, 0.0F, -1.1519F);
            armL_r27.setTextureOffset(16, 0).addBox(-0.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);

            armL_r28 = new ModelRenderer(this);
            armL_r28.setRotationPoint(9.6533F, 0.0F, 3.9263F);
            armR.addChild(armL_r28);
            setRotationAngle(armL_r28, 0.0F, 1.1519F, 0.0F);
            armL_r28.setTextureOffset(16, 0).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);

            armL_r29 = new ModelRenderer(this);
            armL_r29.setRotationPoint(9.6533F, 0.0F, -3.9263F);
            armR.addChild(armL_r29);
            setRotationAngle(armL_r29, 0.0F, -1.1519F, 0.0F);
            armL_r29.setTextureOffset(16, 0).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);

            armL_r30 = new ModelRenderer(this);
            armL_r30.setRotationPoint(9.2466F, -4.8399F, 0.0F);
            armR.addChild(armL_r30);
            setRotationAngle(armL_r30, 0.0F, 0.0F, 1.1519F);
            armL_r30.setTextureOffset(16, 0).addBox(-0.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
        }

    @Override
    public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

    }






        public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
            modelRenderer.rotateAngleX = x;
            modelRenderer.rotateAngleY = y;
            modelRenderer.rotateAngleZ = z;
        }

    boolean rolling = false;
    public void setLivingAnimations(T entityIn, float limbSwing, float limbSwingAmount, float partialTick) {



        //Vec3d dir = entityIn.getLook(partialTick);
        //entityIn.setMotion(dir);
        //System.out.println(""+dir);
        //System.out.println("YAW: "+entityIn.rotationYaw);
        System.out.println("YAW HEAD: "+entityIn.rotationYawHead);
        float angle = (float)Math.toRadians((6*360+entityIn.renderYawOffset)%360);
        float cycle = 2*(float)Math.PI* (entityIn.cylcerCycle /200);

        armL.rotateAngleX = (float)angle*5-cycle;
        armR.rotateAngleX = (float)angle*5+cycle;


    }
    @Override
    public void render(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
        bb_main.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn);
    }

    public float getYawFromVector(Vec3d v) {

        return (float)Math.atan2(v.z,v.x);

    }
}
