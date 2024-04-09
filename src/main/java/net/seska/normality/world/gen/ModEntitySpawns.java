package net.seska.normality.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.SpawnRestriction;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.world.Heightmap;
import net.minecraft.world.biome.BiomeKeys;
import net.seska.normality.entity.ModEntities;
import net.seska.normality.entity.variant.MouseVariant;

public class ModEntitySpawns {
    public static void addSpawns() {
        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(BiomeKeys.END_HIGHLANDS, BiomeKeys.END_MIDLANDS, BiomeKeys.END_BARRENS),
                SpawnGroup.CREATURE, ModEntities.CHOIR_SPRITE, 10, 5, 10);

        SpawnRestriction.register(ModEntities.CHOIR_SPRITE, SpawnRestriction.Location.NO_RESTRICTIONS,
                Heightmap.Type.MOTION_BLOCKING, AnimalEntity::isValidNaturalSpawn);
        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(BiomeKeys.FOREST,BiomeKeys.FLOWER_FOREST,BiomeKeys.BIRCH_FOREST,BiomeKeys.OLD_GROWTH_BIRCH_FOREST,BiomeKeys.DARK_FOREST,BiomeKeys.WINDSWEPT_FOREST),
                SpawnGroup.CREATURE, ModEntities.MOUSE, 3, 2, 4);
        SpawnRestriction.register(ModEntities.MOUSE, SpawnRestriction.Location.NO_RESTRICTIONS,
                Heightmap.Type.MOTION_BLOCKING, AnimalEntity::isValidNaturalSpawn);
    }
}
