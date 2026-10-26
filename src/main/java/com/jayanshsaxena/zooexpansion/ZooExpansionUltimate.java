package com.jayanshsaxena.zooexpansion;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class ZooExpansionUltimate implements ModInitializer {
    public static final String MOD_ID = "zoo_expansion_ultimate";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Zoo Expansion Ultimate initialized. Animal/entity registration is the next integration step.");
    }
}
