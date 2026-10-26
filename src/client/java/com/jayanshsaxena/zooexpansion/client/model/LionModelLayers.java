package com.jayanshsaxena.zooexpansion.client.model;

import com.jayanshsaxena.zooexpansion.ZooExpansionUltimate;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.minecraft.client.model.geom.ModelLayerLocation;

public final class LionModelLayers {
    public static final ModelLayerLocation LION = new ModelLayerLocation(
            ZooExpansionUltimate.id("lion"), "main");

    private LionModelLayers() {}

    public static void register() {
        EntityModelLayerRegistry.registerModelLayer(LION, LionModel::createBodyLayer);
    }
}
