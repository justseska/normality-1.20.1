package net.seska.normality.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.seska.normality.NormalityMod;
import net.seska.normality.entity.custom.ChoirSpriteEntity;
import net.seska.normality.entity.custom.MouseEntity;

public class ModEntities {

    public static final EntityType<ChoirSpriteEntity> CHOIR_SPRITE = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(NormalityMod.MOD_ID, "choir_sprite"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, ChoirSpriteEntity::new)
                    .dimensions(EntityDimensions.fixed(0.75f, 0.75f)).build());
    public static final EntityType<MouseEntity> MOUSE = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(NormalityMod.MOD_ID, "mouse"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, MouseEntity::new)
                    .dimensions(EntityDimensions.fixed(0.5f, 0.5f)).build());



    public static void registerModEntities() {
        NormalityMod.LOGGER.info("Registering Entities for " + NormalityMod.MOD_ID);
    }
}
