package net.seska.normality.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.CarrotsBlock;
import net.minecraft.block.CropBlock;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Items;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.loot.condition.TableBonusLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.predicate.StatePredicate;
import net.seska.normality.block.ModBlocks;
import net.seska.normality.block.custom.GingerCropBlock;
import net.seska.normality.item.ModItems;

public class ModBlockLootTableProvider extends FabricBlockLootTableProvider {
    public ModBlockLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        //RUBY
        addDrop(ModBlocks.RUBY_BLOCK);
        addDrop(ModBlocks.RUBY_ORE, oreDrops(ModBlocks.RUBY_ORE, ModItems.RUBY));
        addDrop(ModBlocks.DEEPSLATE_RUBY_ORE, oreDrops(ModBlocks.DEEPSLATE_RUBY_ORE, ModItems.RUBY));
        //HONEY
        addDrop(ModBlocks.HONEYCOMB_BRICKS);
        addDrop(ModBlocks.HONEYCOMB_BRICK_WALL);
        addDrop(ModBlocks.CRACKED_HONEYCOMB_BRICKS);
        addDrop(ModBlocks.CHISELED_HONEYCOMB_BRICKS);
        addDrop(ModBlocks.CRYSTALLIZED_HONEY_BLOCK);
        addDrop(ModBlocks.HONEYCOMB_BRICK_STAIRS);
        addDrop(ModBlocks.HONEYCOMB_BRICK_SLAB, slabDrops(ModBlocks.HONEYCOMB_BRICK_SLAB));
        //AMETHYST
        addDrop(ModBlocks.POLISHED_AMETHYST_BLOCK);
        addDrop(ModBlocks.SMOOTH_AMETHYST);
        addDrop(ModBlocks.AMETHYST_BRICKS);
        addDrop(ModBlocks.AMETHYST_BRICK_WALL);
        addDrop(ModBlocks.AMETHYST_BRICK_STAIRS);
        addDrop(ModBlocks.AMETHYST_BRICK_SLAB, slabDrops(ModBlocks.AMETHYST_BRICK_SLAB));
        addDrop(ModBlocks.CRACKED_AMETHYST_BRICKS);
        addDrop(ModBlocks.AMETHYST_PILLAR);
        //HOLLY
        addDrop(ModBlocks.HOLLY_PLANKS);
        addDrop(ModBlocks.HOLLY_STAIRS);
        addDrop(ModBlocks.HOLLY_SLAB, slabDrops(ModBlocks.HOLLY_SLAB));
        addDrop(ModBlocks.HOLLY_BUTTON);
        addDrop(ModBlocks.HOLLY_PRESSURE_PLATE);
        addDrop(ModBlocks.HOLLY_FENCE);
        addDrop(ModBlocks.HOLLY_FENCE_GATE);
        addDrop(ModBlocks.HOLLY_TRAPDOOR);
        addDrop(ModBlocks.HOLLY_DOOR, doorDrops(ModBlocks.HOLLY_DOOR));
        addDrop(ModBlocks.HOLLY_LOG);
        addDrop(ModBlocks.HOLLY_WOOD);
        addDrop(ModBlocks.STRIPPED_HOLLY_WOOD);
        addDrop(ModBlocks.STRIPPED_HOLLY_LOG);
        addDrop(ModBlocks.HOLLY_WOOD_SIGN);
        addDrop(ModBlocks.HOLLY_WOOD_HANGING_SIGN);
        //CHANTERELLE
        addDrop(ModBlocks.CHANTERELLE_PLANKS);
        addDrop(ModBlocks.CHANTERELLE_STAIRS);
        addDrop(ModBlocks.CHANTERELLE_SLAB, slabDrops(ModBlocks.CHANTERELLE_SLAB));
        addDrop(ModBlocks.CHANTERELLE_BUTTON);
        addDrop(ModBlocks.CHANTERELLE_PRESSURE_PLATE);
        addDrop(ModBlocks.CHANTERELLE_FENCE);
        addDrop(ModBlocks.CHANTERELLE_FENCE_GATE);
        addDrop(ModBlocks.CHANTERELLE_TRAPDOOR);
        addDrop(ModBlocks.CHANTERELLE_DOOR, doorDrops(ModBlocks.CHANTERELLE_DOOR));
        addDrop(ModBlocks.CHANTERELLE_STEM);
        addDrop(ModBlocks.STRIPPED_CHANTERELLE_STEM);
        addDrop(ModBlocks.CHANTERELLE_SIGN);
        addDrop(ModBlocks.CHANTERELLE_HANGING_SIGN);
        addDrop(ModBlocks.CHANTERELLE_MUSHROOM);
        //ENOKI
        addDrop(ModBlocks.ENOKI_PLANKS);
        addDrop(ModBlocks.ENOKI_STAIRS);
        addDrop(ModBlocks.ENOKI_SLAB, slabDrops(ModBlocks.ENOKI_SLAB));
        addDrop(ModBlocks.ENOKI_BUTTON);
        addDrop(ModBlocks.ENOKI_PRESSURE_PLATE);
        addDrop(ModBlocks.ENOKI_FENCE);
        addDrop(ModBlocks.ENOKI_FENCE_GATE);
        addDrop(ModBlocks.ENOKI_TRAPDOOR);
        addDrop(ModBlocks.ENOKI_DOOR, doorDrops(ModBlocks.ENOKI_DOOR));
        addDrop(ModBlocks.ENOKI_STEM);
        addDrop(ModBlocks.STRIPPED_ENOKI_STEM);
        addDrop(ModBlocks.ENOKI_SIGN);
        addDrop(ModBlocks.ENOKI_HANGING_SIGN);
        addDrop(ModBlocks.ENOKI_MUSHROOM);
        //DECORATIONS
        addDrop(ModBlocks.BLACK_CANDY_CANE_BLOCK);
        addDrop(ModBlocks.BLACK_CANDY_CANE_STAIRS);
        addDrop(ModBlocks.BLACK_CANDY_CANE_SLAB, slabDrops(ModBlocks.BLACK_CANDY_CANE_SLAB));
        addDrop(ModBlocks.BLUE_CANDY_CANE_BLOCK);
        addDrop(ModBlocks.BLUE_CANDY_CANE_STAIRS);
        addDrop(ModBlocks.BLUE_CANDY_CANE_SLAB, slabDrops(ModBlocks.BLUE_CANDY_CANE_SLAB));
        addDrop(ModBlocks.BROWN_CANDY_CANE_BLOCK);
        addDrop(ModBlocks.BROWN_CANDY_CANE_STAIRS);
        addDrop(ModBlocks.BROWN_CANDY_CANE_SLAB, slabDrops(ModBlocks.BROWN_CANDY_CANE_SLAB));
        addDrop(ModBlocks.CYAN_CANDY_CANE_BLOCK);
        addDrop(ModBlocks.CYAN_CANDY_CANE_STAIRS);
        addDrop(ModBlocks.CYAN_CANDY_CANE_SLAB, slabDrops(ModBlocks.CYAN_CANDY_CANE_SLAB));
        addDrop(ModBlocks.GRAY_CANDY_CANE_BLOCK);
        addDrop(ModBlocks.GRAY_CANDY_CANE_STAIRS);
        addDrop(ModBlocks.GRAY_CANDY_CANE_SLAB, slabDrops(ModBlocks.GRAY_CANDY_CANE_SLAB));
        addDrop(ModBlocks.GREEN_CANDY_CANE_BLOCK);
        addDrop(ModBlocks.GREEN_CANDY_CANE_STAIRS);
        addDrop(ModBlocks.GREEN_CANDY_CANE_SLAB, slabDrops(ModBlocks.GREEN_CANDY_CANE_SLAB));
        addDrop(ModBlocks.LIGHT_BLUE_CANDY_CANE_BLOCK);
        addDrop(ModBlocks.LIGHT_BLUE_CANDY_CANE_STAIRS);
        addDrop(ModBlocks.LIGHT_BLUE_CANDY_CANE_SLAB, slabDrops(ModBlocks.LIGHT_BLUE_CANDY_CANE_SLAB));
        addDrop(ModBlocks.LIGHT_GRAY_CANDY_CANE_BLOCK);
        addDrop(ModBlocks.LIGHT_GRAY_CANDY_CANE_STAIRS);
        addDrop(ModBlocks.LIGHT_GRAY_CANDY_CANE_SLAB, slabDrops(ModBlocks.LIGHT_GRAY_CANDY_CANE_SLAB));
        addDrop(ModBlocks.LIME_CANDY_CANE_BLOCK);
        addDrop(ModBlocks.LIME_CANDY_CANE_STAIRS);
        addDrop(ModBlocks.LIME_CANDY_CANE_SLAB, slabDrops(ModBlocks.LIME_CANDY_CANE_SLAB));
        addDrop(ModBlocks.MAGENTA_CANDY_CANE_BLOCK);
        addDrop(ModBlocks.MAGENTA_CANDY_CANE_STAIRS);
        addDrop(ModBlocks.MAGENTA_CANDY_CANE_SLAB, slabDrops(ModBlocks.MAGENTA_CANDY_CANE_SLAB));
        addDrop(ModBlocks.ORANGE_CANDY_CANE_BLOCK);
        addDrop(ModBlocks.ORANGE_CANDY_CANE_STAIRS);
        addDrop(ModBlocks.ORANGE_CANDY_CANE_SLAB, slabDrops(ModBlocks.ORANGE_CANDY_CANE_SLAB));
        addDrop(ModBlocks.PINK_CANDY_CANE_BLOCK);
        addDrop(ModBlocks.PINK_CANDY_CANE_STAIRS);
        addDrop(ModBlocks.PINK_CANDY_CANE_SLAB, slabDrops(ModBlocks.PINK_CANDY_CANE_SLAB));
        addDrop(ModBlocks.PURPLE_CANDY_CANE_BLOCK);
        addDrop(ModBlocks.PURPLE_CANDY_CANE_STAIRS);
        addDrop(ModBlocks.PURPLE_CANDY_CANE_SLAB, slabDrops(ModBlocks.PURPLE_CANDY_CANE_SLAB));
        addDrop(ModBlocks.RED_CANDY_CANE_BLOCK);
        addDrop(ModBlocks.RED_CANDY_CANE_STAIRS);
        addDrop(ModBlocks.RED_CANDY_CANE_SLAB, slabDrops(ModBlocks.RED_CANDY_CANE_SLAB));
        addDrop(ModBlocks.WHITE_CANDY_CANE_BLOCK);
        addDrop(ModBlocks.WHITE_CANDY_CANE_STAIRS);
        addDrop(ModBlocks.WHITE_CANDY_CANE_SLAB, slabDrops(ModBlocks.WHITE_CANDY_CANE_SLAB));
        addDrop(ModBlocks.YELLOW_CANDY_CANE_BLOCK);
        addDrop(ModBlocks.YELLOW_CANDY_CANE_STAIRS);
        addDrop(ModBlocks.YELLOW_CANDY_CANE_SLAB, slabDrops(ModBlocks.YELLOW_CANDY_CANE_SLAB));
        addDrop(ModBlocks.GINGERBREAD_BLOCK);
        addDrop(ModBlocks.GINGERBREAD_STAIRS);
        addDrop(ModBlocks.GINGERBREAD_SLAB, slabDrops(ModBlocks.GINGERBREAD_SLAB));
        addDrop(ModBlocks.GINGERBREAD_DOOR, doorDrops(ModBlocks.GINGERBREAD_DOOR));
        addDrop(ModBlocks.GINGERBREAD_TRAPDOOR);
        addDrop(ModBlocks.FROSTED_GINGERBREAD_BLOCK);
        addDrop(ModBlocks.SMOOTH_GINGERBREAD_BLOCK);
        addDrop(ModBlocks.SMOOTH_GINGERBREAD_STAIRS);
        addDrop(ModBlocks.SMOOTH_GINGERBREAD_SLAB, slabDrops(ModBlocks.SMOOTH_GINGERBREAD_SLAB));
        addDrop(ModBlocks.FROSTED_SMOOTH_GINGERBREAD_BLOCK);
        //VANILLA ADDITIONS BLOCKS
        addDrop(ModBlocks.POLISHED_CALCITE);
        addDrop(ModBlocks.POLISHED_CALCITE_STAIRS);
        addDrop(ModBlocks.POLISHED_CALCITE_SLAB, slabDrops(ModBlocks.POLISHED_CALCITE_SLAB));
        addDrop(ModBlocks.POLISHED_CALCITE_WALL);

        addDrop(ModBlocks.CALCITE_BRICKS);
        addDrop(ModBlocks.CALCITE_BRICK_STAIRS);
        addDrop(ModBlocks.CALCITE_BRICK_SLAB, slabDrops(ModBlocks.CALCITE_BRICK_SLAB));
        addDrop(ModBlocks.CALCITE_BRICK_WALL);
        addDrop(ModBlocks.CHISELED_CALCITE_BRICKS);

        addDrop(ModBlocks.DIORITE_BRICKS);
        addDrop(ModBlocks.DIORITE_BRICK_STAIRS);
        addDrop(ModBlocks.DIORITE_BRICK_SLAB, slabDrops(ModBlocks.DIORITE_BRICK_SLAB));
        addDrop(ModBlocks.DIORITE_BRICK_WALL);
        addDrop(ModBlocks.CHISELED_DIORITE_BRICKS);

        addDrop(ModBlocks.GRANITE_BRICKS);
        addDrop(ModBlocks.GRANITE_BRICK_STAIRS);
        addDrop(ModBlocks.GRANITE_BRICK_SLAB, slabDrops(ModBlocks.GRANITE_BRICK_SLAB));
        addDrop(ModBlocks.GRANITE_BRICK_WALL);
        addDrop(ModBlocks.CHISELED_GRANITE_BRICKS);

        addDrop(ModBlocks.ANDESITE_BRICKS);
        addDrop(ModBlocks.ANDESITE_BRICK_STAIRS);
        addDrop(ModBlocks.ANDESITE_BRICK_SLAB, slabDrops(ModBlocks.ANDESITE_BRICK_SLAB));
        addDrop(ModBlocks.ANDESITE_BRICK_WALL);
        addDrop(ModBlocks.CHISELED_ANDESITE_BRICKS);
        //WROUGHT IRON
        addDrop(ModBlocks.SMOOTH_WROUGHT_IRON_BLOCK);
        addDrop(ModBlocks.SMOOTH_WROUGHT_IRON_STAIRS);
        addDrop(ModBlocks.SMOOTH_WROUGHT_IRON_SLAB, slabDrops(ModBlocks.SMOOTH_WROUGHT_IRON_SLAB));
        addDrop(ModBlocks.SMOOTH_WROUGHT_IRON_BUTTON);
        addDrop(ModBlocks.SMOOTH_WROUGHT_IRON_PRESSURE_PLATE);
        addDrop(ModBlocks.SMOOTH_WROUGHT_IRON_WALL);
        addDrop(ModBlocks.WROUGHT_IRON_BLOCK);
        addDrop(ModBlocks.WROUGHT_IRON_BARS);
        addDrop(ModBlocks.WROUGHT_IRON_BUTTON);
        addDrop(ModBlocks.WROUGHT_IRON_PRESSURE_PLATE);
        addDrop(ModBlocks.WROUGHT_IRON_WALL);
        addDrop(ModBlocks.WROUGHT_IRON_DOOR, doorDrops(ModBlocks.WROUGHT_IRON_DOOR));
        addDrop(ModBlocks.WROUGHT_IRON_TRAPDOOR);
        addDrop(ModBlocks.WROUGHT_IRON_STAIRS);
        addDrop(ModBlocks.WROUGHT_IRON_SLAB, slabDrops(ModBlocks.WROUGHT_IRON_SLAB));
        //LIGHTS
        addDrop(ModBlocks.RED_LIGHTS);
        addDrop(ModBlocks.GREEN_LIGHTS);
        addDrop(ModBlocks.BLUE_LIGHTS);
        addDrop(ModBlocks.ORANGE_LIGHTS);
        addDrop(ModBlocks.BLACK_LIGHTS);
        addDrop(ModBlocks.BROWN_LIGHTS);
        addDrop(ModBlocks.CYAN_LIGHTS);
        addDrop(ModBlocks.GRAY_LIGHTS);
        addDrop(ModBlocks.LIGHT_BLUE_LIGHTS);
        addDrop(ModBlocks.LIGHT_GRAY_LIGHTS);
        addDrop(ModBlocks.LIME_LIGHTS);
        addDrop(ModBlocks.MAGENTA_LIGHTS);
        addDrop(ModBlocks.PINK_LIGHTS);
        addDrop(ModBlocks.PURPLE_LIGHTS);
        addDrop(ModBlocks.WHITE_LIGHTS);
        addDrop(ModBlocks.YELLOW_LIGHTS);
        //PLUMERIA
        addDrop(ModBlocks.RED_PLUMERIA);
        addDrop(ModBlocks.BLUE_PLUMERIA);
        addDrop(ModBlocks.WHITE_PLUMERIA);
        addDrop(ModBlocks.YELLOW_PLUMERIA);
        addDrop(ModBlocks.YELLOW_PETALS, flowerbedDrops(ModBlocks.YELLOW_PETALS));
        //CROPS



        BlockStatePropertyLootCondition.Builder builder2 = BlockStatePropertyLootCondition.builder(ModBlocks.GINGER_CROP).properties(StatePredicate.Builder.create().exactMatch(CropBlock.AGE, 6));
        this.addDrop(ModBlocks.GINGER_CROP, this.cropDrops(ModBlocks.GINGER_CROP, ModItems.GINGER_ROOT, ModItems.GINGER_ROOT, builder2));


        }
    }
