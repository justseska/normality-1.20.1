package net.seska.normality.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModification;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import net.seska.normality.world.ModPlacedFeatures;

public class ModTreeGeneration {
    public static void generateTrees() {
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FOREST),    GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.HOLLY_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.MUSHROOM_FIELDS),    GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.CHANTERELLE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.MUSHROOM_FIELDS),    GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.ENOKI_PLACED_KEY);
    }
}
