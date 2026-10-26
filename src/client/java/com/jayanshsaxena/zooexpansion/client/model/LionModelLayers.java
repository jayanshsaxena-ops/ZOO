package com.jayanshsaxena.zooexpansion.client.model;

import com.jayanshsaxena.zooexpansion.ZooExpansionUltimate;
import net.fabricmc.fabric.api.client.rendering.v1.ModelLayerRegistry;
import net.minecraft.client.model.geom.ModelLayerLocation;

public final class LionModelLayers {
    public static final ModelLayerLocation LION = new ModelLayerLocation(
            ZooExpansionUltimate.id("lion"), "main");

    private LionModelLayers() {}

    public static void register() {
        ModelLayerRegistry.registerModelLayer(
                LION, LionModel::createBodyLayer);
    }
}
