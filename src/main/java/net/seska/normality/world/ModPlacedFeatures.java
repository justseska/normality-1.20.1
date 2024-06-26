package net.seska.normality.world;

import net.minecraft.fluid.Fluids;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.blockpredicate.BlockPredicate;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.*;
import net.seska.normality.NormalityMod;
import net.seska.normality.block.ModBlocks;

import java.util.List;

public class ModPlacedFeatures {
    public static final RegistryKey<PlacedFeature> HOLLY_PLACED_KEY = registerKey("holly_place");
    public static final RegistryKey<PlacedFeature> CHANTERELLE_PLACED_KEY = registerKey("chanterelle_placed");
    public static final RegistryKey<PlacedFeature> CHANTERELLE_MUSHROOM_PLACED_KEY = registerKey("chanterelle_mushroom_placed");
    public static final RegistryKey<PlacedFeature> ENOKI_PLACED_KEY = registerKey("enoki_placed");
    public static final RegistryKey<PlacedFeature> ENOKI_MUSHROOM_PLACED_KEY = registerKey("enoki_mushroom_placed");
    public static final RegistryKey<PlacedFeature> RUBY_ORE_PLACED_KEY = registerKey("ruby_ore_placed");
    public static final RegistryKey<PlacedFeature> JADE_ORE_PLACED_KEY = registerKey("jade_ore_placed");
    public static final RegistryKey<PlacedFeature> SAPPHIRE_DISK_PLACED_KEY = registerKey("sapphire_disk_placed");
    public static final RegistryKey<PlacedFeature> RED_PLUMERIA_PLACED_KEY = registerKey("red_plumeria_placed");
    public static final RegistryKey<PlacedFeature> BLUE_PLUMERIA_PLACED_KEY = registerKey("blue_plumeria_placed");
    public static final RegistryKey<PlacedFeature> WHITE_PLUMERIA_PLACED_KEY = registerKey("white_plumeria_placed");
    public static final RegistryKey<PlacedFeature> YELLOW_PLUMERIA_PLACED_KEY = registerKey("yellow_plumeria_placed");
    public static final RegistryKey<PlacedFeature> YELLOW_PETALS_PLACED_KEY = registerKey("yellow_petals_placed");
    public static final RegistryKey<PlacedFeature> CLOVERS_PLACED_KEY = registerKey("clovers_placed");


    public static void bootstrap(Registerable<PlacedFeature> context) {
        var configuredFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, HOLLY_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.HOLLY_KEY),    VegetationPlacedFeatures.treeModifiersWithWouldSurvive(            PlacedFeatures.createCountExtraModifier(1, 0.1f, 2), ModBlocks.HOLLY_SAPLING));
        register(context, CHANTERELLE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.CHANTERELLE_KEY),    VegetationPlacedFeatures.treeModifiersWithWouldSurvive(            PlacedFeatures.createCountExtraModifier(1, 0.1f, 2), ModBlocks.CHANTERELLE_MUSHROOM));
        register(context, ENOKI_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.ENOKI_KEY),    VegetationPlacedFeatures.treeModifiersWithWouldSurvive(            PlacedFeatures.createCountExtraModifier(1, 0.1f, 2), ModBlocks.ENOKI_MUSHROOM));
        register(context, SAPPHIRE_DISK_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.SAPPHIRE_DISK_KEY), SquarePlacementModifier.of(), PlacedFeatures.OCEAN_FLOOR_WG_HEIGHTMAP, BlockFilterPlacementModifier.of(BlockPredicate.matchingFluids(Fluids.WATER)), BiomePlacementModifier.of());
        register(context, RUBY_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.RUBY_ORE_KEY),    ModOrePlacement.modifiersWithCount(8,            HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(16))));
        register(context, JADE_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.JADE_ORE_KEY),    ModOrePlacement.modifiersWithCount(8,            HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(16))));
        register(context, RED_PLUMERIA_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.RED_PLUMERIA_KEY),    RarityFilterPlacementModifier.of(4), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, BLUE_PLUMERIA_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.BLUE_PLUMERIA_KEY),    RarityFilterPlacementModifier.of(4), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, WHITE_PLUMERIA_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.WHITE_PLUMERIA_KEY),    RarityFilterPlacementModifier.of(4), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, YELLOW_PLUMERIA_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.YELLOW_PLUMERIA_KEY),    RarityFilterPlacementModifier.of(4), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, YELLOW_PETALS_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.YELLOW_PETALS_KEY), NoiseThresholdCountPlacementModifier.of(-0.8, 5, 10), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, CLOVERS_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.CLOVERS_KEY),   NoiseThresholdCountPlacementModifier.of(-0.8, 5, 10), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, CHANTERELLE_MUSHROOM_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.CHANTERELLE_MUSHROOM_KEY),    RarityFilterPlacementModifier.of(4), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, ENOKI_MUSHROOM_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.ENOKI_MUSHROOM_KEY),    RarityFilterPlacementModifier.of(4), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
    }


    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(NormalityMod.MOD_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,                     List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key,                                                                       RegistryEntry<ConfiguredFeature<?, ?>> configuration,                                                                       PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }
}
