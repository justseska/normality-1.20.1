package net.seska.normality.world;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.FlowerbedBlock;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.collection.DataPool;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.foliage.RandomSpreadFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.stateprovider.WeightedBlockStateProvider;
import net.minecraft.world.gen.trunk.BendingTrunkPlacer;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;
import net.seska.normality.NormalityMod;
import net.seska.normality.block.ModBlocks;

import java.util.List;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> HOLLY_KEY = registryKey("holly");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CHANTERELLE_KEY =registryKey("chanterelle");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ENOKI_KEY = registryKey("enoki");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CHANTERELLE_MUSHROOM_KEY =registryKey("chanterelle_mushroom");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ENOKI_MUSHROOM_KEY =registryKey("enoki_mushroom");
    public static final RegistryKey<ConfiguredFeature<?, ?>> RUBY_ORE_KEY = registryKey("ruby_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> RED_PLUMERIA_KEY = registryKey("red_plumeria");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BLUE_PLUMERIA_KEY = registryKey("blue_plumeria");
    public static final RegistryKey<ConfiguredFeature<?, ?>> WHITE_PLUMERIA_KEY = registryKey("white_plumeria");
    public static final RegistryKey<ConfiguredFeature<?, ?>> YELLOW_PLUMERIA_KEY = registryKey("yellow_plumeria");
    public static final RegistryKey<ConfiguredFeature<?, ?>> YELLOW_PETALS_KEY = registryKey("yellow_petals");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CLOVERS_KEY = registryKey("clovers");


    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        List<OreFeatureConfig.Target> overworldRubyOres =    List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.RUBY_ORE.getDefaultState()),            OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.DEEPSLATE_RUBY_ORE.getDefaultState()));

        register(context, CHANTERELLE_KEY, Feature.HUGE_BROWN_MUSHROOM, new HugeMushroomFeatureConfig(    BlockStateProvider.of(ModBlocks.CHANTERELLE_BLOCK),    BlockStateProvider.of(ModBlocks.CHANTERELLE_STEM), 3));

        register(context, ENOKI_KEY, Feature.HUGE_RED_MUSHROOM, new HugeMushroomFeatureConfig(    BlockStateProvider.of(ModBlocks.ENOKI_BLOCK),    BlockStateProvider.of(ModBlocks.ENOKI_STEM), 1));




        register(context, HOLLY_KEY, Feature.TREE, new TreeFeatureConfig.Builder(    BlockStateProvider.of(ModBlocks.HOLLY_LOG),    new StraightTrunkPlacer(5 , 2, 1),    BlockStateProvider.of(ModBlocks.HOLLY_LEAVES),    new BlobFoliagePlacer(ConstantIntProvider.create(3), ConstantIntProvider.create(3), 5),    new TwoLayersFeatureSize(1, 0, 1)).build());


        register(context, RUBY_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldRubyOres, 5));

        register(context, RED_PLUMERIA_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(32, 7, 3, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,    new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.RED_PLUMERIA)))));
        register(context, BLUE_PLUMERIA_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(32, 7, 3, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,    new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.BLUE_PLUMERIA)))));
        register(context, YELLOW_PLUMERIA_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(32, 7, 3, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,    new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.YELLOW_PLUMERIA)))));
        register(context, WHITE_PLUMERIA_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(32, 7, 3, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,    new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.WHITE_PLUMERIA)))));
        DataPool.Builder<BlockState> builder = DataPool.builder();
        for (int i = 1; i <= 4; ++i) {
            for (Direction direction : Direction.Type.HORIZONTAL) {
                builder.add((BlockState)((BlockState)ModBlocks.YELLOW_PETALS.getDefaultState().with(FlowerbedBlock.FLOWER_AMOUNT, i)).with(FlowerbedBlock.FACING, direction), 1);
            }
        }
        DataPool.Builder<BlockState> builder2 = DataPool.builder();
        for (int i = 1; i <= 4; ++i) {
            for (Direction direction : Direction.Type.HORIZONTAL) {
                builder2.add((BlockState)((BlockState)ModBlocks.CLOVERS.getDefaultState().with(FlowerbedBlock.FLOWER_AMOUNT, i)).with(FlowerbedBlock.FACING, direction), 1);
            }
        }

        register(context, YELLOW_PETALS_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(32, 7, 3, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(new WeightedBlockStateProvider(builder)))));
        register(context, CLOVERS_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(32, 7, 3, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(new WeightedBlockStateProvider(builder2)))));
        register(context, CHANTERELLE_MUSHROOM_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(32, 7, 3, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,    new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.CHANTERELLE_MUSHROOM)))));
        register(context, ENOKI_MUSHROOM_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(32, 7, 3, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,    new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.ENOKI_MUSHROOM)))));
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registryKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(NormalityMod.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,                                                                       RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));

    }
}
