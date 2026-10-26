package com.jayanshsaxena.zooexpansion;

import com.jayanshsaxena.zooexpansion.entity.ZooEntityTypes;
import net.fabricmc.api.ModInitializer;
import net.minecraft.resources.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class ZooExpansionUltimate implements ModInitializer {
    public static final String MOD_ID = "zoo_expansion_ultimate";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ZooEntityTypes.initialize();
        LOGGER.info("Zoo Expansion Ultimate initialized; lion entity registered.");
    }

    public static Identifier id(String path) {
        return Identifier.fromNamespaceAndPath(MOD_ID, path);
    }
}
