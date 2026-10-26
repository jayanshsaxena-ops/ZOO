package com.jayanshsaxena.zooexpansion.client;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class ZooExpansionUltimateClient implements ClientModInitializer {
    private static final Logger LOGGER = LoggerFactory.getLogger("zoo_expansion_ultimate");

    @Override
    public void onInitializeClient() {
        LOGGER.info("Zoo Expansion Ultimate client initialized.");
    }
}
