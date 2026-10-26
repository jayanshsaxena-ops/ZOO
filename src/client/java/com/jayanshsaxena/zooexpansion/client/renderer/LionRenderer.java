package com.jayanshsaxena.zooexpansion.client.renderer;

import com.jayanshsaxena.zooexpansion.ZooExpansionUltimate;
import com.jayanshsaxena.zooexpansion.client.model.LionModel;
import com.jayanshsaxena.zooexpansion.client.model.LionRenderState;
import com.jayanshsaxena.zooexpansion.entity.LionEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.Identifier;

public final class LionRenderer extends MobRenderer<LionEntity, LionRenderState, LionModel> {
    private static final Identifier TEXTURE =
            ZooExpansionUltimate.id("textures/entity/lion.png");

    public LionRenderer(EntityRendererProvider.Context context) {
        super(context, new LionModel(context.bakeLayer(
                com.jayanshsaxena.zooexpansion.client.model.LionModelLayers.LION)), 0.7F);
    }

    @Override
    public LionRenderState createRenderState() {
        return new LionRenderState();
    }

    @Override
    public Identifier getTextureLocation(LionRenderState state) {
        return TEXTURE;
    }
}
