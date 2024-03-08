package net.seska.normality.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import net.seska.normality.world.ModPlacedFeatures;

import static net.minecraft.world.biome.BiomeKeys.*;

public class ModFlowerGeneration {
    public static void generateFlowers() {
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.PLAINS),    GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.RED_PLUMERIA_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.TAIGA,OLD_GROWTH_PINE_TAIGA,OLD_GROWTH_SPRUCE_TAIGA),    GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.BLUE_PLUMERIA_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.JUNGLE,SPARSE_JUNGLE),    GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.YELLOW_PLUMERIA_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SWAMP),    GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.WHITE_PLUMERIA_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FLOWER_FOREST,MEADOW),    GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.CLOVERS_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.BIRCH_FOREST,OLD_GROWTH_BIRCH_FOREST),    GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.YELLOW_PETALS_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.MUSHROOM_FIELDS),    GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.CHANTERELLE_MUSHROOM_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.MUSHROOM_FIELDS),    GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.ENOKI_MUSHROOM_PLACED_KEY);

    }
}
