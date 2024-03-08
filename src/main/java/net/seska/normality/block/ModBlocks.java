package net.seska.normality.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.enums.Instrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.gen.feature.TreeConfiguredFeatures;
import net.seska.normality.NormalityMod;
import net.seska.normality.block.custom.*;
import net.seska.normality.util.ModWoodTypes;
import net.seska.normality.world.tree.HollySaplingGenerator;

import java.awt.*;
import java.util.Locale;

public class ModBlocks {
    //RUBY
    public static final Block RUBY_ORE = registerBlock("ruby_ore",new ExperienceDroppingBlock(FabricBlockSettings.copy(Blocks.EMERALD_ORE), UniformIntProvider.create(3,6)));
    public static final Block DEEPSLATE_RUBY_ORE = registerBlock("deepslate_ruby_ore",new ExperienceDroppingBlock(FabricBlockSettings.copy(Blocks.DEEPSLATE_EMERALD_ORE), UniformIntProvider.create(3,6)));
    public static final Block RUBY_BLOCK = registerBlock("ruby_block",new Block(FabricBlockSettings.copy(Blocks.EMERALD_BLOCK)));
    //HONEY
    public static final Block HONEYCOMB_BRICKS = registerBlock("honeycomb_bricks",new Block(FabricBlockSettings.copy(Blocks.HONEYCOMB_BLOCK)));
    public static final Block HONEYCOMB_BRICK_STAIRS = registerBlock("honeycomb_brick_stairs",new StairsBlock(ModBlocks.HONEYCOMB_BRICKS.getDefaultState(), FabricBlockSettings.copy(Blocks.HONEYCOMB_BLOCK)));
    public static final Block HONEYCOMB_BRICK_SLAB = registerBlock("honeycomb_brick_slab",new SlabBlock(FabricBlockSettings.copy(Blocks.HONEYCOMB_BLOCK)));
    public static final Block HONEYCOMB_BRICK_WALL = registerBlock("honeycomb_brick_wall",new WallBlock(FabricBlockSettings.copy(Blocks.HONEYCOMB_BLOCK)));
    public static final Block CRACKED_HONEYCOMB_BRICKS = registerBlock("cracked_honeycomb_bricks",new Block(FabricBlockSettings.copy(Blocks.HONEYCOMB_BLOCK)));
    public static final Block CHISELED_HONEYCOMB_BRICKS = registerBlock("chiseled_honeycomb_bricks",new Block(FabricBlockSettings.copy(Blocks.HONEYCOMB_BLOCK)));
    public static final Block CRYSTALLIZED_HONEY_BLOCK = registerBlock("crystallized_honey_block",new Block(FabricBlockSettings.copy(Blocks.HONEYCOMB_BLOCK)));
    //AMETHYST
    public static final Block POLISHED_AMETHYST_BLOCK = registerBlock("polished_amethyst_block",new Block(FabricBlockSettings.copy(Blocks.AMETHYST_BLOCK)));
    public static final Block SMOOTH_AMETHYST = registerBlock("smooth_amethyst",new Block(FabricBlockSettings.copy(Blocks.AMETHYST_BLOCK)));
    public static final Block AMETHYST_BRICKS = registerBlock("amethyst_bricks",new Block(FabricBlockSettings.copy(Blocks.AMETHYST_BLOCK)));
    public static final Block AMETHYST_BRICK_STAIRS = registerBlock("amethyst_brick_stairs",new StairsBlock(ModBlocks.AMETHYST_BRICKS.getDefaultState(), FabricBlockSettings.copy(Blocks.AMETHYST_BLOCK)));
    public static final Block AMETHYST_BRICK_SLAB = registerBlock("amethyst_brick_slab",new SlabBlock(FabricBlockSettings.copy(Blocks.AMETHYST_BLOCK)));
    public static final Block AMETHYST_BRICK_WALL = registerBlock("amethyst_brick_wall",new WallBlock(FabricBlockSettings.copy(Blocks.AMETHYST_BLOCK)));
    public static final Block CRACKED_AMETHYST_BRICKS = registerBlock("cracked_amethyst_bricks",new Block(FabricBlockSettings.copy(Blocks.AMETHYST_BLOCK)));
    public static final Block AMETHYST_PILLAR = registerBlock("amethyst_pillar",new PillarBlock(FabricBlockSettings.copy(Blocks.QUARTZ_PILLAR)));
    //HOLLY
    public static final Block HOLLY_PLANKS = registerBlock("holly_planks",new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)));
    public static final Block BUDDY_HOLLY = registerBlock("buddy_holly",new Block(FabricBlockSettings.copy(Blocks.BLUE_CONCRETE)));
    public static final Block HOLLY_SLAB = registerBlock("holly_slab",new SlabBlock(FabricBlockSettings.copy(Blocks.OAK_SLAB)));
    public static final Block HOLLY_STAIRS = registerBlock("holly_stairs",new StairsBlock(ModBlocks.HOLLY_PLANKS.getDefaultState(), FabricBlockSettings.copy(Blocks.OAK_PLANKS)));
    public static final Block HOLLY_BUTTON = registerBlock("holly_button",new ButtonBlock(FabricBlockSettings.copy(Blocks.OAK_BUTTON), BlockSetType.OAK, 10, true));
    public static final Block HOLLY_PRESSURE_PLATE = registerBlock("holly_pressure_plate",new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copy(Blocks.OAK_PLANKS), BlockSetType.OAK));
    public static final Block HOLLY_FENCE = registerBlock("holly_fence",new FenceBlock(FabricBlockSettings.copy(Blocks.OAK_FENCE)));
    public static final Block HOLLY_FENCE_GATE = registerBlock("holly_fence_gate",new FenceGateBlock(FabricBlockSettings.copy(Blocks.OAK_FENCE), WoodType.OAK));
    public static final Block HOLLY_DOOR = registerBlock("holly_door",new DoorBlock(FabricBlockSettings.copy(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block HOLLY_TRAPDOOR = registerBlock("holly_trapdoor",new TrapdoorBlock(FabricBlockSettings.copy(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block HOLLY_LOG = registerBlock("holly_log",new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG)));
    public static final Block HOLLY_WOOD = registerBlock("holly_wood",new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_HOLLY_LOG = registerBlock("stripped_holly_log",new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_HOLLY_WOOD = registerBlock("stripped_holly_wood",new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final Block HOLLY_LEAVES = registerBlock("holly_leaves",new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES)));
    public static final Block HOLLY_BERRY_LEAVES = registerBlock("holly_berry_leaves",new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES)));
    public static final Block HOLLY_SAPLING = registerBlock("holly_sapling",new SaplingBlock(new HollySaplingGenerator(), FabricBlockSettings.copy(Blocks.OAK_SAPLING)));
    public static final Block POTTED_HOLLY_SAPLING = registerBlock("potted_holly_sapling",new FlowerPotBlock(HOLLY_SAPLING, FabricBlockSettings.copy(Blocks.POTTED_OAK_SAPLING)));
    public static final Block HOLLY_WOOD_SIGN = registerBlockWithoutBlockItem("holly_wood_sign",new ModStandingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN), ModWoodTypes.HOLLY_WOOD));
    public static final Block HOLLY_WOOD_WALL_SIGN = registerBlockWithoutBlockItem("holly_wood_wall_sign",new ModWallSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_WALL_SIGN), ModWoodTypes.HOLLY_WOOD));
    public static final Block HOLLY_WOOD_HANGING_SIGN = registerBlockWithoutBlockItem("holly_wood_hanging_sign",new ModHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_HANGING_SIGN), ModWoodTypes.HOLLY_WOOD));
    public static final Block HOLLY_WOOD_HANGING_WALL_SIGN = registerBlockWithoutBlockItem("holly_wood_hanging_wall_sign",new ModWallHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.HOLLY_WOOD));
    //CHANTERELLE
    public static final Block CHANTERELLE_MUSHROOM = registerBlock("chanterelle_mushroom",new MushroomPlantBlock(FabricBlockSettings.copy(Blocks.BROWN_MUSHROOM).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS).postProcess(Blocks::always).pistonBehavior(PistonBehavior.DESTROY), TreeConfiguredFeatures.HUGE_RED_MUSHROOM));
    public static final Block POTTED_CHANTERELLE_MUSHROOM = registerBlock("potted_chanterelle_mushroom",new FlowerPotBlock(CHANTERELLE_MUSHROOM, FabricBlockSettings.copy(Blocks.POTTED_RED_MUSHROOM)));
    public static final Block CHANTERELLE_STEM = registerBlock("chanterelle_stem",new PillarBlock(FabricBlockSettings.copy(Blocks.MUSHROOM_STEM)));
    public static final Block STRIPPED_CHANTERELLE_STEM = registerBlock("stripped_chanterelle_stem",new PillarBlock(FabricBlockSettings.copy(Blocks.MUSHROOM_STEM)));
    public static final Block CHANTERELLE_PLANKS = registerBlock("chanterelle_planks",new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)));
    public static final Block CHANTERELLE_SLAB = registerBlock("chanterelle_slab",new SlabBlock(FabricBlockSettings.copy(Blocks.OAK_SLAB)));
    public static final Block CHANTERELLE_STAIRS = registerBlock("chanterelle_stairs",new StairsBlock(ModBlocks.CHANTERELLE_PLANKS.getDefaultState(), FabricBlockSettings.copy(Blocks.OAK_PLANKS)));
    public static final Block CHANTERELLE_BUTTON = registerBlock("chanterelle_button",new ButtonBlock(FabricBlockSettings.copy(Blocks.OAK_BUTTON), BlockSetType.OAK, 10, true));
    public static final Block CHANTERELLE_PRESSURE_PLATE = registerBlock("chanterelle_pressure_plate",new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copy(Blocks.OAK_PLANKS), BlockSetType.OAK));
    public static final Block CHANTERELLE_FENCE = registerBlock("chanterelle_fence",new FenceBlock(FabricBlockSettings.copy(Blocks.OAK_FENCE)));
    public static final Block CHANTERELLE_FENCE_GATE = registerBlock("chanterelle_fence_gate",new FenceGateBlock(FabricBlockSettings.copy(Blocks.OAK_FENCE), WoodType.OAK));
    public static final Block CHANTERELLE_DOOR = registerBlock("chanterelle_door",new DoorBlock(FabricBlockSettings.copy(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block CHANTERELLE_TRAPDOOR = registerBlock("chanterelle_trapdoor",new TrapdoorBlock(FabricBlockSettings.copy(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block CHANTERELLE_SIGN = registerBlockWithoutBlockItem("chanterelle_sign",new ModStandingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN), ModWoodTypes.CHANTERELLE));
    public static final Block CHANTERELLE_WALL_SIGN = registerBlockWithoutBlockItem("chanterelle_wall_sign",new ModWallSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_WALL_SIGN), ModWoodTypes.CHANTERELLE));
    public static final Block CHANTERELLE_HANGING_SIGN = registerBlockWithoutBlockItem("chanterelle_hanging_sign",new ModHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_HANGING_SIGN), ModWoodTypes.CHANTERELLE));
    public static final Block CHANTERELLE_HANGING_WALL_SIGN = registerBlockWithoutBlockItem("chanterelle_hanging_wall_sign",new ModWallHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.CHANTERELLE));
    public static final Block CHANTERELLE_BLOCK = registerBlock("chanterelle_block",new MushroomBlock(FabricBlockSettings.copy(Blocks.RED_MUSHROOM_BLOCK).instrument(Instrument.BASS).strength(0.2f).sounds(BlockSoundGroup.WOOD).burnable()));
    //ENOKI
    public static final Block ENOKI_MUSHROOM = registerBlock("enoki_mushroom",new MushroomPlantBlock(FabricBlockSettings.copy(Blocks.BROWN_MUSHROOM).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS).postProcess(Blocks::always).pistonBehavior(PistonBehavior.DESTROY), TreeConfiguredFeatures.HUGE_RED_MUSHROOM));
    public static final Block POTTED_ENOKI_MUSHROOM = registerBlock("potted_enoki_mushroom",new FlowerPotBlock(ENOKI_MUSHROOM, FabricBlockSettings.copy(Blocks.POTTED_RED_MUSHROOM)));
    public static final Block ENOKI_STEM = registerBlock("enoki_stem",new PillarBlock(FabricBlockSettings.copy(Blocks.MUSHROOM_STEM)));
    public static final Block STRIPPED_ENOKI_STEM = registerBlock("stripped_enoki_stem",new PillarBlock(FabricBlockSettings.copy(Blocks.MUSHROOM_STEM)));
    public static final Block ENOKI_PLANKS = registerBlock("enoki_planks",new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)));
    public static final Block ENOKI_SLAB = registerBlock("enoki_slab",new SlabBlock(FabricBlockSettings.copy(Blocks.OAK_SLAB)));
    public static final Block ENOKI_STAIRS = registerBlock("enoki_stairs",new StairsBlock(ModBlocks.ENOKI_PLANKS.getDefaultState(), FabricBlockSettings.copy(Blocks.OAK_PLANKS)));
    public static final Block ENOKI_BUTTON = registerBlock("enoki_button",new ButtonBlock(FabricBlockSettings.copy(Blocks.OAK_BUTTON), BlockSetType.OAK, 10, true));
    public static final Block ENOKI_PRESSURE_PLATE = registerBlock("enoki_pressure_plate",new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copy(Blocks.OAK_PLANKS), BlockSetType.OAK));
    public static final Block ENOKI_FENCE = registerBlock("enoki_fence",new FenceBlock(FabricBlockSettings.copy(Blocks.OAK_FENCE)));
    public static final Block ENOKI_FENCE_GATE = registerBlock("enoki_fence_gate",new FenceGateBlock(FabricBlockSettings.copy(Blocks.OAK_FENCE), WoodType.OAK));
    public static final Block ENOKI_DOOR = registerBlock("enoki_door",new DoorBlock(FabricBlockSettings.copy(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block ENOKI_TRAPDOOR = registerBlock("enoki_trapdoor",new TrapdoorBlock(FabricBlockSettings.copy(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block ENOKI_SIGN = registerBlockWithoutBlockItem("enoki_sign",new ModStandingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN), ModWoodTypes.ENOKI));
    public static final Block ENOKI_WALL_SIGN = registerBlockWithoutBlockItem("enoki_wall_sign",new ModWallSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_WALL_SIGN), ModWoodTypes.ENOKI));
    public static final Block ENOKI_HANGING_SIGN = registerBlockWithoutBlockItem("enoki_hanging_sign",new ModHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_HANGING_SIGN), ModWoodTypes.ENOKI));
    public static final Block ENOKI_HANGING_WALL_SIGN = registerBlockWithoutBlockItem("enoki_hanging_wall_sign",new ModWallHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.ENOKI));
    public static final Block ENOKI_BLOCK = registerBlock("enoki_block",new MushroomBlock(FabricBlockSettings.copy(Blocks.RED_MUSHROOM_BLOCK).instrument(Instrument.BASS).strength(0.2f).sounds(BlockSoundGroup.WOOD).burnable()));
    //DECORATION
    public static final Block BLACK_CANDY_CANE_BLOCK = registerBlock("black_candy_cane_block",new Block(FabricBlockSettings.copy(Blocks.WHITE_CONCRETE)));
    public static final Block BLACK_CANDY_CANE_STAIRS = registerBlock("black_candy_cane_stairs",new StairsBlock(ModBlocks.BLACK_CANDY_CANE_BLOCK.getDefaultState(), FabricBlockSettings.copy(Blocks.WHITE_CONCRETE)));
    public static final Block BLACK_CANDY_CANE_SLAB = registerBlock("black_candy_cane_slab",new SlabBlock(FabricBlockSettings.copy(Blocks.STONE_SLAB)));
    public static final Block BROWN_CANDY_CANE_BLOCK = registerBlock("brown_candy_cane_block",new Block(FabricBlockSettings.copy(Blocks.WHITE_CONCRETE)));
    public static final Block BROWN_CANDY_CANE_STAIRS = registerBlock("brown_candy_cane_stairs",new StairsBlock(ModBlocks.BROWN_CANDY_CANE_BLOCK.getDefaultState(), FabricBlockSettings.copy(Blocks.WHITE_CONCRETE)));
    public static final Block BROWN_CANDY_CANE_SLAB = registerBlock("brown_candy_cane_slab",new SlabBlock(FabricBlockSettings.copy(Blocks.STONE_SLAB)));
    public static final Block BLUE_CANDY_CANE_BLOCK = registerBlock("blue_candy_cane_block",new Block(FabricBlockSettings.copy(Blocks.WHITE_CONCRETE)));
    public static final Block BLUE_CANDY_CANE_STAIRS = registerBlock("blue_candy_cane_stairs",new StairsBlock(ModBlocks.BLUE_CANDY_CANE_BLOCK.getDefaultState(), FabricBlockSettings.copy(Blocks.WHITE_CONCRETE)));
    public static final Block BLUE_CANDY_CANE_SLAB = registerBlock("blue_candy_cane_slab",new SlabBlock(FabricBlockSettings.copy(Blocks.STONE_SLAB)));
    public static final Block CYAN_CANDY_CANE_BLOCK = registerBlock("cyan_candy_cane_block",new Block(FabricBlockSettings.copy(Blocks.WHITE_CONCRETE)));
    public static final Block CYAN_CANDY_CANE_STAIRS = registerBlock("cyan_candy_cane_stairs",new StairsBlock(ModBlocks.CYAN_CANDY_CANE_BLOCK.getDefaultState(), FabricBlockSettings.copy(Blocks.WHITE_CONCRETE)));
    public static final Block CYAN_CANDY_CANE_SLAB = registerBlock("cyan_candy_cane_slab",new SlabBlock(FabricBlockSettings.copy(Blocks.STONE_SLAB)));
    public static final Block GRAY_CANDY_CANE_BLOCK = registerBlock("gray_candy_cane_block",new Block(FabricBlockSettings.copy(Blocks.WHITE_CONCRETE)));
    public static final Block GRAY_CANDY_CANE_STAIRS = registerBlock("gray_candy_cane_stairs",new StairsBlock(ModBlocks.GRAY_CANDY_CANE_BLOCK.getDefaultState(), FabricBlockSettings.copy(Blocks.WHITE_CONCRETE)));
    public static final Block GRAY_CANDY_CANE_SLAB = registerBlock("gray_candy_cane_slab",new SlabBlock(FabricBlockSettings.copy(Blocks.STONE_SLAB)));
    public static final Block GREEN_CANDY_CANE_BLOCK = registerBlock("green_candy_cane_block",new Block(FabricBlockSettings.copy(Blocks.WHITE_CONCRETE)));
    public static final Block GREEN_CANDY_CANE_STAIRS = registerBlock("green_candy_cane_stairs",new StairsBlock(ModBlocks.GREEN_CANDY_CANE_BLOCK.getDefaultState(), FabricBlockSettings.copy(Blocks.WHITE_CONCRETE)));
    public static final Block GREEN_CANDY_CANE_SLAB = registerBlock("green_candy_cane_slab",new SlabBlock(FabricBlockSettings.copy(Blocks.STONE_SLAB)));
    public static final Block LIGHT_BLUE_CANDY_CANE_BLOCK = registerBlock("light_blue_candy_cane_block",new Block(FabricBlockSettings.copy(Blocks.WHITE_CONCRETE)));
    public static final Block LIGHT_BLUE_CANDY_CANE_STAIRS = registerBlock("light_blue_candy_cane_stairs",new StairsBlock(ModBlocks.LIGHT_BLUE_CANDY_CANE_BLOCK.getDefaultState(), FabricBlockSettings.copy(Blocks.WHITE_CONCRETE)));
    public static final Block LIGHT_BLUE_CANDY_CANE_SLAB = registerBlock("light_blue_candy_cane_slab",new SlabBlock(FabricBlockSettings.copy(Blocks.STONE_SLAB)));
    public static final Block LIGHT_GRAY_CANDY_CANE_BLOCK = registerBlock("light_gray_candy_cane_block",new Block(FabricBlockSettings.copy(Blocks.WHITE_CONCRETE)));
    public static final Block LIGHT_GRAY_CANDY_CANE_STAIRS = registerBlock("light_gray_candy_cane_stairs",new StairsBlock(ModBlocks.LIGHT_GRAY_CANDY_CANE_BLOCK.getDefaultState(), FabricBlockSettings.copy(Blocks.WHITE_CONCRETE)));
    public static final Block LIGHT_GRAY_CANDY_CANE_SLAB = registerBlock("light_gray_candy_cane_slab",new SlabBlock(FabricBlockSettings.copy(Blocks.STONE_SLAB)));
    public static final Block LIME_CANDY_CANE_BLOCK = registerBlock("lime_candy_cane_block",new Block(FabricBlockSettings.copy(Blocks.WHITE_CONCRETE)));
    public static final Block LIME_CANDY_CANE_STAIRS = registerBlock("lime_candy_cane_stairs",new StairsBlock(ModBlocks.LIME_CANDY_CANE_BLOCK.getDefaultState(), FabricBlockSettings.copy(Blocks.WHITE_CONCRETE)));
    public static final Block LIME_CANDY_CANE_SLAB = registerBlock("lime_candy_cane_slab",new SlabBlock(FabricBlockSettings.copy(Blocks.STONE_SLAB)));
    public static final Block MAGENTA_CANDY_CANE_BLOCK = registerBlock("magenta_candy_cane_block",new Block(FabricBlockSettings.copy(Blocks.WHITE_CONCRETE)));
    public static final Block MAGENTA_CANDY_CANE_STAIRS = registerBlock("magenta_candy_cane_stairs",new StairsBlock(ModBlocks.MAGENTA_CANDY_CANE_BLOCK.getDefaultState(), FabricBlockSettings.copy(Blocks.WHITE_CONCRETE)));
    public static final Block MAGENTA_CANDY_CANE_SLAB = registerBlock("magenta_candy_cane_slab",new SlabBlock(FabricBlockSettings.copy(Blocks.STONE_SLAB)));
    public static final Block ORANGE_CANDY_CANE_BLOCK = registerBlock("orange_candy_cane_block",new Block(FabricBlockSettings.copy(Blocks.WHITE_CONCRETE)));
    public static final Block ORANGE_CANDY_CANE_STAIRS = registerBlock("orange_candy_cane_stairs",new StairsBlock(ModBlocks.ORANGE_CANDY_CANE_BLOCK.getDefaultState(), FabricBlockSettings.copy(Blocks.WHITE_CONCRETE)));
    public static final Block ORANGE_CANDY_CANE_SLAB = registerBlock("orange_candy_cane_slab",new SlabBlock(FabricBlockSettings.copy(Blocks.STONE_SLAB)));
    public static final Block PINK_CANDY_CANE_BLOCK = registerBlock("pink_candy_cane_block",new Block(FabricBlockSettings.copy(Blocks.WHITE_CONCRETE)));
    public static final Block PINK_CANDY_CANE_STAIRS = registerBlock("pink_candy_cane_stairs",new StairsBlock(ModBlocks.PINK_CANDY_CANE_BLOCK.getDefaultState(), FabricBlockSettings.copy(Blocks.WHITE_CONCRETE)));
    public static final Block PINK_CANDY_CANE_SLAB = registerBlock("pink_candy_cane_slab",new SlabBlock(FabricBlockSettings.copy(Blocks.STONE_SLAB)));
    public static final Block PURPLE_CANDY_CANE_BLOCK = registerBlock("purple_candy_cane_block",new Block(FabricBlockSettings.copy(Blocks.WHITE_CONCRETE)));
    public static final Block PURPLE_CANDY_CANE_STAIRS = registerBlock("purple_candy_cane_stairs",new StairsBlock(ModBlocks.PURPLE_CANDY_CANE_BLOCK.getDefaultState(), FabricBlockSettings.copy(Blocks.WHITE_CONCRETE)));
    public static final Block PURPLE_CANDY_CANE_SLAB = registerBlock("purple_candy_cane_slab",new SlabBlock(FabricBlockSettings.copy(Blocks.STONE_SLAB)));
    public static final Block RED_CANDY_CANE_BLOCK = registerBlock("red_candy_cane_block",new Block(FabricBlockSettings.copy(Blocks.WHITE_CONCRETE)));
    public static final Block RED_CANDY_CANE_STAIRS = registerBlock("red_candy_cane_stairs",new StairsBlock(ModBlocks.RED_CANDY_CANE_BLOCK.getDefaultState(), FabricBlockSettings.copy(Blocks.WHITE_CONCRETE)));
    public static final Block RED_CANDY_CANE_SLAB = registerBlock("red_candy_cane_slab",new SlabBlock(FabricBlockSettings.copy(Blocks.STONE_SLAB)));
    public static final Block WHITE_CANDY_CANE_BLOCK = registerBlock("white_candy_cane_block",new Block(FabricBlockSettings.copy(Blocks.WHITE_CONCRETE)));
    public static final Block WHITE_CANDY_CANE_STAIRS = registerBlock("white_candy_cane_stairs",new StairsBlock(ModBlocks.WHITE_CANDY_CANE_BLOCK.getDefaultState(), FabricBlockSettings.copy(Blocks.WHITE_CONCRETE)));
    public static final Block WHITE_CANDY_CANE_SLAB = registerBlock("white_candy_cane_slab",new SlabBlock(FabricBlockSettings.copy(Blocks.STONE_SLAB)));
    public static final Block YELLOW_CANDY_CANE_BLOCK = registerBlock("yellow_candy_cane_block",new Block(FabricBlockSettings.copy(Blocks.WHITE_CONCRETE)));
    public static final Block YELLOW_CANDY_CANE_STAIRS = registerBlock("yellow_candy_cane_stairs",new StairsBlock(ModBlocks.BLACK_CANDY_CANE_BLOCK.getDefaultState(), FabricBlockSettings.copy(Blocks.WHITE_CONCRETE)));
    public static final Block YELLOW_CANDY_CANE_SLAB = registerBlock("yellow_candy_cane_slab",new SlabBlock(FabricBlockSettings.copy(Blocks.STONE_SLAB)));
    public static final Block YELLOW_PETALS = registerBlock("yellow_petals", new FlowerbedBlock(FabricBlockSettings.copy(Blocks.PINK_PETALS)));
    public static final Block CLOVERS = registerBlock("clovers", new FlowerbedBlock(FabricBlockSettings.copy(Blocks.PINK_PETALS)));
    public static final Block YELLOW_PLUMERIA = registerBlock("yellow_plumeria",new FlowerBlock(StatusEffects.REGENERATION, 4, FabricBlockSettings.copy(Blocks.POPPY)));
    public static final Block POTTED_YELLOW_PLUMERIA = registerBlock("potted_yellow_plumeria",new FlowerPotBlock(YELLOW_PLUMERIA, FabricBlockSettings.copy(Blocks.POTTED_POPPY)));
    public static final Block RED_PLUMERIA = registerBlock("red_plumeria",new FlowerBlock(StatusEffects.REGENERATION, 4, FabricBlockSettings.copy(Blocks.POPPY)));
    public static final Block POTTED_RED_PLUMERIA = registerBlock("potted_red_plumeria",new FlowerPotBlock(RED_PLUMERIA, FabricBlockSettings.copy(Blocks.POTTED_POPPY)));
    public static final Block BLUE_PLUMERIA = registerBlock("blue_plumeria",new FlowerBlock(StatusEffects.REGENERATION, 4, FabricBlockSettings.copy(Blocks.POPPY)));
    public static final Block POTTED_BLUE_PLUMERIA = registerBlock("potted_blue_plumeria",new FlowerPotBlock(BLUE_PLUMERIA, FabricBlockSettings.copy(Blocks.POTTED_POPPY)));
    public static final Block WHITE_PLUMERIA = registerBlock("white_plumeria",new FlowerBlock(StatusEffects.REGENERATION, 4, FabricBlockSettings.copy(Blocks.POPPY)));
    public static final Block POTTED_WHITE_PLUMERIA = registerBlock("potted_white_plumeria",new FlowerPotBlock(WHITE_PLUMERIA, FabricBlockSettings.copy(Blocks.POTTED_POPPY)));
    public static final Block ROSE = registerBlock("rose",new FlowerBlock(StatusEffects.REGENERATION, 4, FabricBlockSettings.copy(Blocks.POPPY)));
    public static final Block POTTED_ROSE = registerBlock("potted_rose",new FlowerPotBlock(ROSE, FabricBlockSettings.copy(Blocks.POTTED_POPPY)));
    public static final Block CYAN_ROSE = registerBlock("cyan_rose",new FlowerBlock(StatusEffects.REGENERATION, 4, FabricBlockSettings.copy(Blocks.POPPY)));
    public static final Block POTTED_CYAN_ROSE = registerBlock("potted_cyan_rose",new FlowerPotBlock(CYAN_ROSE, FabricBlockSettings.copy(Blocks.POTTED_POPPY)));
    public static final Block GINGERBREAD_BLOCK = registerBlock("gingerbread_block",new Block(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final Block GINGERBREAD_STAIRS = registerBlock("gingerbread_stairs",new StairsBlock(ModBlocks.GINGERBREAD_BLOCK.getDefaultState(), FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final Block GINGERBREAD_SLAB = registerBlock("gingerbread_slab",new SlabBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final Block FROSTED_GINGERBREAD_BLOCK = registerBlock("frosted_gingerbread_block",new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final Block SMOOTH_GINGERBREAD_BLOCK = registerBlock("smooth_gingerbread_block",new Block(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final Block SMOOTH_GINGERBREAD_STAIRS = registerBlock("smooth_gingerbread_stairs",new StairsBlock(ModBlocks.SMOOTH_GINGERBREAD_BLOCK.getDefaultState(), FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final Block SMOOTH_GINGERBREAD_SLAB = registerBlock("smooth_gingerbread_slab",new SlabBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final Block FROSTED_SMOOTH_GINGERBREAD_BLOCK = registerBlock("frosted_smooth_gingerbread_block",new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final Block GINGERBREAD_DOOR = registerBlock("gingerbread_door",new DoorBlock(FabricBlockSettings.copy(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block GINGERBREAD_TRAPDOOR = registerBlock("gingerbread_trapdoor",new TrapdoorBlock(FabricBlockSettings.copy(Blocks.OAK_DOOR), BlockSetType.OAK));
    //ADDITIONAL VANILLA BLOCKS
    public static final Block WROUGHT_IRON_BLOCK = registerBlock("wrought_iron_block",new Block(FabricBlockSettings.copy(Blocks.IRON_BLOCK)));
    public static final Block WROUGHT_IRON_STAIRS = registerBlock("wrought_iron_stairs",new StairsBlock(ModBlocks.WROUGHT_IRON_BLOCK.getDefaultState(), FabricBlockSettings.copy(Blocks.IRON_BLOCK)));
    public static final Block WROUGHT_IRON_SLAB = registerBlock("wrought_iron_slab",new SlabBlock(FabricBlockSettings.copy(Blocks.IRON_BLOCK)));
    public static final Block WROUGHT_IRON_WALL = registerBlock("wrought_iron_wall",new WallBlock(FabricBlockSettings.copy(Blocks.IRON_BLOCK)));
    public static final Block WROUGHT_IRON_BUTTON = registerBlock("wrought_iron_button",new ButtonBlock(FabricBlockSettings.copy(Blocks.STONE_BUTTON), BlockSetType.STONE, 10, false));
    public static final Block WROUGHT_IRON_PRESSURE_PLATE = registerBlock("wrought_iron_pressure_plate",new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copy(Blocks.STONE), BlockSetType.STONE));
    public static final Block SMOOTH_WROUGHT_IRON_BLOCK = registerBlock("smooth_wrought_iron_block",new Block(FabricBlockSettings.copy(Blocks.IRON_BLOCK)));
    public static final Block SMOOTH_WROUGHT_IRON_STAIRS = registerBlock("smooth_wrought_iron_stairs",new StairsBlock(ModBlocks.SMOOTH_WROUGHT_IRON_BLOCK.getDefaultState(), FabricBlockSettings.copy(Blocks.IRON_BLOCK)));
    public static final Block SMOOTH_WROUGHT_IRON_SLAB = registerBlock("smooth_wrought_iron_slab",new SlabBlock(FabricBlockSettings.copy(Blocks.IRON_BLOCK)));
    public static final Block SMOOTH_WROUGHT_IRON_WALL = registerBlock("smooth_wrought_iron_wall",new WallBlock(FabricBlockSettings.copy(Blocks.IRON_BLOCK)));
    public static final Block SMOOTH_WROUGHT_IRON_BUTTON = registerBlock("smooth_wrought_iron_button",new ButtonBlock(FabricBlockSettings.copy(Blocks.STONE_BUTTON), BlockSetType.STONE, 10, false));
    public static final Block SMOOTH_WROUGHT_IRON_PRESSURE_PLATE = registerBlock("smooth_wrought_iron_pressure_plate",new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copy(Blocks.STONE), BlockSetType.STONE));
    public static final Block WROUGHT_IRON_BARS = registerBlock("wrought_iron_bars",new PaneBlock(FabricBlockSettings.create().requiresTool().strength(5.0f, 6.0f).sounds(BlockSoundGroup.METAL).copy(Blocks.IRON_BARS).nonOpaque()));
    public static final Block WROUGHT_IRON_DOOR = registerBlock("wrought_iron_door",new DoorBlock(FabricBlockSettings.copy(Blocks.IRON_DOOR), BlockSetType.IRON));
    public static final Block WROUGHT_IRON_TRAPDOOR = registerBlock("wrought_iron_trapdoor",new TrapdoorBlock(FabricBlockSettings.copy(Blocks.IRON_TRAPDOOR), BlockSetType.IRON));
    //STONES
    public static final Block POLISHED_CALCITE = registerBlock("polished_calcite",new Block(FabricBlockSettings.copy(Blocks.CALCITE)));
    public static final Block POLISHED_CALCITE_STAIRS = registerBlock("polished_calcite_stairs",new StairsBlock(ModBlocks.POLISHED_CALCITE.getDefaultState(), FabricBlockSettings.copy(Blocks.CALCITE)));
    public static final Block POLISHED_CALCITE_SLAB = registerBlock("polished_calcite_slab",new SlabBlock(FabricBlockSettings.copy(Blocks.CALCITE)));
    public static final Block POLISHED_CALCITE_WALL = registerBlock("polished_calcite_wall",new WallBlock(FabricBlockSettings.copy(Blocks.CALCITE)));
    public static final Block CALCITE_BRICKS = registerBlock("calcite_bricks",new Block(FabricBlockSettings.copy(Blocks.CALCITE)));
    public static final Block CHISELED_CALCITE_BRICKS = registerBlock("chiseled_calcite_bricks",new Block(FabricBlockSettings.copy(Blocks.CALCITE)));
    public static final Block CALCITE_BRICK_STAIRS = registerBlock("calcite_brick_stairs",new StairsBlock(ModBlocks.CALCITE_BRICKS.getDefaultState(), FabricBlockSettings.copy(Blocks.CALCITE)));
    public static final Block CALCITE_BRICK_SLAB = registerBlock("calcite_brick_slab",new SlabBlock(FabricBlockSettings.copy(Blocks.CALCITE)));
    public static final Block CALCITE_BRICK_WALL = registerBlock("calcite_brick_wall",new WallBlock(FabricBlockSettings.copy(Blocks.CALCITE)));
    public static final Block DIORITE_BRICKS = registerBlock("diorite_bricks",new Block(FabricBlockSettings.copy(Blocks.DIORITE)));
    public static final Block CHISELED_DIORITE_BRICKS = registerBlock("chiseled_diorite_bricks",new Block(FabricBlockSettings.copy(Blocks.DIORITE)));
    public static final Block DIORITE_BRICK_STAIRS = registerBlock("diorite_brick_stairs",new StairsBlock(ModBlocks.DIORITE_BRICKS.getDefaultState(), FabricBlockSettings.copy(Blocks.DIORITE)));
    public static final Block DIORITE_BRICK_SLAB = registerBlock("diorite_brick_slab",new SlabBlock(FabricBlockSettings.copy(Blocks.DIORITE)));
    public static final Block DIORITE_BRICK_WALL = registerBlock("diorite_brick_wall",new WallBlock(FabricBlockSettings.copy(Blocks.DIORITE)));
    public static final Block ANDESITE_BRICKS = registerBlock("andesite_bricks",new Block(FabricBlockSettings.copy(Blocks.ANDESITE)));
    public static final Block CHISELED_ANDESITE_BRICKS = registerBlock("chiseled_andesite_bricks",new Block(FabricBlockSettings.copy(Blocks.ANDESITE)));
    public static final Block ANDESITE_BRICK_STAIRS = registerBlock("andesite_brick_stairs",new StairsBlock(ModBlocks.DIORITE_BRICKS.getDefaultState(), FabricBlockSettings.copy(Blocks.ANDESITE)));
    public static final Block ANDESITE_BRICK_SLAB = registerBlock("andesite_brick_slab",new SlabBlock(FabricBlockSettings.copy(Blocks.ANDESITE)));
    public static final Block ANDESITE_BRICK_WALL = registerBlock("andesite_brick_wall",new WallBlock(FabricBlockSettings.copy(Blocks.ANDESITE)));
    public static final Block GRANITE_BRICKS = registerBlock("granite_bricks",new Block(FabricBlockSettings.copy(Blocks.GRANITE)));
    public static final Block CHISELED_GRANITE_BRICKS = registerBlock("chiseled_granite_bricks",new Block(FabricBlockSettings.copy(Blocks.GRANITE)));
    public static final Block GRANITE_BRICK_STAIRS = registerBlock("granite_brick_stairs",new StairsBlock(ModBlocks.GRANITE_BRICKS.getDefaultState(), FabricBlockSettings.copy(Blocks.ANDESITE)));
    public static final Block GRANITE_BRICK_SLAB = registerBlock("granite_brick_slab",new SlabBlock(FabricBlockSettings.copy(Blocks.GRANITE)));
    public static final Block GRANITE_BRICK_WALL = registerBlock("granite_brick_wall",new WallBlock(FabricBlockSettings.copy(Blocks.GRANITE)));
    //CROPS
    public static final Block GINGER_CROP = registerBlockWithoutBlockItem("ginger_crop",new GingerCropBlock(FabricBlockSettings.copyOf(Blocks.CARROTS)));
    //LIGHTS
    public static final Block BLACK_LIGHTS = registerBlock("black_lights",new LadderBlock(FabricBlockSettings.copy(Blocks.LADDER).luminance(state -> 7)));
    public static final Block BLUE_LIGHTS = registerBlock("blue_lights",new LadderBlock(FabricBlockSettings.copy(Blocks.LADDER).luminance(state -> 7)));
    public static final Block BROWN_LIGHTS = registerBlock("brown_lights",new LadderBlock(FabricBlockSettings.copy(Blocks.LADDER).luminance(state -> 7)));
    public static final Block CYAN_LIGHTS = registerBlock("cyan_lights",new LadderBlock(FabricBlockSettings.copy(Blocks.LADDER).luminance(state -> 7)));
    public static final Block GRAY_LIGHTS = registerBlock("gray_lights",new LadderBlock(FabricBlockSettings.copy(Blocks.LADDER).luminance(state -> 7)));
    public static final Block GREEN_LIGHTS = registerBlock("green_lights",new LadderBlock(FabricBlockSettings.copy(Blocks.LADDER).luminance(state -> 7)));
    public static final Block LIGHT_BLUE_LIGHTS = registerBlock("light_blue_lights",new LadderBlock(FabricBlockSettings.copy(Blocks.LADDER).luminance(state -> 7)));
    public static final Block LIGHT_GRAY_LIGHTS = registerBlock("light_gray_lights",new LadderBlock(FabricBlockSettings.copy(Blocks.LADDER).luminance(state -> 7)));
    public static final Block LIME_LIGHTS = registerBlock("lime_lights",new LadderBlock(FabricBlockSettings.copy(Blocks.LADDER).luminance(state -> 7)));
    public static final Block MAGENTA_LIGHTS = registerBlock("magenta_lights",new LadderBlock(FabricBlockSettings.copy(Blocks.LADDER).luminance(state -> 7)));
    public static final Block ORANGE_LIGHTS = registerBlock("orange_lights",new LadderBlock(FabricBlockSettings.copy(Blocks.LADDER).luminance(state -> 7)));
    public static final Block PINK_LIGHTS = registerBlock("pink_lights",new LadderBlock(FabricBlockSettings.copy(Blocks.LADDER).luminance(state -> 7)));
    public static final Block PURPLE_LIGHTS = registerBlock("purple_lights",new LadderBlock(FabricBlockSettings.copy(Blocks.LADDER).luminance(state -> 7)));
    public static final Block RED_LIGHTS = registerBlock("red_lights",new LadderBlock(FabricBlockSettings.copy(Blocks.LADDER).luminance(state -> 7)));
    public static final Block WHITE_LIGHTS = registerBlock("white_lights",new LadderBlock(FabricBlockSettings.copy(Blocks.LADDER).luminance(state -> 7)));
    public static final Block YELLOW_LIGHTS = registerBlock("yellow_lights",new LadderBlock(FabricBlockSettings.copy(Blocks.LADDER).luminance(state -> 7)));




    public static void init() {
        for (Wood wood : Wood.values()) {
            for (DyeColor color :DyeColor.values()) {
                String name = color.getName() + "_" + wood.name().toLowerCase(Locale.ROOT);
                BlockSet set = new BlockSet(wood, color);
            }
        }
    }


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(NormalityMod.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(NormalityMod.MOD_ID, name),    new BlockItem(block, new FabricItemSettings()));
    }
    private static Block registerBlockWithoutBlockItem(String name, Block block) {
        return Registry.register(Registries.BLOCK, new Identifier(NormalityMod.MOD_ID, name), block);
    }
    public static void registerModBlocks() {
        NormalityMod.LOGGER.info("Registering ModBlocks for" + NormalityMod.MOD_ID);
    }
}
