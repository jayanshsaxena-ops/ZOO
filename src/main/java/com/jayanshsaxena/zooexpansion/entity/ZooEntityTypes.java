package com.jayanshsaxena.zooexpansion.entity;

import com.jayanshsaxena.zooexpansion.ZooExpansionUltimate;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.Registry;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;

public final class ZooEntityTypes {
    public static final ResourceKey<EntityType<?>> LION_KEY =
            ResourceKey.create(Registries.ENTITY_TYPE, ZooExpansionUltimate.id("lion"));

    public static final EntityType<LionEntity> LION = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            LION_KEY,
            EntityType.Builder.<LionEntity>of(LionEntity::new, MobCategory.CREATURE)
                    .sized(1.45F, 1.65F)
                    .build(LION_KEY)
    );

    private ZooEntityTypes() {}

    public static void initialize() {
        FabricDefaultAttributeRegistry.register(
                LION,
                net.minecraft.world.entity.PathfinderMob.createMobAttributes()
                        .add(Attributes.MAX_HEALTH, 30.0)
                        .add(Attributes.MOVEMENT_SPEED, 0.25)
        );
    }
}
