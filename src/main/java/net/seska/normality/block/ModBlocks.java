package net.seska.normality.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.seska.normality.NormalityMod;

public class ModBlocks {

    public static final Block HONEYCOMB_BRICKS = registerBlock("honeycomb_bricks",
            new Block(FabricBlockSettings.copy(Blocks.HONEYCOMB_BLOCK)));
    public static final Block CRACKED_HONEYCOMB_BRICKS = registerBlock("cracked_honeycomb_bricks",
            new Block(FabricBlockSettings.copy(Blocks.HONEYCOMB_BLOCK)));
    public static final Block CHISELED_HONEYCOMB_BRICKS = registerBlock("chiseled_honeycomb_bricks",
            new Block(FabricBlockSettings.copy(Blocks.HONEYCOMB_BLOCK)));
    public static final Block CRYSTALLIZED_HONEY_BLOCK = registerBlock("crystallized_honey_block",
            new Block(FabricBlockSettings.copy(Blocks.HONEYCOMB_BLOCK)));
    public static final Block RUBY_ORE = registerBlock("ruby_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copy(Blocks.EMERALD_ORE), UniformIntProvider.create(3,6)));
    public static final Block DEEPSLATE_RUBY_ORE = registerBlock("deepslate_ruby_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copy(Blocks.DEEPSLATE_EMERALD_ORE), UniformIntProvider.create(3,6)));
    public static final Block RUBY_BLOCK = registerBlock("ruby_block",
            new Block(FabricBlockSettings.copy(Blocks.EMERALD_BLOCK)));
    public static final Block POLISHED_AMETHYST_BLOCK = registerBlock("polished_amethyst_block",
            new Block(FabricBlockSettings.copy(Blocks.AMETHYST_BLOCK)));
    public static final Block AMETHYST_BRICKS = registerBlock("amethyst_bricks",
            new Block(FabricBlockSettings.copy(Blocks.AMETHYST_BLOCK)));

    public static final Block CRACKED_AMETHYST_BRICKS = registerBlock("cracked_amethyst_bricks",
            new Block(FabricBlockSettings.copy(Blocks.AMETHYST_BLOCK)));
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(NormalityMod.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(NormalityMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }
    public static void registerModBlocks() {
        NormalityMod.LOGGER.info("Registering ModBlocks for" + NormalityMod.MOD_ID);
    }
}
