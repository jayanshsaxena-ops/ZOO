package com.jayanshsaxena.zooexpansion.client.model;

import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;

public final class LionModel extends EntityModel<LionRenderState> {
    private final ModelPart body;
    private final ModelPart head;
    private final ModelPart frontLeftLeg;
    private final ModelPart frontRightLeg;
    private final ModelPart backLeftLeg;
    private final ModelPart backRightLeg;
    private final ModelPart tail;

    public LionModel(ModelPart root) {
        super(root);
        body = root.getChild("body");
        head = root.getChild("head");
        frontLeftLeg = root.getChild("front_left_leg");
        frontRightLeg = root.getChild("front_right_leg");
        backLeftLeg = root.getChild("back_left_leg");
        backRightLeg = root.getChild("back_right_leg");
        tail = root.getChild("tail");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition mesh = new MeshDefinition();
        PartDefinition root = mesh.getRoot();

        root.addOrReplaceChild("body",
                CubeListBuilder.create().texOffs(0, 0).addBox(-5, -4, -8, 10, 8, 15),
                PartPose.offset(0, 13, 1));

        // The mane is deliberately a shoulder/head frame, not a giant cube over the face.
        root.addOrReplaceChild("mane",
                CubeListBuilder.create().texOffs(0, 24)
                        .addBox(-6, -7, -6, 12, 13, 10)
                        .addBox(-5, -6, -7, 10, 11, 2),
                PartPose.offset(0, 8, -4));

        root.addOrReplaceChild("head",
                CubeListBuilder.create().texOffs(44, 0)
                        .addBox(-3, -3, -4, 6, 6, 5)
                        .texOffs(44, 12).addBox(-2, -1, -6, 4, 3, 3)
                        .texOffs(44, 18).addBox(-4, -5, -3, 2, 2, 2)
                        .addBox(2, -5, -3, 2, 2, 2),
                PartPose.offset(0, 8, -7));

        root.addOrReplaceChild("front_left_leg",
                CubeListBuilder.create().texOffs(0, 48).addBox(-1.5F, 0, -1.5F, 3, 8, 3),
                PartPose.offset(-3, 16, -4));
        root.addOrReplaceChild("front_right_leg",
                CubeListBuilder.create().texOffs(0, 48).addBox(-1.5F, 0, -1.5F, 3, 8, 3),
                PartPose.offset(3, 16, -4));
        root.addOrReplaceChild("back_left_leg",
                CubeListBuilder.create().texOffs(12, 48).addBox(-1.5F, 0, -1.5F, 3, 8, 3),
                PartPose.offset(-3, 16, 5));
        root.addOrReplaceChild("back_right_leg",
                CubeListBuilder.create().texOffs(12, 48).addBox(-1.5F, 0, -1.5F, 3, 8, 3),
                PartPose.offset(3, 16, 5));
        root.addOrReplaceChild("tail",
                CubeListBuilder.create().texOffs(24, 48).addBox(-1, 0, -1, 2, 8, 2)
                        .texOffs(32, 48).addBox(-1.5F, 6, -1.5F, 3, 3, 3),
                PartPose.offset(0, 10, 8));

        return LayerDefinition.create(mesh, 64, 64);
    }

    @Override
    public void setupAnim(LionRenderState state) {
        super.setupAnim(state);
        float swing = state.walkAnimationPos * 0.6662F;
        float amount = state.walkAnimationSpeed;
        frontLeftLeg.xRot = (float) Math.cos(swing) * 1.2F * amount;
        backRightLeg.xRot = (float) Math.cos(swing) * 1.2F * amount;
        frontRightLeg.xRot = (float) Math.cos(swing + Math.PI) * 1.2F * amount;
        backLeftLeg.xRot = (float) Math.cos(swing + Math.PI) * 1.2F * amount;
        tail.xRot = 0.15F + (float) Math.sin(state.ageInTicks * 0.08F) * 0.12F;
        head.xRot = state.xRot * ((float)Math.PI / 180F);
    }
}
