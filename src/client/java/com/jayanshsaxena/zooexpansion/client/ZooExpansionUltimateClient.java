package com.jayanshsaxena.zooexpansion.client;

import com.jayanshsaxena.zooexpansion.client.model.LionModelLayers;
import com.jayanshsaxena.zooexpansion.client.renderer.LionRenderer;
import com.jayanshsaxena.zooexpansion.entity.ZooEntityTypes;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public final class ZooExpansionUltimateClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        LionModelLayers.register();
        EntityRendererRegistry.register(ZooEntityTypes.LION, LionRenderer::new);
    }
}
